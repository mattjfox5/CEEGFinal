package com.aureus.ceegpredictor;

import com.aureus.ceegpredictor.R;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Disclaimer extends ActionBarActivity {

	RelativeLayout Disclaimer;
	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);
	    return super.onCreateOptionsMenu(menu);

	  } 
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
    public boolean onOptionsItemSelected(MenuItem item) {
       
    	Intent i = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://onlinelibrary.wiley.com/journal/10.1111/(ISSN)1528-1167") );
  	   startActivity(i);
     

                             
        return true; 
    }

 
        @Override
        protected void onDestroy() {
             
            super.onDestroy();
   
        }
             
        

        

        
        
	public void FullText (View view){
 	   Intent i = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://onlinelibrary.wiley.com/journal/10.1111/(ISSN)1528-1167") );
 	   startActivity(i);
    

                            
                     }
    }
		
	


