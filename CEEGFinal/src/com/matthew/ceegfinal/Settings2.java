package com.matthew.ceegfinal;

import java.util.*;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import android.os.Build;

public class Settings2 extends ActionBarActivity {

	double score;
	static Spinner  spinner1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings2);
		Button Back02 = (Button) findViewById(R.id.Back02);
		final Switch Age = (Switch) findViewById (R.id.Age);
		final Switch CSP = (Switch) findViewById (R.id.CSP);
		final Switch IED = (Switch) findViewById (R.id.IED);
		spinner1 = (Spinner)findViewById(R.id.spinner1);
		Button Calc = (Button) findViewById (R.id.Calc);
		
		Calc.setOnClickListener(new OnClickListener(){
			
			
			public void onClick(View v) {
				Intent iiiiiii = new Intent (Settings2.this, Options.class);
				if(getModelScore(Age.isChecked(), CSP.isChecked(), getString(), IED.isChecked()) > score)
					iiiiiii.putExtra("CEEG", true);
				else
					iiiiiii.putExtra("CEEG", false);
				startActivity(iiiiiii);
			
			}});
		
		List<String> values = new ArrayList<String>();
		values.add("Slow and Discontinuous");
		values.add("Discontinuous");
		values.add("Burst Suppression");
		values.add("Attenuated and Featureless");
		
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, values);
		spinner1.setAdapter(dataAdapter);
		Back02.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
			Intent i = new Intent (Settings2.this, Settings1.class);
			startActivity(i);
				
			}
		
		});
 
	Intent intent = getIntent();
	if (intent.getDoubleExtra("score", 0.0)!= 0.0);
		score = intent.getDoubleExtra("score", 0.0);
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		
	}
	
	public static String getString() {
		switch(spinner1.getSelectedItem().toString())
		{
		case "Slow and Discontinuous":
			return "s and d";
		case "Discontinuous":
			return "d";
		case "Burst Suppression":
			return "bs";
		case "Attenuated and Featureless":
			return "a and f";
			
		}
		return "";
	}
	public static double getModelScore(boolean baby, boolean existingSeizures, String background, boolean discharges) {
		if(baby) {
			if(existingSeizures) {
				if(discharges) {
				switch(background)
				{
				case "s and d":
				return .8126;
				case "d":
				return .7786;
				case "bs":
				return .8924;
				case"a and f":
				return .8808;
				}
				} else {
				switch(background)
				{
				case "s and d":
				return .4110;
				case "d":
				return .3613;
				case "bs":
				return .5715;
				case"a and f":
				return .5430;
				}
				}
			} else {
			if(discharges) {
				switch(background)
				{
				case "s and d":
				return .6596;
				case "d":
				return .6111;
				case "bs":
				return .7874;
				case"a and f":
				return .7675;
				}
				} else {
				switch(background)
				{
				case "s and d":
				return .2376;
				case "d":
				return .2018;
				case "bs":
				return .3734;
				case"a and f":
				return .3468;
				}
				}
			
			}
		} else {
			if(existingSeizures) {
				if(discharges) {
				switch(background)
				{
				case "s and d":
				return .6363;
				case "d":
				return .5866;
				case "bs":
				return .7698;
				case"a and f":
				return .7488;
				}
				} else {
				switch(background)
				{
				case "s and d":
				return .2197;
				case "d":
				return .1859;
				case "bs":
				return .3498;
				case"a and f":
				return .3241;
				}
				}
			} else {
			if(discharges) {
				switch(background)
				{
				case "s and d":
				return .4388;
				case "d":
				return .3880;
				case "bs":
				return .5991;
				case"a and f":
				return .5712;
				}
				} else {
				switch(background)
				{
				case "s and d":
				return .1117;
				case "d":
				return .0926;
				case "bs":
				return .1938;
				case"a and f":
				return .1764;
				}
				}
			
			}
		}
		return -1;
	}

}
