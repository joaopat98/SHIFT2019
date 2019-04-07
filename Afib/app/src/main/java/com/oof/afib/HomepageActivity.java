package com.oof.afib;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomepageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String jsonextra = getIntent().getStringExtra("json");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        try{
            JSONArray json = new JSONArray(jsonextra);

            for (int i = 0; i<json.length(); i++){
                JSONObject aux = json.getJSONObject(i);
                Date date = dateFormat.parse((String) aux.get("date"));
                long unixTime = date.getTime();
                scheduleNotification(this, unixTime, i);
            }
        }
        catch (Exception e){
            // xD
            e.printStackTrace();
            return;
        }
    }
    public void scheduleNotification(Context context, long timestamp, int notificationId) {
        String CHANNEL_ID = "my_channel_" + Integer.toString(notificationId);
        CharSequence name = CHANNEL_ID;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, importance);
        }

        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle("Scheduled Notification");
        builder.setContentText("aaaaaaaaaaaaa");
        builder.setSmallIcon(R.drawable.um);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            builder.setChannelId(CHANNEL_ID);
        }
        Notification notification = builder.build();

        Intent notificationIntent = new Intent(this, MyNotificationPublisher.class);
        notificationIntent.putExtra(MyNotificationPublisher.NOTIFICATION_ID, notificationId);
        notificationIntent.putExtra(MyNotificationPublisher.NOTIFICATION, notification);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, notificationId, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP, timestamp, pendingIntent);
    }
}
