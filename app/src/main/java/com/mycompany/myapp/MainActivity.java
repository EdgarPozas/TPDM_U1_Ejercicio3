package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
	private EditText nombre,sueldo;
	private TextView txt;
	private RadioGroup radio;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    	
		nombre=findViewById(R.id.nombre);
		sueldo=findViewById(R.id.sueldo);
		txt=findViewById(R.id.txtsueldo);
		radio=findViewById(R.id.radio);
	}
	public void calcular(View v){
		if(nombre.getText().toString().isEmpty()||sueldo.getText().toString().isEmpty()){
			Toast.makeText(MainActivity.this,"Deben estar llenos los campos",Toast.LENGTH_SHORT).show();
			return;
		}
		float suel=Float.parseFloat(sueldo.getText().toString());
		float mul=0;
		
		View rb=radio.findViewById(radio.getCheckedRadioButtonId());
		int index=radio.indexOfChild(rb);
		float[] valores={0.05f,0.07f,0.1f,0.15f,0.25f,0.35f};
		mul=valores[index];
		txt.setText("Su prestamo es de "+(suel*mul));
		
	}
}
