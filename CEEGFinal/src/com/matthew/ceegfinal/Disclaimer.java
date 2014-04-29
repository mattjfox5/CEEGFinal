package com.matthew.ceegfinal;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class Disclaimer extends ActionBarActivity {


	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.disclaimer);
	        
	        Button agree = (Button) findViewById(R.id.agree);
	        
	        agree.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					Intent i = new Intent(Disclaimer.this, Instructions.class );
					startActivity(i);
				}
	       
	        	
	        
	        });
	 }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	

    	
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.disclaimer, menu);
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
    public void FullText (View view){
 	   Intent i = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.google.com") );
 	   startActivity(i);
    

                            
                     }
    }
		
	


