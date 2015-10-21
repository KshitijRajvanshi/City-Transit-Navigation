package com.example.transport;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
public class TFare extends Activity {
	 Button     button11;
	 EditText   txtbox11;	
	 CheckBox c11,c21;


	 /** Called when the activity is first created. */
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	     super.onCreate(savedInstanceState);
	     setContentView(R.layout.tfare);
	     txtbox11=  (EditText) findViewById(R.id.EditText011);
	     button11 = (Button) findViewById(R.id.Button011);
	     
	     c11=(CheckBox) findViewById(R.id.CheckBox011);
	        c21=(CheckBox) findViewById(R.id.CheckBox021);

	     button11.setOnClickListener(new clicker());    
	 }
	 class  clicker implements Button.OnClickListener
	 {           
	 public void onClick(View v)
	    {
	     String b;
	     Double vi,vi1,vi2;
	     Double kms;
	    Double f11;
	     Double ks=1.0;
	     Double zs=20.0;
	     Double ds=11.0;
	     Double waits=30.0;
	     Double nights=0.25;
	    
	     b =  txtbox11.getText().toString(); 
	    kms=Double.parseDouble(b)-ks;
	    f11= kms * ds ;
	    vi = f11+zs;
	    if (c11.isChecked())
	    {
	    	vi1 = vi + waits;
	    	Toast.makeText(getApplicationContext(),"Fare is:Rs. " + vi1.toString(),  Toast.LENGTH_LONG)
			.show();
	    	
	    }
	    else if (c21.isChecked() )
	    {
	    	vi2= vi + (nights*vi);
	    	Toast.makeText(getApplicationContext(),"Fare is:Rs. " + vi2.toString(),  Toast.LENGTH_LONG)
			.show();   

	    	
	    }
	      
	    else
	    	  
	    Toast.makeText(getApplicationContext(),"Fare is:Rs. " + vi.toString(),  Toast.LENGTH_LONG)
		.show();
	    }
	 }
	}
