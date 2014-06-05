package com.aureus.ceegpredictor;

import com.aureus.ceegpredictor.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.os.Build;

@SuppressLint("ResourceAsColor") public class Options extends Activity {

	
	TextView textview1;
	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);
	    return super.onCreateOptionsMenu(menu);

	  } 
	
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        RelativeLayout layout = new RelativeLayout(this);
		layout.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		Intent intent = getIntent();
		if(intent.getBooleanExtra("CEEG", false)) {

			
			
		
			RelativeLayout RL = new RelativeLayout (this);
			RL.setBackgroundColor(android.R.color.darker_gray);
			RelativeLayout.LayoutParams para = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			RL.setLayoutParams(para);
			
			
			
			GifWebView w = new GifWebView(this, "file:///android_asset/recommended.gif");
			w.setScrollContainer(false);
			RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
			params.addRule(RelativeLayout.CENTER_IN_PARENT);
			w.setLayoutParams(params);
			
			
			Button reset = new Button (this);
			reset.setText("Reset");
			reset.setTextSize(20);
			RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			p.addRule(RelativeLayout.CENTER_HORIZONTAL);
			p.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
			
			reset.setLayoutParams(p);
			 reset.setOnClickListener(new OnClickListener () {

				@Override
				public void onClick(View v) {
					Intent i = new Intent(Options.this, Disclaimer.class);
					startActivity(i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				}
				 
				 
				 
			 });
			
			
			textview1 = new TextView(this);
			textview1.setId(11235813);
			textview1.setText("Continuous EEG is");
			textview1.setTextSize(20);
			textview1.setPadding(0, 50, 0, 10);
			RelativeLayout.LayoutParams paramss = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			paramss.addRule(RelativeLayout.CENTER_HORIZONTAL);
			paramss.addRule(RelativeLayout.ALIGN_PARENT_TOP);
			
			
			textview1.setLayoutParams(paramss);
			
			
			TextView textview12 = new TextView(this);
			textview12.setText("RECOMMENDED");
			textview12.setTextSize(40);
			textview12.setTypeface(null, Typeface.BOLD);
			textview12.setTextColor(Color.RED);
			RelativeLayout.LayoutParams paramsss = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			paramsss.addRule(RelativeLayout.CENTER_HORIZONTAL);
			paramsss.addRule(RelativeLayout.BELOW, textview1.getId());

			textview12.setLayoutParams(paramsss);
			
			
			layout.addView(textview1);
			layout.addView(textview12);
			layout.addView(w);
			layout.addView(reset);
			layout.addView(RL);
			setContentView(layout);
			
		} else {
			setContentView(R.layout.optional);
			RelativeLayout layout2 = new RelativeLayout(this);
			layout.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			GifWebView ww = new GifWebView(this, "file:///android_asset/optional.gif");
			ww.setScrollContainer(false);
			RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
			params.addRule(RelativeLayout.CENTER_IN_PARENT);
			ww.setLayoutParams(params);
			
			Button reset = new Button (this);
			reset.setText("Reset");
			reset.setTextSize(20);
			RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			p.addRule(RelativeLayout.CENTER_HORIZONTAL);
			p.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
			
			reset.setLayoutParams(p);
			 reset.setOnClickListener(new OnClickListener () {

				@Override
				public void onClick(View v) {
					Intent i = new Intent(Options.this, Disclaimer.class);
					startActivity(i);
				}
				 
				 
				 
			 });
			
			
			textview1 = new TextView(this);
			textview1.setId(11235813);
			textview1.setText("Continuous EEG is");
			textview1.setTextSize(20);
			textview1.setPadding(0, 50, 0, 10);
			RelativeLayout.LayoutParams paramss = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			paramss.addRule(RelativeLayout.CENTER_HORIZONTAL);
			paramss.addRule(RelativeLayout.ALIGN_PARENT_TOP);
			
			textview1.setLayoutParams(paramss);
			
			
						
			
			TextView textview1222 = new TextView(this);
			textview1222.setText("OPTIONAL");
			textview1222.setTextSize(40);
			textview1222.setTypeface(null, Typeface.BOLD);
			textview1222.setTextColor(Color.GREEN);
			RelativeLayout.LayoutParams paramssss = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			paramssss.addRule(RelativeLayout.CENTER_HORIZONTAL);
			paramssss.addRule(RelativeLayout.BELOW, textview1.getId());
			
			textview1222.setLayoutParams(paramssss);
			
			
						
			
			layout2.addView(textview1);
			layout2.addView(textview1222);
			layout2.addView(ww);
			layout2.addView(reset);
			setContentView(layout2);
			
			
			
					
			
		
		
	}}

	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
       
    	Intent i = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://onlinelibrary.wiley.com/journal/10.1111/(ISSN)1528-1167") );
  	   startActivity(i);
     

                             
        return true; 
    }

	
	
	}


