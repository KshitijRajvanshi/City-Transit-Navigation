package com.example.transport;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SetupsActivity extends Activity implements OnClickListener{
	static Spinner spi,spi2;
	String Bus;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab5);
		 spi = (Spinner) findViewById(R.id.spinner10);
	        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
	                this, R.array.dtc_array, android.R.layout.simple_spinner_item);
	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        spi.setAdapter(adapter);
	        
	       
	       spi2 = (Spinner) findViewById(R.id.spinner00);
	        ArrayAdapter<CharSequence> adapters = ArrayAdapter.createFromResource(
	                this, R.array.dtc1_array, android.R.layout.simple_spinner_item);
	        adapters.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        spi2.setAdapter(adapters);
	        
	        View Buttons = findViewById(R.id.bdtc);
	       Buttons.setOnClickListener( this); 
	}
	 public void toastState( String s, String s1,String Bus) {
	   		if (s != null) {
	   			String desc =  "\nSource: " 
	   			+ s + "\nDestination: " + s1 + "\nBus No: " + Bus;
	   			Toast.makeText(getBaseContext(), desc, Toast.LENGTH_LONG)
	   					.show();
	   		}
	   	}

	   	public void onItemSelected(AdapterView<?> parent, View view, int position,
	   			long id) {
	   		String s=spi.getSelectedItem().toString();
	   		String s1=spi2.getSelectedItem().toString();
	   	
	   		if (s == s1) {
	   			Bus="Same Location Selected";
	   			toastState( s, s1, Bus);
	   		}
	   	}

	   	public void onNothingSelected(AdapterView<?> parent) {
	   	}
	   	
	   	public void onClick(View view) {
	   		String source=spi.getSelectedItem().toString();
	   		String destination=spi2.getSelectedItem().toString();
	   		String Bus1=null;
	   		
	   		if (source.equals("Old Sectt") && destination.equals("Central Sectt")) 
	   		{   Bus1="120 number is a direct bus";
	   			toastState( source, destination,Bus1);
	   		}
	   		else
	   		if (source.equals("Old Sectt") && destination.equals("Kashmere Gate")) 
	   			{   Bus1=" 1 number is a direct bus";
	   				toastState( source, destination,Bus1);
	   			}
	   		else
		   		if (source.equals("Old Sectt") && destination.equals("Shivaji Stadium")) 
		   			{   Bus1=" 104 number is a direct bus";
		   				toastState( source, destination,Bus1);
		   			}else
		   		   		if (source.equals("Old Sectt") && destination.equals("Adarsh nagar")) 
			   			{   Bus1=" 101 number is a direct bus";
			   				toastState( source, destination,Bus1);
			   			}else
			   		   		if (source.equals("Old Sectt") && destination.equals("Nizamuddin R.S")) 
				   			{   Bus1=" 101 number is a direct bus";
				   				toastState( source, destination,Bus1);
				   			}else
				   		   		if (source.equals("Old Sectt") && destination.equals("Supreme Court")) 
					   			{   Bus1=" 101 number is a direct bus";
					   				toastState( source, destination,Bus1);
					   			}else
					   		   		if (source.equals("Old Sectt") && destination.equals("Red Fort")) 
						   			{   Bus1=" 101 number is a direct bus";
						   				toastState( source, destination,Bus1);
						   			}else
						   		   		if (source.equals("Old Sectt") && destination.equals("Mori Gate")) 
							   			{   Bus1=" 103 number is a direct bus";
							   				toastState( source, destination,Bus1);
							   			}else
							   		   		if (source.equals("Old Sectt") && destination.equals("Mandi House")) 
								   			{   Bus1=" 104 number is a direct bus";
								   				toastState( source, destination,Bus1);
								   			}else
								   		   		if (source.equals("Old Sectt") && destination.equals("ITO")) 
									   			{   Bus1=" 118 number is a direct bus";
									   				toastState( source, destination,Bus1);
									   			}else
									   		   		if (source.equals("Old Sectt") && destination.equals("Mother Dairy")) 
										   			{   Bus1=" 118 number is a direct bus";
										   				toastState( source, destination,Bus1);
										   			}else
										   		   		if (source.equals("Old Sectt") && destination.equals("Anand Vihar")) 
											   			{   Bus1=" 143 number is a direct bus";
											   				toastState( source, destination,Bus1);
											   			}
										   		   	else if (destination.equals("Old Sectt") && source.equals("Central Sectt"))
										   		 {   Bus1="120 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }
										   		 else
										   		 if (destination.equals("Old Sectt") && source.equals("Kashmere Gate"))
										   		 {   Bus1=" 1 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }
										   		 else
										   		 if (destination.equals("Old Sectt") && source.equals("Shivaji Stadium"))
										   		 {   Bus1=" 104 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }else
										   		 if (destination.equals("Old Sectt") && source.equals("Adarsh nagar"))
										   		 {   Bus1=" 101 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }else
										   		 if (destination.equals("Old Sectt") && source.equals("Nizamuddin R.S"))
										   		 {   Bus1=" 101 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }else
										   		 if (destination.equals("Old Sectt") && source.equals("Supreme Court"))
										   		 {   Bus1=" 101 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }else
										   		 if (destination.equals("Old Sectt") && source.equals("Red Fort"))
										   		 {   Bus1=" 101 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }else
										   		 if (destination.equals("Old Sectt") && source.equals("Mori Gate"))
										   		 {   Bus1=" 103 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }else
										   		 if (destination.equals("Old Sectt") && source.equals("Mandi House"))
										   		 {   Bus1=" 104 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }else
										   		 if (destination.equals("Old Sectt") && source.equals("ITO"))
										   		 {   Bus1=" 118 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }else
										   		 if (destination.equals("Old Sectt") && source.equals("Mother Dairy"))
										   		 {   Bus1=" 118 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }else
										   		 if (destination.equals("Old Sectt") && source.equals("Anand Vihar"))
										   		 {   Bus1=" 118 number is a direct bus";
										   		 toastState( source, destination,Bus1);
										   		 }
										   		else if (destination.equals("Kashmere Gate") && source.equals("Central Sectt"))
										   		{   Bus1="120 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}
										   		
										   		else
										   		if (destination.equals("Kashmere Gate") && source.equals("Shivaji Stadium"))
										   		{   Bus1=" 139 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Kashmere Gate") && source.equals("Adarsh nagar"))
										   		{   Bus1=" 101 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Kashmere Gate") && source.equals("Nizamuddin R.S"))
										   		{   Bus1=" 101 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Kashmere Gate") && source.equals("Supreme Court"))
										   		{   Bus1=" 101 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Kashmere Gate") && source.equals("Red Fort"))
										   		{   Bus1=" 101 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Kashmere Gate") && source.equals("Mori Gate"))
										   		{   Bus1=" Take 103 number bus till Adarsh Nagar and then take 101 upto Kashmere Gate";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Kashmere Gate") && source.equals("Mandi House"))
										   		{   Bus1=" 120 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Kashmere Gate") && source.equals("ITO"))
										   		{   Bus1=" 118 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Kashmere Gate") && source.equals("Mother Dairy"))
										   		{   Bus1=" 118 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Kashmere Gate") && source.equals("Anand Vihar"))
										   		{   Bus1=" 143 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}
										   		else if (source.equals("Kashmere Gate") && destination.equals("Central Sectt"))
										   		{   Bus1="120 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}
										   		
										   		else
										   		if (source.equals("Kashmere Gate") && destination.equals("Shivaji Stadium"))
										   		{   Bus1=" 139 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Kashmere Gate") && destination.equals("Adarsh nagar"))
										   		{   Bus1=" 101 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Kashmere Gate") && destination.equals("Nizamuddin R.S"))
										   		{   Bus1=" 101 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Kashmere Gate") && destination.equals("Supreme Court"))
										   		{   Bus1=" 101 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Kashmere Gate") && destination.equals("Red Fort"))
										   		{   Bus1=" 101 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Kashmere Gate") && destination.equals("Mori Gate"))
										   		{   Bus1=" Take 101 number bus till Adarsh Nagar and then take 103 upto Mori Gate ";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Kashmere Gate") && destination.equals("Mandi House"))
										   		{   Bus1=" 120 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Kashmere Gate") && destination.equals("ITO"))
										   		{   Bus1=" 118 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Kashmere Gate") && destination.equals("Mother Dairy"))
										   		{   Bus1=" 118 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Kashmere Gate") && destination.equals("Anand Vihar"))
										   		{   Bus1=" 143 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}

										   		else if (source.equals("Shivaji Stadium") && destination.equals("Central Sectt"))
										   		{   Bus1="10 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}
										   		
										   		else
										   		if (source.equals("Shivaji Stadium") && destination.equals("Adarsh nagar"))
										   		{   Bus1=" 100 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Shivaji Stadium") && destination.equals("Nizamuddin R.S"))
										   		{   Bus1=" 156 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Shivaji Stadium") && destination.equals("Supreme Court"))
										   		{   Bus1=" Take 156 bus number till Nizamuddin and then 101 till Supreme Court";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Shivaji Stadium") && destination.equals("Red Fort"))
										   		{   Bus1=" 104 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Shivaji Stadium") && destination.equals("Mori Gate"))
										   		{   Bus1=" Take 104 number bus till Old Sectt and then take 103 upto Mori Gate ";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Shivaji Stadium") && destination.equals("Mandi House"))
										   		{   Bus1=" 104 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Shivaji Stadium") && destination.equals("ITO"))
										   		{   Bus1=" 316 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Shivaji Stadium") && destination.equals("Mother Dairy"))
										   		{   Bus1=" 328 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (source.equals("Shivaji Stadium") && destination.equals("Anand Vihar"))
										   		{   Bus1=" 73 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}
										   		else if (destination.equals("Shivaji Stadium") && source.equals("Central Sectt"))
										   		{   Bus1="10 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}
										   		
										   		else
										   		if (destination.equals("Shivaji Stadium") && source.equals("Adarsh nagar"))
										   		{   Bus1=" 100 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Shivaji Stadium") && source.equals("Nizamuddin R.S"))
										   		{   Bus1=" 156 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Shivaji Stadium") && source.equals("Supreme Court"))
										   		{   Bus1=" Take 101 bus number till Nizamuddin and then 156 till Shivaji Stadium";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Shivaji Stadium") && source.equals("Red Fort"))
										   		{   Bus1=" 104 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Shivaji Stadium") && source.equals("Mori Gate"))
										   		{   Bus1=" Take 103 number bus till Old Sectt and then take 104 upto Shivaji Stadium";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Shivaji Stadium") && source.equals("Mandi House"))
										   		{   Bus1=" 104 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Shivaji Stadium") && source.equals("ITO"))
										   		{   Bus1=" 316 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Shivaji Stadium") && source.equals("Mother Dairy"))
										   		{   Bus1=" 328 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}else
										   		if (destination.equals("Shivaji Stadium") && source.equals("Anand Vihar"))
										   		{   Bus1=" 73 number is a direct bus";
										   		toastState( source, destination,Bus1);
										   		}
										   		else
										   			if (source.equals("Mori Gate") && destination.equals("Mandi House"))
										   			{   Bus1=" 34,632 number are direct bus";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (source.equals("Mori Gate") && destination.equals("ITO"))
										   			{   Bus1=" Take 118EXT number till ShakarPur and the take 703 till ITO";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (source.equals("Mori Gate") && destination.equals("Mother Dairy"))
										   			{   Bus1=" 118EXT number is a direct bus";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (source.equals("Mori Gate") && destination.equals("Anand Vihar"))
										   			{   Bus1="221 number is a direct bus";
										   			toastState( source, destination,Bus1);
										   			}
										   			else if (source.equals("Mori Gate") && destination.equals("Central Sectt"))
										   			{   Bus1="729,706 number are direct bus";
										   			toastState( source, destination,Bus1);
										   			}

										   			else if (destination.equals("Mori Gate") && source.equals("Central Sectt"))
										   			{   Bus1=" 729,706 number are direct bus";
										   			toastState( source, destination,Bus1);
										   			}
										   			
										   			else
										   			if (destination.equals("Mori Gate") && source.equals("Mandi House"))
										   			{   Bus1=" 34,632 number are direct bus";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (destination.equals("Mori Gate") && source.equals("ITO"))
										   			{   Bus1=" Take 118EXT number till Shakarpur then take 703 to Mori Gate";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (destination.equals("Mori Gate") && source.equals("Mother Dairy"))
										   			{   Bus1=" 118EXT number is a direct bus";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (destination.equals("Mori Gate") && source.equals("Anand Vihar"))
										   			{   Bus1=" 221 number is a direct bus";
										   			toastState( source, destination,Bus1);
										   			}
										   			else if (source.equals("Mandi House") && destination.equals("Central Sectt"))
										   			{   Bus1="740,73 number are direct bus";
										   			toastState( source, destination,Bus1);
										   			}
										   			else
										   			if (source.equals("Mandi House") && destination.equals("ITO"))
										   			{   Bus1=" 740,85 number bus are direct buses";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (source.equals("Mandi House") && destination.equals("Mother Dairy"))
										   			{   Bus1=" 740,85 number bus are direct buses ";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (source.equals("Mandi House") && destination.equals("Anand Vihar"))
										   			{   Bus1="740,85 number bus are direct buses ";
										   			toastState( source, destination,Bus1);
										   			}
										   			else if (destination.equals("Mandi House") && source.equals("Central Sectt"))
										   			{   Bus1=" 740,73 number are direct bus";
										   			toastState( source, destination,Bus1);
										   			}
										   			else
										   			if (destination.equals("Mandi House") && source.equals("ITO"))
										   			{   Bus1=" 740,85 number bus are direct buses ";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (destination.equals("Mandi House") && source.equals("Mother Dairy"))
										   			{   Bus1="740,85 number bus are direct buses ";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (destination.equals("Mandi House") && source.equals("Anand Vihar"))
										   			{   Bus1=" 740,85 number bus are direct buses ";
										   			toastState( source, destination,Bus1);
										   			}
										   			else if (source.equals("ITO") && destination.equals("Central Sectt"))
										   			{   Bus1="740,73 number are direct bus";
										   			toastState( source, destination,Bus1);
										   			}
										   			else
										   			if (source.equals("ITO") && destination.equals("Mother Dairy"))
										   			{   Bus1=" 740,85 number bus are direct buses ";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (source.equals("ITO") && destination.equals("Anand Vihar"))
										   			{   Bus1="740,85 number bus are direct buses ";
										   			toastState( source, destination,Bus1);
										   			}

										   			else if (destination.equals("ITO") && source.equals("Central Sectt"))
										   			{   Bus1=" 740,73 number are direct bus";
										   			toastState( source, destination,Bus1);
										   			}
										   			else
										   			if (destination.equals("ITO") && source.equals("Mother Dairy"))
										   			{   Bus1="740,85 number bus are direct buses ";
										   			toastState( source, destination,Bus1);
										   			}else
										   			if (destination.equals("ITO") && source.equals("Anand Vihar"))
										   			{   Bus1=" 740,85 number bus are direct buses ";
										   			toastState( source, destination,Bus1);
										   			}

										   			else if (source.equals("Mother Dairy") && destination.equals("Central Sectt"))
										   			{   Bus1="740,965 number are direct bus";
										   			toastState( source, destination,Bus1);
										   			}
										   			else
										   			if (source.equals("Mother Dairy") && destination.equals("Anand Vihar"))
										   			{   Bus1="740,85 number bus are direct buses ";
										   			toastState( source, destination,Bus1);
										   			}

										   			else if (destination.equals("Mother Dairy") && source.equals("Central Sectt"))
										   			{   Bus1=" 740,965 number are direct bus";
										   			toastState( source, destination,Bus1);
										   			}
										   			else
										   			if (destination.equals("Mother Dairy") && source.equals("Anand Vihar"))
										   			{   Bus1=" 740,85 number bus are direct buses ";
										   			toastState( source, destination,Bus1);
										   			}
										   			else
											   			if (destination.equals("Central Sectt") && source.equals("Anand Vihar"))
											   			{   Bus1=" 740,73 number bus are direct buses ";
											   			toastState( source, destination,Bus1);
											   			}
											   			else
												   			if (destination.equals("Anand Vihar") && source.equals("Central Sectt"))
												   			{   Bus1=" 740,73 number bus are direct buses ";
												   			toastState( source, destination,Bus1);
												   			}
	   	else
	   		if (source.equals("Red Fort") && destination.equals("Mori Gate"))
	   		{   Bus1=" 118EXT,34 are direct buses";
	   		toastState( source, destination,Bus1);
	   		}else
	   		if (source.equals("Red Fort") && destination.equals("Mandi House"))
	   		{   Bus1=" 34,204 number are direct buses";
	   		toastState( source, destination,Bus1);
	   		}else
	   		if (source.equals("Red Fort") && destination.equals("ITO"))
	   		{   Bus1=" Take 7 number bus till NDPO and then take 73 till ITO";
	   		toastState( source, destination,Bus1);
	   		}else
	   		if (source.equals("Red Fort") && destination.equals("Mother Dairy"))
	   		{   Bus1=" 118,347 number bus are direct buses ";
	   		toastState( source, destination,Bus1);
	   		}else
	   		if (source.equals("Red Fort") && destination.equals("Anand Vihar"))
	   		{   Bus1="Take 7 number bus till ISBT and then take 143 number bus till Anand Vihar ";
	   		toastState( source, destination,Bus1);
	   		}
	   		else if (source.equals("Red Fort") && destination.equals("Central Sectt"))
	   		{   Bus1="260,760 number are direct bus";
	   		toastState( source, destination,Bus1);
	   		}
	   		else if (destination.equals("Red Fort") && source.equals("Central Sectt"))
	   		{   Bus1=" 260,760 number are direct bus";
	   		toastState( source, destination,Bus1);
	   		}
	   		else
	   			if (source.equals("Red Fort") && destination.equals("Mori Gate"))
	   			{   Bus1=" 118EXT,34 are direct buses";
	   			toastState( source, destination,Bus1);
	   			}else
	   			if (source.equals("Red Fort") && destination.equals("Mandi House"))
	   			{   Bus1=" 34,204 number are direct buses";
	   			toastState( source, destination,Bus1);
	   			}else
	   			if (source.equals("Red Fort") && destination.equals("ITO"))
	   			{   Bus1=" Take 7 number bus till NDPO and then take 73 till ITO";
	   			toastState( source, destination,Bus1);
	   			}else
	   			if (source.equals("Red Fort") && destination.equals("Mother Dairy"))
	   			{   Bus1=" 118,347 number bus are direct buses ";
	   			toastState( source, destination,Bus1);
	   			}else
	   			if (source.equals("Red Fort") && destination.equals("Anand Vihar"))
	   			{   Bus1="Take 7 number bus till ISBT and then take 143 number bus till Anand Vihar ";
	   			toastState( source, destination,Bus1);
	   			}
	   			else if (source.equals("Supreme Court") && destination.equals("Central Sectt"))
	   			{   Bus1="Take 26 number bus  till Old Sectt. And then take 120 till Central Sectt";
	   			toastState( source, destination,Bus1);
	   			}
	   			else
	   				if (source.equals("Supreme Court") && destination.equals("Red Fort"))
	   				{   Bus1=" 26,101 are direct bus";
	   				toastState( source, destination,Bus1);
	   				}else
	   				if (source.equals("Supreme Court") && destination.equals("Mori Gate"))
	   				{   Bus1=" 403,411 are direct buses";
	   				toastState( source, destination,Bus1);
	   				}else
	   				if (source.equals("Supreme Court") && destination.equals("Mandi House"))
	   				{   Bus1=" 355,GL-32 number are direct buses";
	   				toastState( source, destination,Bus1);
	   				}else
	   				if (source.equals("Supreme Court") && destination.equals("ITO"))
	   				{   Bus1=" 623 is a direct bus";
	   				toastState( source, destination,Bus1);
	   				}else
	   				if (source.equals("Supreme Court") && destination.equals("Mother Dairy"))
	   				{   Bus1=" Take  26 number bus till DaryaGanj and then take 118 till Mother Dairy";
	   				toastState( source, destination,Bus1);
	   				}else
	   				if (source.equals("Supreme Court") && destination.equals("Anand Vihar"))
	   				{   Bus1="421 is a direct bus ";
	   				toastState( source, destination,Bus1);
	   				}
	   				else
	   					if (destination.equals("Supreme Court") && source.equals("Red Fort"))
	   					{   Bus1=" 26,101 number are direct bus";
	   					toastState( source, destination,Bus1);
	   					}else
	   					if (destination.equals("Supreme Court") && source.equals("Mori Gate"))
	   					{   Bus1=" 403,411 are direct buses";
	   					toastState( source, destination,Bus1);
	   					}else
	   					if (destination.equals("Supreme Court") && source.equals("Mandi House"))
	   					{   Bus1=" 355,GL-32 number are direct bus";
	   					toastState( source, destination,Bus1);
	   					}else
	   					if (destination.equals("Supreme Court") && source.equals("ITO"))
	   					{   Bus1=" 623 is a direct bus ";
	   					toastState( source, destination,Bus1);
	   					}else
	   					if (destination.equals("Supreme Court") && source.equals("Mother Dairy"))
	   					{   Bus1=" Take 118 number bus till DaryaGanj and then take 26 till Supreme Court ";
	   					toastState( source, destination,Bus1);
	   					}else
	   					if (destination.equals("Supreme Court") && source.equals("Anand Vihar"))
	   					{   Bus1=" 421 is a direct bus ";
	   					toastState( source, destination,Bus1);
	   					}
	   					else if (destination.equals("Supreme Court") && source.equals("Central Sectt"))
	   					{   Bus1=" Take 120 number bus till Old Sectt and then Take 26 number bus till Supreme Court";
	   					toastState( source, destination,Bus1);
	   					}
	   					else
	   						if (source.equals("Nizamuddin R.S") && destination.equals("Supreme Court"))
	   						{   Bus1=" 101 is a direct bus";
	   						toastState( source, destination,Bus1);
	   						}else
	   						if (source.equals("Nizamuddin R.S") && destination.equals("Red Fort"))
	   						{   Bus1=" 101 is direct bus";
	   						toastState( source, destination,Bus1);
	   						}else
	   						if (source.equals("Nizamuddin R.S") && destination.equals("Mori Gate"))
	   						{   Bus1="Take 101 number bus till Adarsh Nagar and the take 106A bus till Mori Gate";
	   						toastState( source, destination,Bus1);
	   						}else
	   						if (source.equals("Nizamuddin R.S") && destination.equals("Mandi House"))
	   						{   Bus1=" Take 101 number bus till DaryaGanj and the take 104 bus till Mandi House ";
	   						toastState( source, destination,Bus1);
	   						}else
	   						if (source.equals("Nizamuddin R.S") && destination.equals("ITO"))
	   						{   Bus1="Take 101 number bus till Mall Road and then take 740 till ITO";
	   						toastState( source, destination,Bus1);
	   						}else
	   						if (source.equals("Nizamuddin R.S") && destination.equals("Mother Dairy"))
	   						{   Bus1=" Take 101 number bus till DaryaGanj and then take 118 till Mother Dairy";
	   						toastState( source, destination,Bus1);
	   						}else
	   						if (source.equals("Nizamuddin R.S") && destination.equals("Anand Vihar"))
	   						{   Bus1="Take 101 number bus till Adarsh Nagar and then take 333 number bus till Anand Vihar ";
	   						toastState( source, destination,Bus1);
	   						}
	   						else
	   							if (destination.equals("Nizamuddin R.S") && source.equals("Supreme Court"))
	   							{   Bus1=" 101 is a direct bus";
	   							toastState( source, destination,Bus1);
	   							}
	   							else
	   							if (destination.equals("Nizamuddin R.S") && source.equals("Red Fort"))
	   							{   Bus1=" 101 number are direct bus";
	   							toastState( source, destination,Bus1);
	   							}else
	   							if (destination.equals("Nizamuddin R.S") && source.equals("Mori Gate"))
	   							{   Bus1=" Take 106A number bus till Adarsh Nagar and the take 101 bus till Nizamuddin R.S ";
	   							toastState( source, destination,Bus1);
	   							}else
	   							if (destination.equals("Nizamuddin R.S") && source.equals("Mandi House"))
	   							{   Bus1=" Take 104 number bus till DaryaGanj and the take 101 bus till Nizamuddin R.S ";
	   							toastState( source, destination,Bus1);
	   							}else
	   							if (destination.equals("Nizamuddin R.S") && source.equals("ITO"))
	   							{   Bus1=" Take 740 number bus till Mall Road and then take 101 till Nizamuddin R.S ";
	   							toastState( source, destination,Bus1);
	   							}else
	   							if (destination.equals("Nizamuddin R.S") && source.equals("Mother Dairy"))
	   							{   Bus1=" Take 118 number bus till DaryaGanj and then take 101 Nizamuddin R.S ";
	   							toastState( source, destination,Bus1);
	   							}else
	   							if (destination.equals("Nizamuddin R.S") && source.equals("Anand Vihar"))
	   							{   Bus1=" Take 333 number bus till Adarsh Nagar and then take 101 number bus till Nizamuddin  ";
	   							toastState( source, destination,Bus1);
	   							}
	   							else if (destination.equals("Nizamuddin R.S") && source.equals("Central Sectt"))
	   							{   Bus1=" 101 is a direct bus ";
	   							toastState( source, destination,Bus1);
	   							}
	   							else
	   								if (source.equals("Adarsh Nagar") && destination.equals("Nizamuddin R.S"))
	   								{   Bus1=" 101 number is a direct bus";
	   								toastState( source, destination,Bus1);
	   								}else
	   								if (source.equals("Adarsh Nagar") && destination.equals("Supreme Court"))
	   								{   Bus1=" 101 is a direct bus";
	   								toastState( source, destination,Bus1);
	   								}else
	   								if (source.equals("Adarsh Nagar") && destination.equals("Red Fort"))
	   								{   Bus1=" 101,62 are direct buses";
	   								toastState( source, destination,Bus1);
	   								}else
	   								if (source.equals("Adarsh Nagar") && destination.equals("Mori Gate"))
	   								{   Bus1="106A,119 are direct buses";
	   								toastState( source, destination,Bus1);
	   								}else
	   								if (source.equals("Adarsh Nagar") && destination.equals("Mandi House"))
	   								{   Bus1=" 120 is a direct bus";
	   								toastState( source, destination,Bus1);
	   								}else
	   								if (source.equals("Adarsh Nagar") && destination.equals("ITO"))
	   								{   Bus1="Take 19 number bus till Shivaji Stadium and then take 331 till ITO";
	   								toastState( source, destination,Bus1);
	   								}else
	   								if (source.equals("Adarsh Nagar") && destination.equals("Mother Dairy"))
	   								{   Bus1=" Take 19 number bus till New Delhi R.S and then take 351 till Mother Dairy";
	   								toastState( source, destination,Bus1);
	   								}else
	   								if (source.equals("Adarsh Nagar") && destination.equals("Anand Vihar"))
	   								{   Bus1="333 is a direct bus ";
	   								toastState( source, destination,Bus1);
	   								}
	   								else if (source.equals("Adarsh Nagar") && destination.equals("Central Sectt"))
	   								{   Bus1="100,120 are direct buses ";
	   								toastState( source, destination,Bus1);
	   								}
	   								else
	   									if (destination.equals("Adarsh Nagar") && source.equals("Nizamuddin R.S"))
	   									{   Bus1=" 101 number is a direct bus";
	   									toastState( source, destination,Bus1);
	   									}else
	   									if (destination.equals("Adarsh Nagar") && source.equals("Supreme Court"))
	   									{   Bus1="101 is a direct bus";
	   									toastState( source, destination,Bus1);
	   									}else
	   									if (destination.equals("Adarsh Nagar") && source.equals("Red Fort"))
	   									{   Bus1=" 101,62 number are direct bus";
	   									toastState( source, destination,Bus1);
	   									}else
	   									if (destination.equals("Adarsh Nagar") && source.equals("Mori Gate"))
	   									{   Bus1=" 106A,119 are direct buses ";
	   									toastState( source, destination,Bus1);
	   									}else
	   									if (destination.equals("Adarsh Nagar") && source.equals("Mandi House"))
	   									{   Bus1=" 120 is a direct bus ";
	   									toastState( source, destination,Bus1);
	   									}else
	   									if (destination.equals("Adarsh Nagar") && source.equals("ITO"))
	   									{   Bus1=" Take 331 number bus till Shivaji Stadium and then take 19 till Adarsh Nagar ";
	   									toastState( source, destination,Bus1);
	   									}else
	   									if (destination.equals("Adarsh Nagar") && source.equals("Mother Dairy"))
	   									{   Bus1=" Take 351 number bus till New Delhi R.S and then take 19 till Adarsh Nagar ";
	   									toastState( source, destination,Bus1);
	   									}else
	   									if (destination.equals("Adarsh Nagar") && source.equals("Anand Vihar"))
	   									{   Bus1="333 is a direct bus  ";
	   									toastState( source, destination,Bus1);
	   									}
	   									else if (destination.equals("Adarsh Nagar") && source.equals("Central Sectt"))
	   									{   Bus1=" 100,120 is a direct bus ";
	   									toastState( source, destination,Bus1);
	   									}







			else
	   		toastState( source, destination,Bus1);


	   	}

	   }

