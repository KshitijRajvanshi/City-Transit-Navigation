package com.example.transport;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainsActivity extends Activity implements OnClickListener {

	/** Called when the activity is first created. */
String s=null;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab4);
		final Spinner spinners = (Spinner) findViewById(R.id.spinner03);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.route_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinners.setAdapter(adapter);
        View z= findViewById(R.id.bmap1);
        z.setOnClickListener( this); 
        
        spinners.setOnItemSelectedListener(new OnItemSelectedListener()
        {
   
        public void onItemSelected(AdapterView<?> parent,
            View view, int pos, long id) {
        	 s =spinners.getSelectedItem().toString();
        }

        public void onNothingSelected(AdapterView<?> parent) {
          // Do nothing.
        }
        });
        
        
        
    }
    
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(s.equalsIgnoreCase("Airport Express-1(Anand Vihar)"))
		{ String str = "Gazi Pur Road, Hasan  Pur Depot, I.P. Extn., Mother Dairy, Sarai Kale Khan, Bara Pullah .Flyover, S.J.Hospital, Dhaula Kuan, NH-8, Mahipal Pur, Radisson Hotel and I.G.I. Terminal-3 " ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();

		}
		else if(s.equalsIgnoreCase("Airport Express-2(Rohini Sec-1)"))
		{ String str = "Vishram Chowk, Rajiv Gandhi Cancer Hosp., Rohini West Metro Stn., Rohini Sec-7/8, Rohini East Metro Stn., Pitam Pura Metro Stn., Lok Vihar, Mohindara Park, Britannia, Punjabi Bagh via Ring Road, Dhaula Kuan, NH-8, Mahipal Pur, Redison Hotel and I.G.I. Terminal-3 " ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else if(s.equalsIgnoreCase("Airport Express-3(Indirapuram)"))
		{ String str = "Noida Sec-62, Noida Sec-23/54, Noida Sec-12/22, Noida Sec-21, Sector-10, Sector-19, Sector-27, DND Fly Over, Ashram, Lajpat Nagar, AIIMS, Aurbindo Marg, Haus Khas(Green Park Metro Stn.,) IIT Gate, JNU, Vasant Vihar, Vasant Village, NH-8, Mahipal Pur, Raddission Hotel to IGI Airport Road, IGI Terminal-3" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else if(s.equalsIgnoreCase("Airport Express-4(Kashmere Gate)"))
		{ String str = "Red Fort, LNJP Hospital, N.D. Rly Stn. Gate No.2, Connaught Place, Parliament Street, Ashoka Road, NDPO, Kend.Terminal, RML Hospital, Sardar Patel Marg, Dhaula Kuan, NH-8, Palam Airport & back NH-8, Mahipal Pur, Radisson Hotel and I.G.I. Terminal-3" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else if(s.equalsIgnoreCase("Airport Express-5(Azad Pur Term.)"))
		{ String str = "Ashok Vihar Xing, Wazirpur Depot, Kohat Metro Stn.(Pitam Pura) , Madhuvan Chowk, Outer Ring Road, Peera Garhi Chowk, Paschim Vihar (Power House), Meera Bagh, Vikas Puri H-3, Sonia Cinema, Vikas Puri C-Block, Uttam Nagar Terminal, Janak Puri C-1, Dabri More,  Dabri Villae, Nallah Road, Dwarka Sec-1, Dwarka Sec1/7, Dwarka Palam Flyover, Palam Airport, , NH-8, Raddission Hotel, Centour Hotel." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else if(s.equalsIgnoreCase("Airport Express-6(Noida Sec-35)"))
		{ String str = "Noida Sec-35, Noida Sec-34, City Centre Metro Stn., Noida Sec-37, Kalindi Kunj, Sarita Vihar (Mathura Raod),  Nehru Place, Chirag Delhi, BRT, A.N.Depot, Saket Metro Stn., Lado Sarai (T), Andheria More(Chhatarpur Metro Stn., ) Vasant Kunj, Mahipal Pur, Raddission Hotel to IGI Airport, IGI Terminal - 3." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else if(s.equalsIgnoreCase("Airport Hotel Link-7(RajendraPlace)"))
		{ String str = "Airport T-3 to Hotel Centoor NH-8 Link Road NH-8, Mahipal Pur Red Light take U-turn to Hotel Reddission, Back NH-8, Rao Tula Ram Marg, Basant Village, Munirka, R.K.Puram-I, R.K.Puram East Blk, Bhikaji Cama Place(Hotel Hayyat), " +
		"S.N.Depot, Hotel Leela, Vinay Marg/ Niti Marg, Hotel Ashok, Hotal Samrat, Kamal Ataturk Marg, Hotal Clerrij, Oranzeb Road Hotel Taj , Shahjahan Road, India Gate, Dr. Rajender Prashad Road, Janpath Road, Hotel Le-Meridian, Hotel Janpath, Hotel Imperial, Tolstoy Marg, Hotel Park, Connaught Circle, K.G.Marg, Tolstoy Marg, Hotel " +
		"Hans Plaza, Hotel International, Hotel Ranjeet, Kamla Market, Pahar Ganj, Jhandewalan, Link Road, Pusa Road, Karol Bagh Metro Station, Hotel Sidharath, Rajendra Place" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("Airport Hotel Link-8(GurgaonISBT)"))
		{ String str = "Airport Terminal-3 to Hotel Santoor, Hotel Reddision, Rajokari Boarder, Udhog Vihar, Iffco Chowk, Sukhrali Village, Gurgaon By Pass, Atul Kataria Chowk, Sheetla Mata Mandir" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("33:Bhajan pura-Noida Sec 37"))
		{ String str = "BHAJAN PURA 2. C-1 YAMUNA VIHAR 3. C-4 YAMUNA VIHAR 4. YAMUNA VIHAR C-12 5. BABAR PUR 6. JYOTI COLONY 7. NATHU CLY. CHOWK 8. NAND NAGRI TERMINAL 9. SUNDER NAGRI 10. TAHIR PUR 11 SEEMA PURI MORE 12. NEW SEEMA PURI 13. OLD SEEMA PURI 14. SHAHDARA BORDER 15. SURYA NGR 16. RAM PRASTHA XING 17. ANAND VIHAR TERMINAL 18. GAZIPUR DEPOT 19. GAZIPUR VILL. 20. NATIONAL HIGHWAY-24 X-ING 21. GAZIPUR DAIRY FARM. 22. KALYAN PURI XING 23. KONDLI 24. DALLU PURA 25. MAYUR VIHAR -III XING 26. JHUND PURA 27. O-BLK SEC-12 & 22 MORE 28. NOIDA SEC-19 TELEPHONE EXCHANGE 29. STAFF QUARTER NOIDA SEC.-27. 30. ATTA CHOWK 31. NOIDA SEC.-37" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}else
		if(s.equalsIgnoreCase("34:Mehrauli-Noida Sec 32"))
		{ String str = "1. MEHRAULI 2. QUTAB 3. LADO SARAI 4. SHED -UL ZAIB 5. SAKET XING 6. A.N. TERMINAL 7. KHAN PUR VILLAGE 8. BATRA HOSPITAL 9. HAMDARD NGR . 10. TUGLAKABAD FORT 11. TUGHLAKABAD VILLAGE . 12. LAL KUAN 13. ANDH VIDHALYA 14. PEHARALAD PUR 15. BADAR PUR VILL. 16. POWER HOUSE 17. ALI VILLAGE 18. MADAN PUR KHADAR XING 19. SARITA VIHAR 20. SARITA VIHAR XING 21. JASOLA VILL. 22. SHAHIN BAGH 23. ABDUL FAZAL ENCLAVE 24. KALINDI KUNJ 25. AMITY SCHOOL SEC.-44 26. NOIDA SEC-37 XING 27. NOIDA 28/29 28. NOIDA SEC.-18 29 ATTA CHOWK 30. NOIDA DEPOT 31. NAYA BANS 32. NOIDA SEC.-6 33. JHUND PURA X-ING 34. NOIDA SEC.-12 O BLOCK 35. NOIDA SEC.-55/56 XING 36. NOIDA SEC.-22 H BLK 37. NOIDA SEC.-32 NTPC." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}else
		if(s.equalsIgnoreCase("34EXT:lADO Sarai-Mayur Vihar3"))
		{ String str = "1. LADO SARAI 2. SHAID-UL-AZAB 3. SAKET X-ING 4. A.N. TERMINAL 5. KHAN PUR 6. BATRA HOSPITAL 7. HAMDARD NGR 8. TUGLAKABAD VILLAGE 9. LAL KUAN 10. PREHLAD PUR 11 BADAR PUR1 POWER HOUSE 12. ALI VILLAGE 13. MADAN PUR KHADAR X-ING 14. SARITA VIHAR 15. SARITA VIHAR XING 16. JASOLA VILLAGE 17. SAHIN BAGH 18. ABDUL FAZAL ENCLAVE 19. KALINDI KUNJ 20 AMITY SCHOOL SEC-44 21. NOIDA SEC-37 XING 22. NOIDA SEC-28/29 23. NOIDA SEC-18 24 ATTA CHOWK 25. NOIDA SEC-19-B DEPOT 26. NAYA BANS 27. NOIDA SEC-6 28.. NOIDA SEC-12 O-BLK 29. NEW KONDLI MKT 30. . MAYUR VIHAR PH-III" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("66:Nehru Stadium-Vasant Kunj"))
		{ String str = "1. JLN. STADIUM 2. LODHI CLY 3. JOR BAGH / S.J.MADARSA 4. S.J.AIR PORT 5. I.N.A. CLY. 6. S.J. HOSPITAL 7. NAURAJI NGR. 8. MOHMAND PUR 9. RK PURAM SEC-I 10. MOHAN SINGH MKT. 11.R.K. PURAM SEC.-8 12. S.M.TEMPLE 13.VASANT VIHAR DEPOT 14.MUNIRKA DDA 15. HILL AREA 16. POWER HOUSE 17. VASANT KUNJ POLICE STATION 18. MANAV STHALI 19. VASANT KUNJ C-9." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("70:Anand Vihar-Naraina Vihar"))
		{ String str = "1. ANAND VIHAR ISBT 2. GHAZIPUR DEPOT 3. HASAN PUR DEPOT 4. KARKARDOOMA X-ING 5. SWASTHYA VIHAR 6. SHAKAR PUR 7 T.T. POST 8. RAINY WELL 9 DELHI SECTT. 10. I.T.O AGCR 11. MANDI HOUSE 12. TOLSTOY MARG XING 13. JANTAR MANTAR 14. PALIKA KENDRA/ PATEL CHOWK 15. NDPO 16. KEND. TERMINAL 17. DR. R.M.L. HOSPITAL 18. RIDGE ROAD XING 19. SHANKAR ROAD 20. EAST PATEL NAGAR 21. WEST PATEL NAGAR 22. SHADIPUR DEPOT 23. NARAINA DEPOT 24. LOHA MANDI 25. PAYAL CINEMA 26. NARAINA VIHAR" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("73:Anand Vihar-H.N.Clock Tower"))
		{ String str = "1. ANAND VIHAR ISBT 2. GHAZIPUR DEPOT 3. HASAN PUR DEPOT 4. KARKARDOOMA X-ING 5. SWASTHYA VIHAR 6. SHAKAR PUR 7 T.T. POST 8. RAINY WELL 9 DELHI SECTT. 10. I.T.O AGCR 11. MANDI HOUSE 12. TOLSTOY MARG XING 13. JANTAR MANTAR 14 PALIKA KENDRA/ PATEL CHOWK 15. NDPO 16. KEND. TERMINAL 17. DR. R.M.L. HOSPITAL 18. RIDGE ROAD XING 19. SHANKAR ROAD 20. EAST PATEL NAGAR 21. WEST PATEL NAGAR 22. SHADIPUR DEPOT 23. NARAINA DEPOT 24. LOHA MANDI 25. PAYAL CINEMA 26. NARAINA VIHAR 27. MAYA PURI DEPOT 28.METAL FOREGING 29. BERI WALA BAGH 30 HARI NAGAR CLOCK TOWER" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("85:Anand Vihar-Punjabi Bagh(T)"))
		{ String str = "1. ANAND VIHAR ISBT 2. GHAZIPUR DEPOT 3. HASAN PUR DEPOT 4. CHANDER VIHAR 5. SARASWATI KUNJ 6.BALCO APPTT 7. MOTHER DAIRY 8.SCHOOL BLOCK SHAKAR PUR 9. TT POST 10. RAINY WELL 11. DELHI SECTT. 12. ITO AGCR 13. MANDI HOUSE 14. STATESMAN 15.SUCHETA KRIPALANI HOSPITAL/SHIVAJI STADIUM 16. PUNKUIN RD. 17. MEGHDOOT BHAVAN. 18. PUSA ROAD PETROL PUMP 19.KAROL BAGH METRO STN. 20. TELEPHONE EXCHANGE 21.E.P. NGR 22.W.P. NGR. 23. SHADIPUR DEPOT 24. K.PURA TERML25. NEW MOTI NGR., .26.P.BAGH CLUB 27. P.BAGH TERMINAL." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("85EXT:Anand Vihar-West Enclave"))
		{ String str = "1.. ANAND VIHAR ISBT 2. GHAZIPUR DEPOT 3. HASAN PUR DEPOT 4. CHANDER VIHAR 5. SARASWATI KUNJ 6.BALCO APPTT 7. MOTHER DAIRY 8.SCHOOL BLOCK SHAKAR PUR 9. TT POST 10. RAINY WELL 11. DELHI SECTT. 12. ITO AGCR 13. MANDI HOUSE 14. STATESMAN 15.SUCHETA KRIPALANI HOSPITAL/SHIVAJI STADIUM 16. PUNKUIN RD. 17. MEGHDOOT BHAVAN. 18. PUSA ROAD PETROL PUMP 19.KAROL BAGH METRO STN. 20. TELEPHONE EXCHANGE 21.E.P. NGR 22.W.P. NGR. 23. SHADIPUR DEPOT 24. K.PURA TERML25. NEW MOTI NGR., .26. P.BAGH TERMINAL..27. BRITANIA 28. MAHINDERA PARK 29. RANI BAGH 30. KESHAV MAHAVIDYALYA 31. BH. MAHAVIR HOSPITAL 32. WEST ENCLAVE." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("99:Sarai Kale Khan-Tri Nagar"))
		{ String str = "1. S.K. KHAN 2. ROAD BDG. 3. RLY BDG. XING 4. IP DEPOT 5. ITO RING RD. 6. RAJ GHAT 7. DELHI GATE 8. TURKMAN GATE 9.. AJMERI GATE 10. PS PAHAR GANJ 11 KAROL BAGH TRML. 12. D.B. GUPTA MARKET 13. DEV NAGAR, 14. ANAND PARBAT 15, SARAI ROHILLA, 16. SUBHADARA COLONY 17. E-BLOCK SHASTRI NAGAR 18. INDER LOK 19. WAZIRPUR JJ COLONY, 20. KANHIYA NAGAR. 21.. B-3 KESHAV PURAM 22.. TRI NGR JAI MATA MKT." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("100:Kendriya Term-Adarsh Nagar"))
		{ String str = "1.. KEND. TERML. 2. RML HOSPITAL, 3.NDPO, 4 PATEL CHOWK / PALIKA KENDRA 5. SHIVAJI STADIUM / SUPER BAZAR 6.. SUCHETA KRIPLANI HOSPITAL/ GOLE MARKET 7.CHITRA GUPTA ROAD, 8.P.S.PAHAR GANJ 9. KAROL BAGH (T) 10. GG SINGH XING, 11. FILMISTAN, 12 AZAD MARKET (DCM) 13. ICE FACTORY 14 MALKA GANJ, 15 PS KAMLA NGR 16.MAURICE NGR. 17 PATEL CHEST 18.. GTB NGR. 19. MODEL TOWN-II 20. AZAD PUR 21. ADARSH NGR." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("101:Nizamuddin R.S-Saroop Nagar"))
		{ String str = "1. NIZAMUDDIN RLY STATION 2. BHOGAL 3. PS NIZAMUDDIN 4. DPS MATHURA ROAD 5. GOLF CLUB /SUNDER NGR 6. NATIONAL STATIUM 7. SUPREME COURT 8. ITO 9. DELHI GATE 10. DARYA GANJ 11. RED FORT 12. ISBT 13. IP COLLEGE 14. OLD SECTT 15. MALL ROAD 16. INS HOSTEL 17. GTB NGR 18. MODEL TOWN -II 19. AZAD PUR 20. ADARSH NGR 21. JAHANGIR PURI XING 22. JAHANGIR PURI B-BLK. 23. DURGA CHOWK 24. BHALSW XING 25. SHARDHANAND CLY 26.SAROOP NGR JJ CLY" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("102:Old Delhi R.S-Rohini Sec22"))
		{ String str = "1. FATEH PURI 2. MORI GATE/ISBT 3.NEW COURT 4.ICE FACTORY 5. ROSHANARA BAGH 6.CLOCK TOWER 7. GUR MANDI 8.RP BAGH 9 .BARA BAGH 10 .AZAD PUR 11. SHALIMAR XING 12. ASHOK VIHAR XING 13. PREM BARI PURL 14.. W.P. DEPOT 15.KOHAT ENCLAVE . 16. JD-BLK PITAM PURA 17. MADHUBAN CHOWK 18. ROHINI SEC-7,8,9,XING 19. ROHINI SEC-7 20. ROHINI SEC-VI (ROHIN DEPOT-1) 21. RITHALA METRO STN 22. ROHINI NALA (GAS PLANT) 23. DEEP VIHAR 24. SEC-25 (AZAD CHOWK MAIN RD ) 25. ROHINI SEC-24 26.. ROHINI SEC-23 27. POOTH NO. 2 28. POOTH KALAN VILLAGE 29. ROHINI SEC-20 JJ CLY. 30. BEGAM PUR 31. ROHINI SEC-22" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		
		else
		if(s.equalsIgnoreCase("104:Shivaji Stadium-Jharoda Village"))
		{ String str = "1. SHIVAJI STADIUM 2.STATESMAN 3. MANDI HOUSE 4. ITO 5.DELHI GATE 6. DARYA GANJ 7 RED FORT 8. (ISBT. 9. IP COLLEGE 10 OLD SECTT 11. MALL ROAD,12. INS HOSTEL 13. GTB NGR 14.DHAKA 15. NIRANKARI CLY 16. BURARI XING 17. JHARODA MORE 18 JHARODA VILLAGE." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("114:FatehPuri-QutubGarh Border"))
		{ String str = "1. FATEH PURI 2. MORI GATE/ISBT 3.NEW COURT 4.ICE FACTORY 5. ROSHANARA BAGH 6.CLOCK TOWER 7. PS ROSHANARA ROAD 8. MOURICE NGR., 9 PATEL CHEST 10. GTB NGR 11. MODEL TOWN-II 12 .AZAD PUR 13 SHALIMAR BAGH XING 14. ASHOK VIHAR XING 15. PREM BARI PULL 16 WAZIR PUR DEPOT 17. KOHAT ENCLAVE 18. JD BLOCK PRITAM PURA (M ENCLAVE) 19. MADHUVAN CHOWK 20 SARASWATI VIHAR C-BLOCK, 21. PUSPAJALI 22. MANGOL PUR SCHOOL. 23. MANGOL PUR KHURD. 24 AVANTIKA X-ING 25.. BUDH VIHAR, 26. POOTH KALAN, 27. BEGUM PUR, 28 KARALA PATHSHALA 29. RAMA VIHAR, 30. KARALA, 31. DESU OFFICE 32. KANJHAWLA 33 NIRMAL HOSPITAL, 34. LAD PUR, 35 JYONTI X-ING, 36. JYONTI, 37 TATESAR, 38.TATESAR GURUKUL. 39, PUNJAB KHORE 40 JAT KHOR X-ING 41. QUTAB ENCLAVE 42. QUTAB GARH, 43. QUTAB GARH BORDER." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("118:R.P.Bagh-KalyanPuri"))
		{ String str = "1. RP BAGH 2. GUR MANDI 3. MAURICE NGR 4. UNIVERSITY 5. MALL ROAD 6. OLD SECTT.7. IP COLLEGE 8. STA OFFICE 9. TEES HAZARI 10. ISBT 11. RED FORT 12 DARYA GANJ, 13.. DELHI GATE 14. ITO RING ROAD 15. DELHI SECTT. 16.. RAINY WELL 17. T.T. POST, 18. SHAKR PUR SCHOOL BLOCK, 19.. MOTHER DAIRY 20. PS TRILOK PURI 21, TRILOK PURI B-BLOCK 22. CHAND CINEMA . 23. KALYAN PURI," ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("120:Kendriya Term-Narela Term"))
		{ String str = "1. KEND TERMINAL 2. ndpo, 3. PATEL CHOWK 4 FEROZSHAH ROAD, 5.. MANDI HOUSE 6. ITO, 7.. DELHI GATE 8. RAJ GHAT9.. SHANTI VAN 10. VIJAY GHAT 11.. YAMUNA BZR 12.. ISBT RING ROAD 13. IP COLLEGE 14. . OLD SECTT 15. MALL ROAD 16..INS HOSTEL 17 GTB NGR 18. MODEL TOWN-II 19 AZAD PUR 20. . ADARSH NGR 21. JAHANGIR PURI GT ROAD 22.. GTK DEPOT 23. GTK BY PASS 24.. LIBAS PUR 25. GURUDWARA 26.NANGLI POONAM 27,.. BUDH PUR 28.. ALIPUR 29. . PALL XING 30. BAKOLI 31. KHAMPUR 32. TIKRI KHURD XING, 33. SINGHOLA VILLAGE 34. SINGHU VILLAGE 35 SINGHU BORDER 36. RADHA SWAMI SATSANG 37. POLICE CLY. 38. PITHORI, 39. NARELA." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("211:Mori Gate(T)-Mayur Vihar Ph3"))
		{ String str = "1. MORI GATE 2. ISBT 3. SHYAM GIRI MANDIR 4. SHASTRI PARK 5. SEELAM PUR 6. WELCOME 7. KANTI NAGAR 8. SWARN CINEMA 9. HANS APPTT. 10. JAGAT PURI A-BLK.11. K.K.XING 12. HP DEPOT 13. GAZI PUR VILLAGE 14. NHW -24 XING 15. GAZI PUR DAIRY FARM 16. KALYAN PURI 17. KONDALI 18. DALLU PURA 19. MAYUR VIHAR -III XING 20. NEW KONDLY MKT. 21. MAYUR VIHAR PH-III" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("221:Mori Gate(T)-Anand Vihar"))
		{ String str = "1. MORI GATE (T) 2. ISBT 3. SHYAM GIRI MANDIR 4. SHASTRI PARK 5. SEELAM PUR 6. WELCOME 7. SHAHDARA 8. RAILWAY FLYOVER 9.. DILSHAD GARDEN GT RD 10. SHAHDARA BDR. 11 SURYA NGR 12. RAMPRASHTA XING 13. ANAND VIHAR ISBT." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("319:Shahdara-Noida Sec32"))
		{ String str = "1. SHAHDARA 2. KANTI NAGAR, 3. SWARAN TALKIES 4. HANS APPTT. 5. JAGAT PURI A-BLOCK 6. K.K. XING, 7. H.P. DEPOT 8. GAZI PUR VILLAGE. 9. NHW XING 10. VINOD NAGAR 11. KALYAN PURI 12. KONDLI 13. DALLU PURA 14. MAYUR VIHAR PH-III XING 15. JHUND PURA VILLAGE 16. NOIDA SEC-8 17. NOIDA SEC-6 18. NOIDA SEC-2 19.NAYA BANS 20. NOIDA DEPOT 21. ATTA XING, 22. NOIDA SEC-27 23. STAFF QTR. 24. TELEPHONE EXCHANGE 25. POWER HOUSE 26. NOIDA SEC-12 O-BLK. 27. NOIDA SEC-22 XING 28. NOIDA SEC-22 H-BLK. 29. NOIDA SEC-23/53 XING 30. NOIDA SEC-32" ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
		if(s.equalsIgnoreCase("347:ISBT-Noida Sec34)"))
		{ String str = "1. ISBT 2. RED FORT 3. DARYA GANJ, 4. DELHI GATE, 5 RAJ GHAT 6. ITO RING ROAD, 7. DELHI SECTT. 8. RAINY WELL, 9. T.T. POST, 10 SCHOOL BLK SHAKAR PUR, 11. MOTHER DAIRY, 12 SAMASPUR JAGIR VILLAGE 13.PUSHA XING, 14. MAYUR VIHAR XING, 15. SAMACHAR APPTT. 16. HINDON REGULATOR, 17. NOIDA SEC-14, 18. NAYA BANS, 19. NOIDA DEPOT, 20. ATTA CHOWK, 21. NOIDA SEC-27 STAFF QRS. 22. NOIDA SEC-21/25 23. NITHARI VILLAGE, 24. NOIDA SEC-30, 25. NOIDA SEC-37, 26. NOIDA SEC-36, 27. NOIDA DEGREE COLLEGE 28. NOIDA SEC-34 S.BLK, 29. NOIDAS EC-34 UP BUS TERMINUS." ;
		Toast.makeText(getApplicationContext(),str,
		Toast.LENGTH_LONG).show();
		}
		else
			if(s.equalsIgnoreCase("355:Anand Parbat-Noida Sec32"))
			{ String str = "1. ANAND PARBAT 2. DEV NAGAR 3. D.B.GUPTA MKT 4.KAROL BAGH TERMINAL 5.PS PAHAR GANJ 6. NEW DELHI RLY.STN-I 7. MARINA / SUPER BAZAR 8. STATESMAN, 9. MANDI HOUSE, 10. SPREMECOURT, 11. ITPO PRAGATI MAIDAN, 12. PRAGATI MAIDAN 13. RING ROAD XING, 14. ROAD BRIDGE 15. BABA BISHEMBER DASS ASHRAM 16. CPWD OFFICE 17. PUSHTA XING, 18. MAYUR VIHAR PH-I XING, 19. SAMACHAR APPT. 20. HINDON REGULAOR., 21.NOIDA SEC-14, 22. NOIDA SECTOR-2, 23. NAYA BANS 24. NOIDA DEPOT 25. TELEPHONE EXCHANGE 26. STAFF QTR. 27. NOIDA SECTOR-10, 28. NOIDA SEC-12 O BLK. 29. NOIDA SEC-22 H-BLK 30. NOIDA SEC-23/53 XING 31. NOIDA SEC-32" ;
			Toast.makeText(getApplicationContext(),str,
			Toast.LENGTH_LONG).show();
			}
			else
			if(s.equalsIgnoreCase("443:Shahdara-BadarPur"))
			{ String str = "1. SHAHDARA 2. KANTI NGR BIHARI CLY 3. SWARN CINEMA 4. HANS APPTT. 5. JAGAT PURI A-BLK. 6. K.K.XING 7. SWASTHIYA VIHAR 8. SHAKAR PUR 9. SHAKAR PUR SCHOOL BLK. 10. MOTHER DAIRY 11. SAMAS PUR JHANGIR VILLAGE 12. PUSTA XING 13. MAYUR VIHAR PH-I XING 14. SAMACHAR APPTT. 15. HINDON REGULATOR 16. NOIDA SEC-14 17. NOIDA SEC-2 18. NAYA BANS 19. NOIDA DEPOT 20. ATTA CHOWK 21. NOIDA SEC-28/29 22. NOIDA SEC-37 XING 23. AMITY INTERNATIONAL SCHOOL 24. KALINDI KUNJ 25. ABDUL FAZAL ENCL. 26. JASOLA VILLAGE 27. SARITA VIHAR XING 28. SARITA VIHAR 29. MADAN PUR KHADAR XING 30. ALI XING 31. POWER HOUSE 32. BADAR PUR MB ROAD" ;
			Toast.makeText(getApplicationContext(),str,
			Toast.LENGTH_LONG).show();
			}
			else
				if(s.equalsIgnoreCase("534:Anand Vihar-Mehrauli"))
				{ String str = "1. ANAND VIHAR ISBT 2. GAZI PUR DEPOT 3..HASAN PUR DEPOT 4. CHANDER VIHAR .5. BALCO APPTT.6. SARASWATI KUNJ 7. MANGLAM HOSP. 8. MOTHER DAIRY 9 PUSTA XINGB 10. CPWD OFFICE 11. BABA BISHEMBER DASS ASHRAM 12. EAST RD. BRIDGE 13. SARAI KALEKHAN 14. BALA SAHIB GURUDWARA 15. MAHARANI BAGH 16. BHARAT NAGAR 17. HOLI FAMILY XING 18. MODI MILLS 19. KALKAJI MANDIR 20. NEHRU PLACE TRML. 21 O.S.COMMUNICATION 22. MASJID MOTH 23. CHIRAG DELHI 24. SEIKH SARAI PH-II 25. KHIRKI VILL. 26. PRESS ENCLAVE 27. GEETANJALI . 28. PTS 29. QUTAB 30. MEHRAULI" ;
				Toast.makeText(getApplicationContext(),str,
				Toast.LENGTH_LONG).show();
				}
				else
				if(s.equalsIgnoreCase("543:Anand Vihar-S.J.Terminal"))
				{ String str = "1. ANAND VIHAR 2. GAZI PUR DEPOT XING 3. GAZI PUR VILLAGE 4. NATIONAL HIGH WAY XING 5. VINOD NAGAR 6. SAMAS PUR JAHANGIR VILLAGE 7. PUSTA XING 8. CPWD OFFICE 9. BABA BISHMBER DASS ASHRAM 10. ROAD BRIDGE EAST 11. SARAI KALE KHAN ISBT 12. BALA SAHIB GURUDWARA 13. MAHARANI BAGH 14. ASHRAM 15. NEHRU NAGAR 16. LAJPAT NAGAR 17. MCKR HOSP.18. ANDREWS GANJ 19. SOUTH EXTN. 20. AIIMS 21. INA 22. S.J.TERMINAL" ;
				Toast.makeText(getApplicationContext(),str,
				Toast.LENGTH_LONG).show();
				}
				else
					if(s.equalsIgnoreCase("740:Anand Vihar-Uttam Nagar"))
					{ String str = ". ANAND VIHAR ISBT 2. G.P.DEPOT 3. HASAN PUR DEPOT 4. CHANDER VIHAR 5. BALCO APPT. 6. PARIVAR APTT. 7. PRESS APTT. 8. MOTHER DAIRY 9. SCHOOL BLOCK SHAKAR PUR 10. TT POST 11. RAINY WELL 12. DELHI SECTT. 13. ITO (AGCR) 14. MANDI HOUSE 15. FEROZSHAH RD. 16. KRISHI BHAWAN 17. A.I.R./NDPO 18. KEND TERMINAL 19. RML HOSPITAL 20. TALKATORA GARDEN 21. 11 MURTI 22. BHARAT SADHU SMAJ 23. RLY. COLONY 24. TAJ HOTEL 25. DHAULA KUAN 26. GOLF CLUB 27. RR LINES 28. MALL ROAD 29. SHASTRI BAZAR 30. PS SADAR BAZAR 31. KIRBY PLACE 32. JANAK SETU 33. LAJWANTI GARDEN 34. D-BLK JANAK PURI 35. DESU CLY. 36. C-3 JANAK PURI 37. JANAK PURI C-2B 38. C-I JANAKPURI 39. TILAK PUL 40. UTTAM NGR (T)" ;
					Toast.makeText(getApplicationContext(),str,
					Toast.LENGTH_LONG).show();
					}
					

	}
	}
	
    