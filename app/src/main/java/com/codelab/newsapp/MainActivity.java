package com.codelab.newsapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private Object request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getRequest("https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%3D2502265&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=");

//        new RequestTask().execute("https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%3D2502265&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=");
    }

    public void getRequest(String uri) {
    }


    class RequestTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... uri) {

            for (long i = 0; i < Long.MAX_VALUE; i++) {

            }


            return "";
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            Response.Query query = new Gson().fromJson(result, Response.Query.class);

        }
    }

}
