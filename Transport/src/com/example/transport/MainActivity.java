package com.example.transport;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	
static Spinner s11,s12=null;

	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab1);
		  s11 = (Spinner) findViewById(R.id.spinner30);
	        ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(
	                this, R.array.metro_array, android.R.layout.simple_spinner_item);
	        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        s11.setAdapter(adapter11);
	        
	       
	       s12 = (Spinner) findViewById(R.id.spinner20);
	        ArrayAdapter<CharSequence> adapter21 = ArrayAdapter.createFromResource(
	                this, R.array.metro1_array, android.R.layout.simple_spinner_item);
	        adapter21.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	       s12.setAdapter(adapter21);
	        
	        View KButton = findViewById(R.id.broute);
	       KButton.setOnClickListener( this); 
	
	       
	      
	}
	       public void toastState( String s1, String a1, String route) {
	   		if (s1 != null) {
	   			String descs =  "\nSource: " 
	   			+ s1 + "\nDestination: " + a1 + "\n Route: " + route;
	   			Toast.makeText(getApplicationContext(), descs, Toast.LENGTH_LONG)
	   					.show();
	   		}
	   	}

	   	public void onItemSelected(AdapterView<?> parent, View view, int position,
	   			long id) {
	   		String s1=s11.getSelectedItem().toString();
	   		String a1=s12.getSelectedItem().toString();
	   		String route="Same Stations selected";
	   		if (s1 == a1) {
	   			toastState( s1, a1, route);
	   		}
	   	}

	   	public void onNothingSelected(AdapterView<?> parent) {
	   	}
	   	
	   	
	   	public void onClick(View view) {
	   		
	   		String s=s11.getSelectedItem().toString();
	   		String a2=s12.getSelectedItem().toString();
String route = null;
	   		if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Adarsh Nagar"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar";

	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Azad Pur"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Model Town"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("GTB Nagar"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Vishwa Vidyalaya"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jahangirpuri") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Jahangirpuri --> Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Azad Pur"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Model Town"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("GTB Nagar"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Vishwa Vidyalaya"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Adarsh Nagar") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Adarsh Nagar --> Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Model Town"))
	   		{
	   		route = "Azad Pur --> Model Town";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("GTB Nagar"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Vishwa Vidyalaya"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Azad Pur") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Azad Pur --> Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("GTB Nagar"))
	   		{
	   		route = "Model Town --> GTB Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Vishwa Vidyalaya"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Model Town") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Model Town --> GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Vishwa Vidyalaya"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("GTB Nagar") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "GTB Nagar --> Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vishwa Vidyalaya") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Vishwa Vidyalaya --> Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Vidhan Sabha") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Vidhan Sabha --> Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Civil Lines") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Civil Lines --> Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kashmere Gate") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Kashmere Gate --> Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chandini Chowk") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Chandini Chowk --> Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Chawri Bazar --> New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chawri Bazar") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Chawri Bazar --> New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("New Delhi") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "New Delhi --> Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Rajiv Chowk") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Rajiv Chowk --> Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Patel Chowk") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Patel Chowk --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Central Seceritariat --> Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Central Seceritariat") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Udyog Bhawan --> Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		/*else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Udyog Bhawan --> Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Udyog Bhawan") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Race Course --> Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Race Course --> Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Race Course") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("INA"))
	   		{
	   		route = "Jor Bagh --> INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Jor Bagh --> INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jor Bagh") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "INA --> AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "INA --> AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "INA --> AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("INA") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "AIIMS --> Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "AIIMS --> Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("AIIMS") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Green Park --> Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Green Park --> Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Green Park") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Hauz Khas --> Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Hauz Khas") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Malviya Nagar --> Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Malviya Nagar --> Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Malviya Nagar --> Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Malviya Nagar") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Saket --> Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Saket --> Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Saket --> Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Saket --> Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Saket") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Qutub Minar --> Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Qutub Minar --> Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Qutub Minar --> Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Qutub Minar") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Chhatarpur --> Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Chhatarpur --> Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Chhatarpur --> Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Chhatarpur") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Sultanpur --> Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Sultanpur --> Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Sultanpur --> Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sultanpur") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Ghitorni --> Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Ghitorni --> Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Ghitorni --> Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Ghitorni") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Arjan Garh --> Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Arjan Garh --> Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Arjan Garh --> Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Arjan Garh") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Guru Dronacharya --> Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Guru Dronacharya --> Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Guru Dronacharya --> Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Guru Dronacharya") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Sikandarpur --> MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Sikandarpur --> MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Sikandarpur --> MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sikandarpur") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "MG Road --> IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "MG Road --> IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("MG Road") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "IFFCO Chowk --> HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("IFFCO Chowk") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("HUDA City Center") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "HUDA City Center --> IFFCO Chowk --> MG Road --> Sikandarpur --> Guru Dronacharya --> Arjan Garh --> Ghitorni --> Sultanpur --> Chhatarpur --> Qutub Minar --> Saket --> Malviya Nagar --> Hauz Khas --> Green Park --> AIIMS --> INA --> Jor Bagh --> Race Course --> Udyog Bhawan --> Central Seceritariat --> Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Khan Market") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Khan Market --> Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jawaharlal Nehru Stadium") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Jawaharlal Nehru Stadium --> Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jangpura") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Jangpura --> Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Lajpat Nagar") && a2.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Lajpat Nagar --> Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Lajpat Nagar") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Lajpat Nagar --> Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Lajpat Nagar") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Lajpat Nagar") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Lajpat Nagar") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Lajpat Nagar") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Lajpat Nagar") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Lajpat Nagar") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Lajpat Nagar") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Lajpat Nagar") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Lajpat Nagar") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Lajpat Nagar --> Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Moolchand") && a2.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Moolchand --> Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Moolchand") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Moolchand --> Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Moolchand") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Moolchand") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Moolchand") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Moolchand") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Moolchand") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Moolchand") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Moolchand") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Moolchand") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Moolchand --> Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Kailash Colony") && a2.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Kailash Colony --> Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kailash Colony") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Kailash Colony --> Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kailash Colony") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kailash Colony") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kailash Colony") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kailash Colony") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kailash Colony") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kailash Colony") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kailash Colony") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Kailash Colony --> Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Nehru Place") && a2.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Nehru Place --> Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Nehru Place") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Nehru Place --> Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Nehru Place") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Nehru Place") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Nehru Place") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Nehru Place") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Nehru Place") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Nehru Place") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Nehru Place --> Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Kalkaji Mandir") && a2.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Kalkaji Mandir --> Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kalkaji Mandir") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Kalkaji Mandir --> Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kalkaji Mandir") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kalkaji Mandir") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kalkaji Mandir") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kalkaji Mandir") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Kalkaji Mandir") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Kalkaji Mandir --> Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Govind Puri") && a2.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Govind Puri --> OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Govind Puri") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Govind Puri --> OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Govind Puri") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Govind Puri") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Govind Puri") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Govind Puri") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Govind Puri --> OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("OKHLA") && a2.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "OKHLA --> Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("OKHLA") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "OKHLA --> Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("OKHLA") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("OKHLA") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("OKHLA") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "OKHLA --> Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Jasola Apollo") && a2.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Jasola Apollo --> Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jasola Apollo") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Jasola Apollo --> Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jasola Apollo") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Jasola Apollo") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Jasola Apollo --> Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Sarita Vihar") && a2.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Sarita Vihar --> Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sarita Vihar") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Sarita Vihar --> Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Sarita Vihar") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Sarita Vihar --> Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Mohan Estate") && a2.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Mohan Estate --> Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(s.equalsIgnoreCase("Mohan Estate") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Mohan Estate --> Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(s.equalsIgnoreCase("Tughlakabad") && a2.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Tughlakabad --> Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Adarsh Nagar"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Azad Pur"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Model Town"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("GTB Nagar"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Vishwa Vidyalaya"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jahangirpuri") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Jahangirpuri <-- Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Azad Pur"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Model Town"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("GTB Nagar"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Vishwa Vidyalaya"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Adarsh Nagar") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Adarsh Nagar <-- Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Model Town"))
	   		{
	   		route = "Azad Pur <-- Model Town";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("GTB Nagar"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Vishwa Vidyalaya"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Azad Pur") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Azad Pur <-- Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("GTB Nagar"))
	   		{
	   		route = "Model Town <-- GTB Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Vishwa Vidyalaya"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Model Town") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Model Town <-- GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Vishwa Vidyalaya"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("GTB Nagar") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "GTB Nagar <-- Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Vidhan Sabha"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vishwa Vidyalaya") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Vishwa Vidyalaya <-- Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Civil Lines"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Vidhan Sabha") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Vidhan Sabha <-- Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Kashmere gate"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Civil Lines") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Civil Lines <-- Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Chandini Chowk"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kashmere Gate") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Kashmere Gate <-- Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Chawri Bazar"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}*/

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);} 

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chandini Chowk") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Chandini Chowk <-- Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("New Delhi"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chawri Bazar") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Chawri Bazar <-- New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Rajiv Chowk"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("New Delhi") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "New Delhi <-- Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Patel Chowk"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Rajiv Chowk") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Rajiv Chowk <-- Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Central Seceritariat"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Patel Chowk") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Patel Chowk <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Udyog Bhawan"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Central Seceritariat <-- Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Central Seceritariat") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Race Course"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Udyog Bhawan <-- Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Udyog Bhawan") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Jor Bagh"))
	   		{
	   		route = "Race Course <-- Jor Bagh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Race Course <-- Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Race Course") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("INA"))
	   		{
	   		route = "Jor Bagh <-- INA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Jor Bagh <-- INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jor Bagh") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("AIIMS"))
	   		{
	   		route = "INA <-- AIIMS";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "INA <-- AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("INA") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Green Park"))
	   		{
	   		route = "AIIMS <-- Green Park";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "AIIMS <-- Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("AIIMS") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Hauz Khas"))
	   		{
	   		route = "Green Park <-- Hauz Khas";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Green Park <-- Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Green Park") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Malviya Nagar"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Hauz Khas <-- Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Hauz Khas") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Saket"))
	   		{
	   		route = "Malviya Nagar <-- Saket";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Malviya Nagar <-- Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Malviya Nagar <-- Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Malviya Nagar") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Qutub Minar"))
	   		{
	   		route = "Saket <-- Qutub Minar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Saket <-- Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Saket <-- Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Saket") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Chhatarpur"))
	   		{
	   		route = "Qutub Minar <-- Chhatarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Qutub Minar <-- Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Qutub Minar <-- Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Qutub Minar") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Sultanpur"))
	   		{
	   		route = "Chhatarpur <-- Sultanpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Chhatarpur <-- Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Chhatarpur <-- Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Chhatarpur") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Ghitorni"))
	   		{
	   		route = "Sultanpur <-- Ghitorni";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Sultanpur <-- Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Sultanpur <-- Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sultanpur") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Arjan Garh"))
	   		{
	   		route = "Ghitorni <-- Arjan Garh";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Ghitorni <-- Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Ghitorni <-- Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Ghitorni") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Guru Dronacharya"))
	   		{
	   		route = "Arjan Garh <-- Guru Dronacharya";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Arjan Garh <-- Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Arjan Garh <-- Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Arjan Garh") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Sikandarpur"))
	   		{
	   		route = "Guru Dronacharya <-- Sikandarpur";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Guru Dronacharya <-- Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Guru Dronacharya <-- Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Guru Dronacharya") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("MG Road"))
	   		{
	   		route = "Sikandarpur <-- MG Road";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "Sikandarpur <-- MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "Sikandarpur <-- MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sikandarpur") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("IFFCO Chowk"))
	   		{
	   		route = "MG Road <-- IFFCO Chowk";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "MG Road <-- IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("MG Road") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("HUDA City Center"))
	   		{
	   		route = "IFFCO Chowk <-- HUDA City Center";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate"; 
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("IFFCO Chowk") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Khan Market"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("HUDA City Center") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "HUDA City Center <-- IFFCO Chowk <-- MG Road <-- Sikandarpur <-- Guru Dronacharya <-- Arjan Garh <-- Ghitorni <-- Sultanpur <-- Chhatarpur <-- Qutub Minar <-- Saket <-- Malviya Nagar <-- Hauz Khas <-- Green Park <-- AIIMS <-- INA <-- Jor Bagh <-- Race Course <-- Udyog Bhawan <-- Central Seceritariat <-- Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Jawaharlal Nehru Stadium"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Khan Market") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Khan Market <-- Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Jangpura"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jawaharlal Nehru Stadium") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Jawaharlal Nehru Stadium <-- Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("Lajpat Nagar"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jangpura") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Jangpura <-- Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Lajpat Nagar") && s.equalsIgnoreCase("Moolchand"))
	   		{
	   		route = "Lajpat Nagar <-- Moolchand";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Lajpat Nagar") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Lajpat Nagar <-- Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Lajpat Nagar") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Lajpat Nagar") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Lajpat Nagar") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Lajpat Nagar") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Lajpat Nagar") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Lajpat Nagar") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Lajpat Nagar") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Lajpat Nagar") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Lajpat Nagar") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Lajpat Nagar <-- Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Moolchand") && s.equalsIgnoreCase("Kailash Colony"))
	   		{
	   		route = "Moolchand <-- Kailash Colony";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Moolchand") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Moolchand <-- Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Moolchand") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Moolchand") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Moolchand") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Moolchand") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Moolchand") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Moolchand") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Moolchand") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Moolchand") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Moolchand <-- Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Kailash Colony") && s.equalsIgnoreCase("Nehru Place"))
	   		{
	   		route = "Kailash Colony <-- Nehru Place";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kailash Colony") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Kailash Colony <-- Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kailash Colony") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kailash Colony") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kailash Colony") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kailash Colony") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kailash Colony") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kailash Colony") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kailash Colony") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Kailash Colony <-- Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Nehru Place") && s.equalsIgnoreCase("Kalkaji Mandir"))
	   		{
	   		route = "Nehru Place <-- Kalkaji Mandir";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Nehru Place") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Nehru Place <-- Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Nehru Place") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Nehru Place") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Nehru Place") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Nehru Place") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Nehru Place") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Nehru Place") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Nehru Place <-- Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Kalkaji Mandir") && s.equalsIgnoreCase("Govind Puri"))
	   		{
	   		route = "Kalkaji Mandir <-- Govind Puri";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kalkaji Mandir") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Kalkaji Mandir <-- Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kalkaji Mandir") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kalkaji Mandir") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kalkaji Mandir") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kalkaji Mandir") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Kalkaji Mandir") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Kalkaji Mandir <-- Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Govind Puri") && s.equalsIgnoreCase("OKHLA"))
	   		{
	   		route = "Govind Puri <-- OKHLA";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Govind Puri") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "Govind Puri <-- OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Govind Puri") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Govind Puri") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Govind Puri") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Govind Puri") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Govind Puri <-- OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("OKHLA") && s.equalsIgnoreCase("Jasola Apollo"))
	   		{
	   		route = "OKHLA <-- Jasola Apollo";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("OKHLA") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "OKHLA <-- Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("OKHLA") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("OKHLA") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("OKHLA") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "OKHLA <-- Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Jasola Apollo") && s.equalsIgnoreCase("Sarita Vihar"))
	   		{
	   		route = "Jasola Apollo <-- Sarita Vihar";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jasola Apollo") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Jasola Apollo <-- Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jasola Apollo") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Jasola Apollo") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Jasola Apollo <-- Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Sarita Vihar") && s.equalsIgnoreCase("Mohan Estate"))
	   		{
	   		route = "Sarita Vihar <-- Mohan Estate";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sarita Vihar") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Sarita Vihar <-- Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Sarita Vihar") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Sarita Vihar <-- Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Mohan Estate") && s.equalsIgnoreCase("Tughlakabad"))
	   		{
	   		route = "Mohan Estate <-- Tughlakabad";
	   		 
	   		toastState(s,a2,route);}

	   		else if(a2.equalsIgnoreCase("Mohan Estate") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Mohan Estate <-- Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}


	   		else if(a2.equalsIgnoreCase("Tughlakabad") && s.equalsIgnoreCase("Badarpur"))
	   		{
	   		route = "Tughlakabad <-- Badarpur";
	   		 
	   		toastState(s,a2,route);}
	   		else
	   			toastState(s,a2,route);
	   		
	   		}
	   		
	   		
	
		}
	

	
