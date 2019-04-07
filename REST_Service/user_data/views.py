import json

from django.http import *
from django.shortcuts import render
from django.views.decorators.csrf import csrf_exempt

from .models import *


@csrf_exempt
def take(request, user_id, dose_id):
    dose = UserDose.objects.filter(id=dose_id).first()
    if dose is not None:
        dose.taken = True
        dose.save()
        return HttpResponse()
    else:
        return HttpResponseBadRequest()


@csrf_exempt
def get_doses(request, user_id):
    lst = list(map(lambda dose: dose.serialize(), User.objects.filter(id=user_id).first().doses.all()))
    return JsonResponse(lst, safe=False)


@csrf_exempt
def register_risks(request, user_id, dose_id):
    risks = json.loads(request.body)
    dose = UserDose.objects.filter(id=dose_id).first()
    if dose is not None:
        for risk in risks:
            exists = Risk.objects.filter(dose=dose, food=risk).first() is not None
            if not exists:
                Risk.objects.create(dose=dose, food=risk)
        return HttpResponse()
    return HttpResponseBadRequest()
