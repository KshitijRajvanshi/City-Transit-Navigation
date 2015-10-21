package com.example.transport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class ArtistActivity extends Activity implements OnClickListener  {

	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab6);
		View DButton = findViewById(R.id.btn5);
        DButton.setOnClickListener(this);
        View AButton = findViewById(R.id.btn6);
       AButton.setOnClickListener(this);
        View TAButton = findViewById(R.id.btn7);
        TAButton.setOnClickListener(this);
        View EButton = findViewById(R.id.btn8);
        EButton.setOnClickListener(this);
       
    }

	@Override
	
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn5:
			Intent i = new Intent(this, DFare.class);
			startActivity(i);
			break;	
	}
			switch (v.getId())
			{ 
			case R.id.btn6:
			Intent i = new Intent(this,AFare.class);
			startActivity(i);
			break;
			}
			switch (v.getId())
			{
			case R.id.btn7:
				Intent i = new Intent(this,TFare.class);
				startActivity(i);
				break;
				
			}
			switch (v.getId())
			{
			case R.id.btn8:
				Intent i = new Intent(this,EFare.class);
				startActivity(i);
				break;
				
			}
			

	}

	
}