from django.contrib import admin
from django.contrib.auth.admin import UserAdmin

from .models import *


class ProfileInline(admin.StackedInline):
    model = Profile
    can_delete = False
    verbose_name_plural = 'Profile'
    fk_name = 'user'


class DosesInline(admin.TabularInline):
    model = UserDose
    can_delete = True
    fk_name = 'user'


class RisksInline(admin.TabularInline):
    model = Risk
    can_delete = True
    fk_name = 'dose'


class DoseAdmin(admin.ModelAdmin):
    inlines = (RisksInline,)

    def get_inline_instances(self, request, obj=None):
        if not obj:
            return list()
        return super(DoseAdmin, self).get_inline_instances(request, obj)


class CustomUserAdmin(UserAdmin):
    inlines = (ProfileInline, DosesInline)

    def get_inline_instances(self, request, obj=None):
        if not obj:
            return list()
        return super(CustomUserAdmin, self).get_inline_instances(request, obj)


admin.site.unregister(User)
admin.site.register(User, CustomUserAdmin)

admin.site.register(UserDose, DoseAdmin)
