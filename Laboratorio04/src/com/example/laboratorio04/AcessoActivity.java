package com.example.laboratorio04;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * 
 * @author Leonardo Façanha
 * Professor Bruno Penha - Nota 10 ;)
 * Classe Activity Principal de acesso
 *
 */


public class AcessoActivity extends Activity {
	
	private Button botaoOk;
	private Button botaoLimpar; 
	private EditText acesso; 
	private EditText senha; 
	private TextView resultado; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_acesso);
		
		acesso = (EditText) findViewById(R.id.acessoEditText);
		senha = (EditText) findViewById(R.id.senhaEditText);
		resultado = (TextView) findViewById(R.id.resultadoTextview);
		
		
		botaoOk = (Button) findViewById(R.id.acessoButton);
		botaoOk.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				okButtonAction();
				
			}

			private void okButtonAction() {
				String acessoInserido = acesso.getText().toString();
				String senhaInserida = senha.getText().toString();
				
				if (acessoInserido.equals("admin") && senhaInserida.equals("111111")) {
					resultado.setText("Ok");
				} else{
					resultado.setText("Negado");
				}
			}
		});
		
		botaoLimpar = (Button) findViewById(R.id.limparButton);
		botaoLimpar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				limparButtonAction();
				
			}

			private void limparButtonAction() {
				acesso.setText(null);
				senha.setText(null);
				resultado.setText(null);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.acesso, menu);
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
