package com.twincoders.twinpush.sdk.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.twincoders.twinpush.sdk.DefaultTwinPushSDK;
import com.twincoders.twinpush.sdk.TwinPushSDK;
import com.twincoders.twinpush.sdk.logging.Ln;

public class BootReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Ln.i("Received boot intent");
        TwinPushSDK twinPush = TwinPushSDK.getInstance(context);
		// Launch location service
		if (twinPush.isMonitoringLocationChanges()) {
            ((DefaultTwinPushSDK) twinPush).registerForLocationUpdates();
        }
	}

}
