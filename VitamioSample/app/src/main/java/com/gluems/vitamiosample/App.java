package com.gluems.vitamiosample;

import android.app.Application;
import android.util.Log;

import io.vov.vitamio.Vitamio;

/**
 * @Author glumes
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        try {

            Vitamio.isInitialized(this);
        } catch (Exception e) {
            Log.d("MainActivity", e.getMessage());
        }
    }
}
