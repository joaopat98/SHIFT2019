from django.contrib.auth.models import User
from django.db import models


class Profile(models.Model):
    user = models.OneToOneField(User, models.CASCADE)
    cc = models.IntegerField()
    emergency_contact = models.IntegerField()


class UserDose(models.Model):
    date = models.DateTimeField()
    taken = models.BooleanField(default=False)
    user = models.ForeignKey(User, related_name="doses", on_delete=models.CASCADE)
    full_part = models.IntegerField(null=True)
    fraction_numerator = models.IntegerField(null=True)
    fraction_denominator = models.IntegerField(null=True)

    def __str__(self):
        s = " pills"
        date = str(self.date) + ", "
        if self.full_part == 0:
            return date + str(self.fraction_numerator) + "/" + str(self.fraction_denominator) + s
        elif self.fraction_numerator in (None, 0) or self.fraction_denominator in (None, 0):
            return date + str(self.full_part) + s
        else:
            return date + str(self.full_part) + " and " + str(self.fraction_numerator) + "/" + str(
                self.fraction_denominator) + s

    def serialize(self):
        return {
            "id": self.id,
            "date": self.date,
            "taken": self.taken,
            "full_part": self.full_part,
            "fraction_numerator": self.fraction_numerator,
            "fraction_denominator": self.fraction_denominator
        }


class Risk(models.Model):
    choices = (
        (1, 'Cafeína'),
        (2, 'Álcool'),
        (3, 'Romã'),
        (4, 'Gordura'),
        (5, 'Sal'),
    )

    food = models.PositiveSmallIntegerField(choices=choices)
    dose = models.ForeignKey(UserDose, models.CASCADE)
