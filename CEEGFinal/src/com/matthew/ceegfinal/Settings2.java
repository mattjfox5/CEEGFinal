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
	static RadioGroup b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings2);
		Button Back02 = (Button) findViewById(R.id.Back02);
		final RadioGroup age = (RadioGroup) findViewById (R.id.ageRadioGroup);
		final RadioGroup CSP = (RadioGroup) findViewById (R.id.priorRadioGroup);
		final RadioGroup IED = (RadioGroup) findViewById (R.id.IEDRadioGroup);
		b = (RadioGroup) findViewById (R.id.backgroundRadioGroup);
		Button Calc = (Button) findViewById (R.id.Calc);
		android.app.ActionBar actionBar = getActionBar();
        actionBar.hide();
		Calc.setOnClickListener(new OnClickListener(){
			
			
			public void onClick(View v) {
				Intent iiiiiii = new Intent (Settings2.this, Options.class);
				if(getModelScore(age.getCheckedRadioButtonId() == R.id.less, CSP.getCheckedRadioButtonId() == R.id.priorYes, getString(), IED.getCheckedRadioButtonId() == R.id.IEDYes )> score)
					iiiiiii.putExtra("CEEG", true);
				else
					iiiiiii.putExtra("CEEG", false);
				startActivity(iiiiiii);
			
			}});
		
		
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


		
	
	
	public static String getString() {
		switch( b.getCheckedRadioButtonId())
		{
		case R.id.S_D:
			return "s and d";
		case R.id.D:
			return "d";
		case R.id.B_S:
			return "bs";
		case R.id.A_F:
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

