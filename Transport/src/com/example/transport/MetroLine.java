package com.example.transport;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MetroLine extends Activity implements OnClickListener {

	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.metroline);
		View RButton = findViewById(R.id.Button01);
        RButton.setOnClickListener(this);
        RButton.getBackground().setColorFilter(Color.RED,PorterDuff.Mode.MULTIPLY);
        View YButton = findViewById(R.id.Button02);
        YButton.setOnClickListener(this);
        YButton.getBackground().setColorFilter(Color.YELLOW,PorterDuff.Mode.MULTIPLY);
        View BButton = findViewById(R.id.Button03);
        BButton.setOnClickListener(this);
        BButton.getBackground().setColorFilter(Color.BLUE,PorterDuff.Mode.MULTIPLY);
        View GButton = findViewById(R.id.Button04);
       GButton.setOnClickListener(this);
       GButton.getBackground().setColorFilter(Color.GREEN,PorterDuff.Mode.MULTIPLY);
        View VButton = findViewById(R.id.Button05);
        VButton.setOnClickListener(this);
        VButton.getBackground().setColorFilter(0x847000FF,PorterDuff.Mode.MULTIPLY);
        View OButton = findViewById(R.id.Button06);
        OButton.setOnClickListener(this);
        OButton.getBackground().setColorFilter(0xFFFF8000,PorterDuff.Mode.MULTIPLY);
       
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.Button01:
		Intent i = new Intent(this, RedLine.class);
		startActivity(i);
		break;	
}
		switch (v.getId())
		{ 
		case R.id.Button02:
		Intent i = new Intent(this,YellowLine.class);
		startActivity(i);
		break;
		}
		switch (v.getId())
		{
		case R.id.Button03:
			Intent i= new Intent(this,BlueLine.class);
			startActivity(i);
			break;
	}
	switch (v.getId())	{
	case R.id.Button04:
		Intent i=new Intent(this,GreenLine.class);
		startActivity(i);
		break;
	}
	switch(v.getId())
	{case R.id.Button05:
		Intent i=new Intent(this,VioletLine.class);
		startActivity(i);
	}
	switch(v.getId())
	{case R.id.Button06:
		Intent i=new Intent(this,OrangeLine.class);
		startActivity(i);
	}
	
	}
		}
	

	