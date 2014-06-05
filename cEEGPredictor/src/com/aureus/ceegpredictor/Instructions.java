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
import android.os.Build;

public class Instructions extends ActionBarActivity {

	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);
	    return super.onCreateOptionsMenu(menu);

	  }  
	
	
	@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.instructions);
	        Button Continue01 = (Button) findViewById(R.id.Continue01);
	        
	        Continue01.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					Intent ii = new Intent (Instructions.this, Settings1.class);
					startActivity(ii);
					
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

}
