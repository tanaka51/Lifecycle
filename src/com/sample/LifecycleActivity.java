package com.sample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class LifecycleActivity extends Activity {
	private static final String TAG = "LifecycleActivity";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i(TAG, "onCreate called");
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	Log.i(TAG, "onStart called");
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	Log.i(TAG, "onRestrat called");
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.i(TAG, "onResume called");
    }
    
    @Override
    protected void onPause() {
    	Log.i(TAG, "onPause called");
    	super.onPause();
    }
    
    @Override
    protected void onStop() {
    	Log.i(TAG, "onStop called");
    	super.onStop();
    }
    
    @Override
    protected void onDestroy() {
    	Log.i(TAG, "onDestroy called");
    	super.onDestroy();
    }
}