package com.example.transport;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;


public class TabLayout extends TabActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main1);

		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost

		

		Intent intent2 = new Intent(this, SetupActivity.class);
		tabHost.addTab(tabHost
				.newTabSpec("Fare Chart")
				.setIndicator("Fare Chart", res.getDrawable(R.drawable.ic_tab_setup))
				.setContent(intent2));
		Intent intent = new Intent(this, MainActivity.class);
		tabHost.addTab(tabHost.newTabSpec("Route Details")
				.setIndicator("Route Details", res.getDrawable(R.drawable.ic_tab_main))
				.setContent(intent));
		tabHost.setCurrentTab(0);
	
		Intent intent3 = new Intent(this, ArtistsActivity.class);
		tabHost.addTab(tabHost
				.newTabSpec("Metro Info")
				.setIndicator("Metro Info", res.getDrawable(R.drawable.ic_tab_artists))
				.setContent(intent3));
		tabHost.setCurrentTab(0);
		

		// Set tabs Colors
		tabHost.setBackgroundColor(Color.BLACK);
		tabHost.getTabWidget().setBackgroundColor(Color.BLACK);

	}
}


