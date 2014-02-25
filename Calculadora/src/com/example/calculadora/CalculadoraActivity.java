package com.example.calculadora;

import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraActivity extends Activity {
	
	private TextView display;
	private boolean novoInsert = true;
	private ArrayList<Integer> numeros = new ArrayList<Integer>(); 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        
        display = (TextView) findViewById(R.id.display);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calculadora, menu);
        return true;
    }
    
    public void onNumberPressed(View view)
    {
    	// Cast a view do tipo View para o tipo Button para poder efectuar o metodo getText()
    	String texto = ((Button) view).getText().toString();
    	
    	if(novoInsert)
    	{
    		display.setText(texto);
    		novoInsert = false;
    	}
    	else
    		display.setText(display.getText() + texto);
    }
    
    public void onEnterPressed(View view)
    {
    	
    	int numero1 = Integer.parseInt(display.getText().toString());
    	numeros.add(numero1);
    	
    	novoInsert = true;
    	display.setText("0");
    
    }
    
    public void onOperationPressed(View view)
    {
    	String operacao = ((Button) view).getText().toString();
    	int posicoes = numeros.size();
    	int resultado=0;
    	
    	if (operacao.equals("+"))
    	{
    		for (int i = 0; i<posicoes; i++)
    		{
    			resultado += numeros.get(i);
    		}
    	}
    	
    	display.setText(String.valueOf(resultado));
    	
    	numeros.clear();
    }
    
}
