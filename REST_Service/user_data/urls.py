from django.urls import path
from .views import *

urlpatterns = [
    path("<int:user_id>/dose/<int:dose_id>/take", take),
    path("<int:user_id>/dose", get_doses),
    path("<int:user_id>/dose/<int:dose_id>/risks", register_risks),
]