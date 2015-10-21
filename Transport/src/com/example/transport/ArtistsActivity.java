package com.example.transport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class ArtistsActivity extends Activity implements OnClickListener {

	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab3);
	View MButton=findViewById(R.id.btn91);
	MButton.setOnClickListener(this);
		View FButton = findViewById(R.id.btn1);
        FButton.setOnClickListener(this);
        View TButton = findViewById(R.id.btn2);
       TButton.setOnClickListener(this);
        View TIButton = findViewById(R.id.btn3);
        TIButton.setOnClickListener(this);
        View SButton = findViewById(R.id.btn4);
        SButton.setOnClickListener(this);
       
    }

	@Override
	
		public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn91:
		Intent i = new Intent(this, MetroLine.class);
		startActivity(i);
		break;	
}
			switch (v.getId()) {
			case R.id.btn1:
			Intent i = new Intent(this, Feeder.class);
			startActivity(i);
			break;	
	}
			switch (v.getId())
			{ 
			case R.id.btn2:
			Intent i = new Intent(this,Timing.class);
			startActivity(i);
			break;
			}
			switch (v.getId())
			{
			case R.id.btn3:
				Intent i = new Intent(this,Ticket.class);
				startActivity(i);
				break;
				
			}
			switch (v.getId())
			{
			case R.id.btn4:
				Intent i = new Intent(this,Station.class);
				startActivity(i);
				break;
				
			}
			}

	}

	
