package com.example.dodolan;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends Activity {
	Button button1;
	Button button2;
	Button button3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		button1=(Button)findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View Makan) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity2.this, MainActivity.class);
				startActivity(i);
			}
		});
		
		button2=(Button)findViewById(R.id.button2);
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View Minum) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity2.this, MainActivity3.class);
				startActivity(i);
			}
		});
		
		button3=(Button)findViewById(R.id.button3);
		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		}); 
	
	}
			
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		//Inflate the menu;this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main,menu);
		return true;
	}
}