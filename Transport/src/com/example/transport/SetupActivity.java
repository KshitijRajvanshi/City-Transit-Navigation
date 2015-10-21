package com.example.transport;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import android.view.View.OnClickListener;

public class SetupActivity extends Activity implements OnClickListener {


	static Spinner spinner,spinner2=null;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab2);
		  spinner = (Spinner) findViewById(R.id.spinner);
	        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
	                this, R.array.source_array, android.R.layout.simple_spinner_item);
	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        spinner.setAdapter(adapter);
	        
	       
	       spinner2 = (Spinner) findViewById(R.id.spinner2);
	        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
	                this, R.array.destination_array, android.R.layout.simple_spinner_item);
	        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        spinner2.setAdapter(adapter2);
	        
	        View Button = findViewById(R.id.button);
	       Button.setOnClickListener( this); 
	
	       
	      View MapButton = findViewById(R.id.bmap);
	       MapButton.setOnClickListener(this); 
	}
	       public void toastState( String st, String st1, String fare) {
	   		if (st != null) {
	   			String desc =  "\nSource: " 
	   			+ st + "\nDestination: " + st1 + "\nFare: " + fare;
	   			Toast.makeText(getApplicationContext(), desc, Toast.LENGTH_LONG)
	   					.show();
	   		}
	   	}

	   	public void onItemSelected(AdapterView<?> parent, View view, int position,
	   			long id) {
	   		
	   	}

	   	public void onNothingSelected(AdapterView<?> parent) {
	   	}
	   	
	   	public void onClick(View view) {
	   		switch(view.getId())
	   		{
	   	
	   		case R.id.button:
	   			String st=spinner.getSelectedItem().toString();
		   		String st1=spinner2.getSelectedItem().toString();
	   			String fare = "0";
		   		if (st == st1) {
		   			fare="Rs.8";
		   			toastState( st, st1, fare);
		   		}
		   		
		   		else if(st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Jhil Mil")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Jhil Mil")
		   		|| st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Mansrovar Park")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Mansrovar Park")
		   		|| st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Mansrovar Park")
		   		|| st1.equalsIgnoreCase("Shahrada") && st.equalsIgnoreCase("Mansrovar Park")
		   		|| st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Welcome")
		   		|| st1.equalsIgnoreCase("Shahrada") && st.equalsIgnoreCase("Welcome")
		   		|| st.equalsIgnoreCase("Seelampur") && st1.equalsIgnoreCase("Welcome")
		   		|| st1.equalsIgnoreCase("Seelampur") && st.equalsIgnoreCase("Welcome")
		   		|| st.equalsIgnoreCase("Seelampur") && st1.equalsIgnoreCase("Shastri Park")
		   		|| st1.equalsIgnoreCase("Seelampur") && st.equalsIgnoreCase("Shastri Park")
		   		|| st.equalsIgnoreCase("Kashmere Gate") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Kashmere Gate") && st.equalsIgnoreCase("Tis Hazari")
		   		|| st.equalsIgnoreCase("Pul Bangash") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Pul Bangash") && st.equalsIgnoreCase("Tis Hazari")
		   		|| st.equalsIgnoreCase("Pratap Nagar") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Pratap Nagar") && st.equalsIgnoreCase("Tis Hazari")
		   		|| st.equalsIgnoreCase("Pratap Nagar") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Pratap Nagar") && st.equalsIgnoreCase("Pul Bangash")
		   		|| st.equalsIgnoreCase("Pratap Nagar") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Pratap Nagar") && st.equalsIgnoreCase("Shastri Nagar")
		   		|| st.equalsIgnoreCase("Inderlok") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Inderlok") && st.equalsIgnoreCase("Shastri Nagar")
		   		|| st.equalsIgnoreCase("Inderlok") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Inderlok") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st.equalsIgnoreCase("Inderlok") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Inderlok") && st.equalsIgnoreCase("Keshav Puram")
		   		|| st.equalsIgnoreCase("Kanhaiya Nagar") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Kanhaiya Nagar") && st.equalsIgnoreCase("Keshav Puram")
		   		|| st.equalsIgnoreCase("Netaji Subash Place") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Netaji Subash Place") && st.equalsIgnoreCase("Keshav Puram")
		   		|| st.equalsIgnoreCase("Netaji Subash Place") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Netaji Subash Place") && st.equalsIgnoreCase("Kohat Enclave")
		   		|| st.equalsIgnoreCase("Pitampura") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Pitampura") && st.equalsIgnoreCase("Kohat Enclave")
		   		|| st.equalsIgnoreCase("Rohini East") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Rohini East") && st.equalsIgnoreCase("Kohat Enclave")
		   		|| st.equalsIgnoreCase("Rohini East") && st1.equalsIgnoreCase("Pitampura")
		   		|| st1.equalsIgnoreCase("Rohini East") && st.equalsIgnoreCase("Pitampura")
		   		|| st.equalsIgnoreCase("Rohini East") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Rohini East") && st.equalsIgnoreCase("Rohini West")
		   		|| st.equalsIgnoreCase("Rithala") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Rithala") && st.equalsIgnoreCase("Rohini West"))
		   		{
		   		fare="Rs8";
		   		toastState(st,st1,fare);
		   		}

		   		else if(st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Mansarovar Park")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Mansarovar Park")
		   		|| st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Shahdara")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Shahdara")
		   		|| st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Shahdara")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Shahdara")
		   		|| st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Welcome")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Welcome")
		   		|| st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Mansarovar Park")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Mansarovar Park")
		   		|| st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Mansarovar Park")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Mansarovar Park")
		   		|| st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Shahdara")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Shahdara")
		   		|| st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Shahdara")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Shahdara")
		   		|| st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Welcome")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Welcome")
		   		|| st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Kashmere Gate")
		   		|| st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Tis Hazari")
		   		|| st.equalsIgnoreCase("Pul Bangash") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Pul Bangash") && st.equalsIgnoreCase("Kashmere Gate")
		   		|| st.equalsIgnoreCase("Pratap Nagar") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Pratap Nagar") && st.equalsIgnoreCase("Kashmere Gate")
		   		|| st.equalsIgnoreCase("Shastri Nagar") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Shastri Nagar") && st.equalsIgnoreCase("Tis Hazari")
		   		|| st.equalsIgnoreCase("Shastri Nagar") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Shastri Nagar") && st.equalsIgnoreCase("Pul Bangash")
		   		|| st.equalsIgnoreCase("Inder Lok") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Inder Lok") && st.equalsIgnoreCase("Pul Bangash")
		   		|| st.equalsIgnoreCase("Inder Lok") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Inder Lok") && st.equalsIgnoreCase("Pratap Nagar")
		   		|| st.equalsIgnoreCase("Shastri Nagar") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Shastri Nagar") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st.equalsIgnoreCase("Shastri Nagar") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Shastri Nagar") && st.equalsIgnoreCase("Keshav Puram")
		   		|| st.equalsIgnoreCase("Inder Lok") && st1.equalsIgnoreCase("Netaji Subhash Place")
		   		|| st1.equalsIgnoreCase("Inder Lok") && st.equalsIgnoreCase("Netaji Subhash Place")
		   		|| st.equalsIgnoreCase("Netaji Subhash Place") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Netaji Subhash Place") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st.equalsIgnoreCase("Kohat Enclave") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Kohat Enclave") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st.equalsIgnoreCase("Kohat Enclave") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Kohat Enclave") && st.equalsIgnoreCase("Keshav Puram")
		   		|| st.equalsIgnoreCase("Pitam Pura") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Pitam Pura") && st.equalsIgnoreCase("Keshav Puram")
		   		|| st.equalsIgnoreCase("Pitam Pura") && st1.equalsIgnoreCase("Netaji Subhash Place")
		   		|| st1.equalsIgnoreCase("Pitam Pura") && st.equalsIgnoreCase("Netaji Subhash Place")
		   		|| st.equalsIgnoreCase("Rohini East") && st1.equalsIgnoreCase("Netaji Subhash Place")
		   		|| st1.equalsIgnoreCase("Rohini East") && st.equalsIgnoreCase("Netaji Subhash Place")
		   		|| st.equalsIgnoreCase("Rohini West") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Rohini West") && st.equalsIgnoreCase("Kohat Enclave")
		   		|| st.equalsIgnoreCase("Rohini West") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Rohini West") && st.equalsIgnoreCase("Pitam Pura")
		   		|| st.equalsIgnoreCase("Rithala") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Rithala") && st.equalsIgnoreCase("Pitam Pura")
		   		|| st.equalsIgnoreCase("Rithala") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Rithala") && st.equalsIgnoreCase("Rohini East"))
		   		{
		   		fare="Rs10";
		   		toastState(st,st1,fare);
		   		}

		   		else if(st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Welcome")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Welcome")
		   		||st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Seelam Pur")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Seelam Pur")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Seelam Pur")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Seelam Pur")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Shastri Park")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Shastri Park")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Kashmere Gate")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Kashmere Gate")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Tis Hazari")
		   		||st.equalsIgnoreCase("Pul Bangash") && st1.equalsIgnoreCase("Shastri Park")
		   		|| st1.equalsIgnoreCase("Pul Bangash") && st.equalsIgnoreCase("Shastri Park")
		   		||st.equalsIgnoreCase("Pratap Nagar") && st1.equalsIgnoreCase("Shastri Park")
		   		|| st1.equalsIgnoreCase("Pratap Nagar") && st.equalsIgnoreCase("Shastri Park")
		   		||st.equalsIgnoreCase("Shastri Nagar") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Shastri Nagar") && st.equalsIgnoreCase("Kashmere Gate")
		   		||st.equalsIgnoreCase("Inder Lok") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Inder Lok") && st.equalsIgnoreCase("Kashmere Gate")
		   		||st.equalsIgnoreCase("Inder Lok") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Inder Lok") && st.equalsIgnoreCase("Tis Hazari")
		   		||st.equalsIgnoreCase("Kanhaiya Nagar") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Kanhaiya Nagar") && st.equalsIgnoreCase("Tis Hazari")
		   		||st.equalsIgnoreCase("Kanhaiya Nagar") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Kanhaiya Nagar") && st.equalsIgnoreCase("Pul Bangash")
		   		||st.equalsIgnoreCase("Keshav Puram") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Keshav Puram") && st.equalsIgnoreCase("Pul Bangash")
		   		||st.equalsIgnoreCase("Kanhaiya Nagar") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Kanhaiya Nagar") && st.equalsIgnoreCase("Pratap Nagar")
		   		||st.equalsIgnoreCase("Keshav Puram") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Keshav Puram") && st.equalsIgnoreCase("Pratap Nagar")
		   		||st.equalsIgnoreCase("Shastri Nagar") && st1.equalsIgnoreCase("Netaji Subash Place")
		   		|| st1.equalsIgnoreCase("Shastri Nagar") && st.equalsIgnoreCase("Netaji Subash Place")
		   		||st.equalsIgnoreCase("Shastri Nagar") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Shastri Nagar") && st.equalsIgnoreCase("Kohat Enclave")
		   		||st.equalsIgnoreCase("Inder Lok") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Inder Lok") && st.equalsIgnoreCase("Kohat Enclave")
		   		||st.equalsIgnoreCase("Inder Lok") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Inder Lok") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Kanhaiya Nagar") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Kanhaiya Nagar") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Kanhaiya Nagar") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Kanhaiya Nagar") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Keshav Puram") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Keshav Puram") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Keshav Puram") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Keshav Puram") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Netaji Subash Place") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Netaji Subash Place") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Kohat Enclave") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Kohat Enclave") && st.equalsIgnoreCase("Rithala"))
		   		{
		   		fare="Rs12";
		   		toastState(st,st1,fare);
		   		}

		   		else if(st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Shastri Park")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Shastri Park")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Shastri Park")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Shastri Park")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Kashmere Gate")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Kashmere Gate")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Tis Hazari")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Kashmere Gate")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Tis Hazari")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Pul Bangash")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Tis Hazari")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Pul Bangash")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Pratap Nagar")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Pul Bangash")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Pratap Nagar")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Shastri Nagar")
		   		||st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Shastri Nagar")
		   		||st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Inder Lok")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Inder Lok")
		   		||st.equalsIgnoreCase("Kanhaiya Nagar") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Kanhaiya Nagar") && st.equalsIgnoreCase("Kashmere Gate")
		   		||st.equalsIgnoreCase("Keshav Puram") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Keshav Puram") && st.equalsIgnoreCase("Kashmere Gate")
		   		||st.equalsIgnoreCase("Keshav Puram") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Keshav Puram") && st.equalsIgnoreCase("Tis Hazari")
		   		||st.equalsIgnoreCase("Netaji Subash Place") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Netaji Subash Place") && st.equalsIgnoreCase("Tis Hazari")
		   		||st.equalsIgnoreCase("Netaji Subash Place") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Netaji Subash Place") && st.equalsIgnoreCase("Pul Bangash")
		   		||st.equalsIgnoreCase("Kohat Enclave") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Kohat Enclave") && st.equalsIgnoreCase("Pul Bangash")
		   		||st.equalsIgnoreCase("Netaji Subash Place") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Netaji Subash Place") && st.equalsIgnoreCase("Pratap Nagar")
		   		||st.equalsIgnoreCase("Kohat Enclave") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Kohat Enclave") && st.equalsIgnoreCase("Pratap Nagar")
		   		||st.equalsIgnoreCase("Pitam Pura") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Pitam Pura") && st.equalsIgnoreCase("Pratap Nagar")
		   		||st.equalsIgnoreCase("Pitam Pura") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Pitam Pura") && st.equalsIgnoreCase("Shastri Nagar")
		   		||st.equalsIgnoreCase("Rohini East") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Rohini East") && st.equalsIgnoreCase("Shastri Nagar")
		   		||st.equalsIgnoreCase("Rohini West") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Rohini West") && st.equalsIgnoreCase("Shastri Nagar")
		   		||st.equalsIgnoreCase("Rohini East") && st1.equalsIgnoreCase("Inder Lok")
		   		|| st1.equalsIgnoreCase("Rohini East") && st.equalsIgnoreCase("Inder Lok")
		   		||st.equalsIgnoreCase("Rohini West") && st1.equalsIgnoreCase("Inder Lok")
		   		|| st1.equalsIgnoreCase("Rohini West") && st.equalsIgnoreCase("Inder Lok")
		   		||st.equalsIgnoreCase("Rithala") && st1.equalsIgnoreCase("Inder Lok")
		   		|| st1.equalsIgnoreCase("Rithala") && st.equalsIgnoreCase("Inder Lok")
		   		||st.equalsIgnoreCase("Rohini West") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Rohini West") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		||st.equalsIgnoreCase("Rithala") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Rithala") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		||st.equalsIgnoreCase("Rithala") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Rithala") && st.equalsIgnoreCase("Keshav Puram"))
		   		{
		   		fare="Rs15";
		   		toastState(st,st1,fare);
		   		}

		   		else if(st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Kashmere Gate")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Kashmere Gate")
		   		||st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Tis Hazari")
		   		||st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Pul Bangash")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Tis Hazari")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Tis Hazari")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Pul Bangash")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Pratap Nagar")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Pul Bangash")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Pul Bangash")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Pratap Nagar")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Pratap Nagar")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Shastri Nagar")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Shastri Nagar")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Inder Lok")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Inder Lok")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Inder Lok")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Inder Lok")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Keshav Puram")
		   		||st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		||st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Keshav Puram")
		   		||st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Netaji Subash Place")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Netaji Subash Place")
		   		||st.equalsIgnoreCase("Kashmere Gate") && st1.equalsIgnoreCase("Netaji Subash Place")
		   		|| st1.equalsIgnoreCase("Kashmere Gate") && st.equalsIgnoreCase("Netaji Subash Place")
		   		||st.equalsIgnoreCase("Kashmere Gate") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Kashmere Gate") && st.equalsIgnoreCase("Kohat Enclave")
		   		||st.equalsIgnoreCase("Kashmere Gate") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Kashmere Gate") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Tis Hazari") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Tis Hazari") && st.equalsIgnoreCase("Kohat Enclave")
		   		||st.equalsIgnoreCase("Tis Hazari") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Tis Hazari") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Tis Hazari") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Tis Hazari") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Pul Bangash") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Pul Bangash") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Pul Bangash") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Pul Bangash") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Pul Bangash") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Pul Bangash") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Pratap Nagar") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Pratap Nagar") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Pratap Nagar") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Pratap Nagar") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Pratap Nagar") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Pratap Nagar") && st.equalsIgnoreCase("Rithala")
		   		||st.equalsIgnoreCase("Shastri Nagar") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Shastri Nagar") && st.equalsIgnoreCase("Rithala"))
		   		{
		   		fare="Rs16";
		   		toastState(st,st1,fare);
		   		}

		   		else if(st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Pratap Nagar")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Pratap Nagar")
		   		||st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Shastri Nagar")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Shastri Nagar")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Inder Lok")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Inder Lok")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Shastri Nagar")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Shastri Nagar")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Inder Lok")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Inder Lok")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Inder Lok")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Inder Lok")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Keshav Puram")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Keshav Puram")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Netaji Subash Place")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Netaji Subash Place")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Netaji Subash Place")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Netaji Subash Place")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Kohat Enclave")
		   		||st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Kohat Enclave")
		   		||st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Kashmere Gate") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Kashmere Gate") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Kashmere Gate") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Kashmere Gate") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Kashmere Gate") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Kashmere Gate") && st.equalsIgnoreCase("Rithala")
		   		||st.equalsIgnoreCase("Tis Hazari") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Tis Hazari") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Tis Hazari") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Tis Hazari") && st.equalsIgnoreCase("Rithala")
		   		||st.equalsIgnoreCase("Pul Bangash") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Pul Bangash") && st.equalsIgnoreCase("Rithala"))
		   		{
		   		fare="Rs18";
		   		toastState(st,st1,fare);
		   		}

		   		else if(st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Inder Lok")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Inder Lok")
		   		||st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		||st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Keshav Puram")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Kanhaiya Nagar")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Kanhaiya Nagar")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Keshav Puram")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Netaji Subash Place")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Netaji Subash Place")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Keshav Puram")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Keshav Puram")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Netaji Subash Place")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Netaji Subash Place")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Kohat Enclave")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Netaji Subash Place")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Netaji Subash Place")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Kohat Enclave")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Kohat Enclave")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Shastri Park") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Shastri Park") && st.equalsIgnoreCase("Rithala"))
		   		{
		   		fare="Rs19";
		   		toastState(st,st1,fare);
		   		}

		   		else if(st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Netaji Subash Place")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Netaji Subash Place")
		   		||st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Kohat Enclave")
		   		||st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Kohat Enclave")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Kohat Enclave")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Pitam Pura")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Pitam Pura")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Shahdara") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Shahdara") && st.equalsIgnoreCase("Rithala")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Welcome") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Welcome") && st.equalsIgnoreCase("Rithala")
		   		||st.equalsIgnoreCase("Seelam Pur") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Seelam Pur") && st.equalsIgnoreCase("Rithala"))
		   		{
		   		fare="Rs21";
		   		toastState(st,st1,fare);
		   		}

		   		else if(st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Rohini East")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Rohini East")
		   		||st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Jhil Mil") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Jhil Mil") && st.equalsIgnoreCase("Rithala")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Rohini West")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Rohini West")
		   		||st.equalsIgnoreCase("Mansrover Park") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Mansrover Park") && st.equalsIgnoreCase("Rithala"))
		   		{
		   		fare="Rs22";
		   		toastState(st,st1,fare);
		   		}

		   		else if(st.equalsIgnoreCase("Dilshad Garden") && st1.equalsIgnoreCase("Rithala")
		   		|| st1.equalsIgnoreCase("Dilshad Garden") && st.equalsIgnoreCase("Rithala"))
		   		{
		   		fare="Rs23";
		   		toastState(st,st1,fare);
		   		}
		   		
	   		else
	   		toastState( st,st1,fare);
	   		break;
	   		}
	   		
	   		switch(view.getId())
	   		{
				case R.id.bmap:
					Intent i=new Intent(this,Dmap.class);
					startActivity(i);
					break;
				}
			}
	
		}