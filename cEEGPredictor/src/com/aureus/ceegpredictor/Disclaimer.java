package com.aureus.ceegpredictor;

import com.aureus.ceegpredictor.R;
import com.aureus.textjustify.TextViewEx;

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
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RadioGroup;
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

	        
	        TextViewEx textViewEx = (TextViewEx) findViewById(R.id.textViewEx);
		    textViewEx.setText("Disclaimer: This app is meant to complement the model developed in the manuscript, �Development and validation of a seizure prediction model in critically ill children� by Yang, et al. 2014. (link to article) The user is assumed to have read and understood the limitations of the model and is familiar with the use of continuous EEG. This model has several limitations and is not meant to substitute for rigorous clinical evaluation. No medical decision should be based solely on the results of this program. The creators of this app take no responsibility for its use in clinical practice.", true);
	  
	        
	        
	        
	        
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
		
	


