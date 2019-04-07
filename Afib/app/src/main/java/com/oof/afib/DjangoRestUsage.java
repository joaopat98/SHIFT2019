package com.oof.afib;
import android.content.Context;
import android.content.Intent;

import org.json.*;
import com.loopj.android.http.*;

import cz.msebera.android.httpclient.Header;


public class DjangoRestUsage {
    private Context mainContext;

    public DjangoRestUsage(Context mainContext) {
        this.mainContext = mainContext;
    }

    public void getNewestPlans() {
        HttpUtils.get("tdb/tdb.json", null, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                // If the response is JSONObject instead of expected JSONArray
                Intent i = new Intent(mainContext, HomepageActivity.class);
                i.putExtra("json", response.toString());
                mainContext.startActivity(i);
            }
        });
    }
}
