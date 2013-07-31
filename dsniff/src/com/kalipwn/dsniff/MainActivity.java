package com.kalipwn.dsniff;

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
		i.putExtra("jackpal.androidterm.iInitialCommand", "su \rbootkali \rcd /opt/pwnpad/captures/sniffed \rsh /opt/pwnpad/scripts/dsniff.sh");
		startActivity(i);
		finish();
	}
}