package com.example.mindteaser;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity
{

	private static final String TAG = "MindTeaser";
	
	//private static EditText et;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.i(TAG, "Entered the onCreate() method");
		
		
		
		
		//Obter os valores do input field Escolha Valores
		findViewById(R.id.BT_1).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				EditText et = (EditText) findViewById(R.id.input1);
				String xpto = et.getText().toString();
				
				//Toast.makeText(MainActivity.this,xpto, Toast.LENGTH_SHORT).show();
				
				CheckBox check1 = (CheckBox) findViewById(R.id.checkBox1);
				CheckBox check2 = (CheckBox) findViewById(R.id.checkBox2);
				CheckBox check3 = (CheckBox) findViewById(R.id.checkBox3);
				CheckBox check4 = (CheckBox) findViewById(R.id.checkBox4);
				
				if (check1.isChecked())
				{
					Toast.makeText(MainActivity.this,"+", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
		
	}

	

}
