package com.kamak.workshop2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtnama;
    Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnama=(EditText)findViewById(R.id.entry);//deklarasi objek edittext
        btnok=(Button)findViewById(R.id.ok);//deklarasi objek button

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hai "+txtnama.getText(), Toast.LENGTH_LONG).show();
                //fungsi memanggil aksi tombol
            }
        });
    }
}
