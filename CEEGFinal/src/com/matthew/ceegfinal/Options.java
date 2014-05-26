package com.matthew.ceegfinal;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.os.Build;

public class Options extends Activity {

	
	TextView textview1;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getActionBar();
        actionBar.hide();
        RelativeLayout layout = new RelativeLayout(this);
		layout.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		Intent intent = getIntent();
		if(intent.getBooleanExtra("CEEG", false)) {

			GifWebView w = new GifWebView(this, "file:///android_asset/recommended.gif");
			w.setScrollContainer(false);
			RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
			params.addRule(RelativeLayout.CENTER_IN_PARENT);
			w.setLayoutParams(params);
			
			
			textview1 = new TextView(this);
			textview1.setId(11235813);
			textview1.setText("Continuous EEG is");
			textview1.setTextSize(20);
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
			
			
			
			
			
			textview1 = new TextView(this);
			textview1.setId(11235813);
			textview1.setText("Continuous EEG is");
			textview1.setTextSize(20);
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
			setContentView(layout2);
			
			
			
			
			
			
		
		
	}}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options, menu);
		return true;
	}

	
	
	}


