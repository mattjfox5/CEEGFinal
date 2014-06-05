package com.aureus.ceegpredictor;

import com.aureus.ceegpredictor.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.os.Build;

public class Settings1 extends ActionBarActivity {

	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);
	    return super.onCreateOptionsMenu(menu);

	  } 
	
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.settings1);
	        Button Back01 = (Button) findViewById(R.id.Back01);
	        Button Continue02 = (Button) findViewById (R.id.Continue02);
	        final RadioGroup ssGroup = (RadioGroup)findViewById (R.id.ssGroup);
	        
	        ssGroup.check(R.id.radio2);
	        
	        
	        Back01.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					Intent iii = new Intent (Settings1.this, Instructions.class);

					startActivity(iii);
					
				}
				
				
				
	        });
			Continue02.setOnClickListener (new OnClickListener() {

				@Override
				public void onClick(View v) {
					Intent iiii = new Intent (Settings1.this, Settings2.class);
					iiii.putExtra("score", findScore(ssGroup.getCheckedRadioButtonId()));
					startActivity(iiii);
					
				}
				
			});

	        
	        	
	        	
	        	
	       
	 }
	        
	        
	

	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
       
    	Intent i = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://onlinelibrary.wiley.com/journal/10.1111/(ISSN)1528-1167") );
  	   startActivity(i);
     

                             
        return true; 
    }

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		
	}
	
	public double findScore(int id) {
		switch(id){
		case R.id.radio0:
			return .1;
		case R.id.radio1:
			return .15;
		case R.id.radio2:
			return .2;
		case R.id.ee:
			return .25;
		case R.id.eee:
			return .35;
		case R.id.eeee:
			return .45;
		}
		return -1;
	} 

}
