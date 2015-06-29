package com.example.laboratorio06;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Gallery;

/**
 * 
 * @author Leonardo Façanha
 * Professor Bruno Penha - Nota 10
 * Classe Principal Acivity 
 *
 */

public class PrincipalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		
		Gallery minhaGaleria = (Gallery) findViewById(R.id.galeriaImagem);		
		minhaGaleria.setAdapter(new AdaptadorImagens(this));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.principal, menu);
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
