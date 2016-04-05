package com.example.contactlistapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class ContactSettingsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_settings);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact_settings, menu);
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
	private void initListButton() {
        ImageButton list = (ImageButton) findViewById(R.id.imageButtonList);   //1
		 list.setOnClickListener(new View.OnClickListener()
 {      //2
		 public void onClick(View v) {
			Intent intent = new Intent (ContactSettingsActivity.this, ContactListActivity.class);
				 intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				 startActivity(intent);
			 }
		  });
	}
	
	private void initMapButton() {
     ImageButton list = (ImageButton) findViewById(R.id.imageButtonMap);   //1
		 list.setOnClickListener(new View.OnClickListener()
{      //2
		 public void onClick(View v) {
			Intent intent = new Intent (ContactSettingsActivity.this, ContactMapActivity.class);
				 intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				 startActivity(intent);
			 }
		  });
	}
	
	private void initSettingsButton() {
     ImageButton list = (ImageButton) findViewById(R.id.imageButtonSettings);   //1
		 list.setOnClickListener(new View.OnClickListener()
{      //2
		 public void onClick(View v) {
			Intent intent = new Intent (ContactSettingsActivity.this, ContactActivity.class);
				 intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				 startActivity(intent);
			 }
		  });}
}
