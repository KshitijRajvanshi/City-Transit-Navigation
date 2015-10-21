package com.example.transport;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import android.widget.Toast;
public class AFare extends Activity {
Button     button1;
EditText   txtbox1;


CheckBox c1,c2;



/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.afare);
    txtbox1=  (EditText) findViewById(R.id.EditText01);
    button1 = (Button) findViewById(R.id.Button01);
    
    c1=(CheckBox) findViewById(R.id.CheckBox01);
       c2=(CheckBox) findViewById(R.id.CheckBox02);

    button1.setOnClickListener(new clicker());    
}
class  clicker implements Button.OnClickListener
{           
public void onClick(View v)
   {
    String a;
    Double vis,vis1,vis2;
    Double km;
   Double f1;
    Double k=2.0;
    Double z=19.0;
    Double d=6.5;
    Double wait=30.0;
    Double night=0.25;
   
    a =  txtbox1.getText().toString(); 
   km=Double.parseDouble(a)-k;
   f1= km * d ;
   vis = f1+z;
   if (c1.isChecked())
   {
   	vis1 = vis + wait;
   	Toast.makeText(getApplicationContext(),"Fare is: Rs. " + vis1.toString(),  Toast.LENGTH_LONG)
		.show();
   	
   }
   else if (c2.isChecked() )
   {
   	vis2= vis + (night*vis);
   	Toast.makeText(getApplicationContext(),"Fare is: Rs. " + vis2.toString(),  Toast.LENGTH_LONG)
		.show();   

   	
   }
     
   else
   	  
   Toast.makeText(getApplicationContext(),"Fare is: Rs. " + vis.toString(),  Toast.LENGTH_LONG)
	.show();
   }
}
}
