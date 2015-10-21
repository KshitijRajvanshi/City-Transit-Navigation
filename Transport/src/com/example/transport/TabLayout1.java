package com.example.transport;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;


public class TabLayout1 extends TabActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);

		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost

		Intent intent4 = new Intent(this, MainsActivity.class);
		tabHost.addTab(tabHost.newTabSpec("DTC route")
				.setIndicator("DTC route", res.getDrawable(R.drawable.ic_tab_mains))
				.setContent(intent4));

		Intent intent5 = new Intent(this,SetupsActivity.class);
		tabHost.addTab(tabHost
				.newTabSpec("DTC BRoute")
				.setIndicator("DTC BRoute", res.getDrawable(R.drawable.ic_tab_setups))
				.setContent(intent5));
		tabHost.setCurrentTab(0);
		Intent intent6 = new Intent(this, ArtistActivity.class);
		tabHost.addTab(tabHost
				.newTabSpec("DTC/CAB info")
				.setIndicator("DTC/CAB Info", res.getDrawable(R.drawable.ic_tab_artist))
				.setContent(intent6));
		tabHost.setCurrentTab(0);
		

		// Set tabs Colors
		tabHost.setBackgroundColor(Color.BLACK);
		tabHost.getTabWidget().setBackgroundColor(Color.BLACK);

	}
}
