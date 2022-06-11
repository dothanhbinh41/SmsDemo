package com.example.smsdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SmsListener extends BroadcastReceiver {
    static {
        System.loadLibrary("smsdemo");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        onReceived(intent);
    }
     public native   void onReceived(Intent intent);
}