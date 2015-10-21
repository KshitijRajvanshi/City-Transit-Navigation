package com.example.transport;



import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
public class Dmap extends Activity {
	
	 private WebView iview;
	  private static final FrameLayout.LayoutParams ZOOM_PARAMS =

		  new FrameLayout.LayoutParams(

		  ViewGroup.LayoutParams.FILL_PARENT,

		  ViewGroup.LayoutParams.WRAP_CONTENT,

		  Gravity.BOTTOM);

	public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       this.setContentView(R.layout.dmap);
       this.iview = (WebView)findViewById(R.id.v1);
      

      
       
       FrameLayout mContentView = (FrameLayout) getWindow().

       getDecorView().findViewById(android.R.id.content);

     /*  final View zoom = this.iview..getZoomControls();

       mContentView.addView(zoom, ZOOM_PARAMS);

       zoom.setVisibility(View.VISIBLE);
       this.iview.loadUrl("http://www.4to40.com/images/photo_gallery/delhi_metro_rail_route_map.gif");*/

}

}