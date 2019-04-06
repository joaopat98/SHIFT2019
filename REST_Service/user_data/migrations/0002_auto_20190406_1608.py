# Generated by Django 2.2 on 2019-04-06 16:08

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('user_data', '0001_initial'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='risk',
            name='user',
        ),
        migrations.AddField(
            model_name='risk',
            name='dose',
            field=models.ForeignKey(default=1, on_delete=django.db.models.deletion.CASCADE, to='user_data.UserDose'),
            preserve_default=False,
        ),
    ]