package com.kalipwn.kismet;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity 
{
	@Override
	protected void onCreate (Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		Intent i = new Intent("jackpal.androidterm.RUN_SCRIPT");
		i.addCategory(Intent.CATEGORY_DEFAULT);
		i.putExtra("jackpal.androidterm.iInitialCommand", "su \rbootkali \rcd /opt/pwnpad/captures/kismet \r(socat TCP:127.0.0.1:4352 PTY,link=/tmp/gps & gpsd -n /tmp/gps) & kismet");
		startActivity(i);
		finish();
	}
}