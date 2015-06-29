package com.example.laboratorio03;

import android.app.Activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * 
 * @author Leonardo Façanha
 * Professor Bruno Penha - Nota 10 ;)
 * Classe Activity Principal
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
