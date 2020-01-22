package com.example.dodolan;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity implements OnClickListener, OnCheckedChangeListener {

    EditText fieldnama,fieldalmt,fieldmeja;
    Button tomboltampil;
    RadioGroup groupjk;
    RadioButton radiolk, radiopr;
    CheckBox cekboxjava, cekboxsa, cekboxnet;
    TextView outputnama, outputalmt, outputjk, outputahli, outputmeja;
    String jk, ahli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        fieldalmt = (EditText)findViewById(R.id.fieldalmt);
        fieldnama = (EditText)findViewById(R.id.fieldnama);
        fieldmeja = (EditText)findViewById(R.id.fieldmeja);
        tomboltampil = (Button)findViewById(R.id.tomboltampil);
        groupjk = (RadioGroup)findViewById(R.id.groupjk);
        cekboxjava = (CheckBox)findViewById(R.id.cekboxjava);
        cekboxsa = (CheckBox)findViewById(R.id.cekboxsa);
        cekboxnet = (CheckBox)findViewById(R.id.cekboxnet);
        outputnama =(TextView)findViewById(R.id.outputnama);
        outputalmt =(TextView)findViewById(R.id.outputalmt);
        outputmeja =(TextView)findViewById(R.id.outputmeja);
        outputahli = (TextView)findViewById(R.id.outputahli);
        outputjk = (TextView)findViewById(R.id.outputjk);
        
        tomboltampil.setOnClickListener(this);
        groupjk.setOnCheckedChangeListener(this);        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View klik) {
        // TODO Auto-generated method stub
    
        outputnama.setText("Nama Anda : "+fieldnama.getText());
        outputalmt.setText("Alamat Anda : "+fieldalmt.getText());
        outputmeja.setText("Nomor Meja : "+fieldmeja.getText());
        if (cekboxjava.isChecked() && cekboxnet.isChecked() && cekboxsa.isChecked()){
            outputahli.setText("Hidangan  : Nasi + Ikan Gurameh, Nasi + Gulai & Nasi + Ayam Bakar");
        }else if(cekboxjava.isChecked() && cekboxnet.isChecked()){
                outputahli.setText("Hidangan: Nasi + Ikan Gurameh & Nasi + Gulai");
        }else if(cekboxjava.isChecked() && cekboxsa.isChecked()){
            outputahli.setText("Hidangan: Nasi + Ikan Gurameh & Nasi + Ayam Bakar");
        }else if(cekboxnet.isChecked() && cekboxsa.isChecked()){
            outputahli.setText("Hidangan: Nasi + Gulai & Nasi + Ayam Bakar");
        }else if(cekboxjava.isChecked()){
            outputahli.setText("Hidangan: Nasi + Gurameh");
        }else if(cekboxnet.isChecked()){
            outputahli.setText("Hidangan: Nasi + Gulai");            
        }else if(cekboxsa.isChecked()){
            outputahli.setText("Hidangan: Nasi + Ayam Bakar");
        }else{
            outputahli.setText("Hidangan: ");
            
        }
        outputjk.setText(jk);
        fieldnama.setText("");
        fieldalmt.setText("");
        fieldmeja.setText("");
        cekboxjava.setChecked(false);
        cekboxsa.setChecked(false);
        cekboxnet.setChecked(false);
        groupjk.clearCheck();
    }

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		
	}
    
    //@Override
    //public void onCheckedChanged(RadioGroup group, int check) {
        // TODO Auto-generated method stub
        //if(check==R.id.radiolk){
            //jk="Pakai Minum : Pakai ";
            
        //}else if(check==R.id.radiopr){
                //jk="Pakai Minum : Tidak";
                
        //}else{
            //jk="Pakai Minum :";
        //}
        
    protected void onCreate1(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

}