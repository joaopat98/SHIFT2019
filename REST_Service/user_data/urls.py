from django.urls import path
from .views import *

urlpatterns = [
    path("<str:username>/dose/<int:dose_id>/take", take),
    path("<str:username>/dose", get_doses),
    path("<str:username>/dose/<int:dose_id>/risks", register_risks),
]