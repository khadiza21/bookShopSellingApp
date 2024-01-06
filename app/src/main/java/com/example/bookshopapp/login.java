package com.example.bookshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName, etPass;
    Button btnOk, btnReset;
    String Name, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etName=(EditText) findViewById(R.id.editTextUsername);
        etPass=(EditText) findViewById(R.id.editTextPassword);
        btnOk=(Button) findViewById(R.id.buttonLogin);
        btnReset=(Button) findViewById(R.id.buttonRESET);


        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ok Button", Toast.LENGTH_SHORT).show();
                Name = etName.getText().toString();
                Password = etPass.getText().toString();

                if ((Name.equals("Khadiza")) && (Password.equals("192002040"))) {
                    Intent intent = new Intent(getApplicationContext(), tempCalculate.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Redirecting..", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Wrong Name and ID", Toast.LENGTH_SHORT).show();


                }}
        });



        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnReset.setBackgroundColor(Color.GRAY);
                Toast.makeText(getApplicationContext(), "Reset Button",
                        Toast.LENGTH_SHORT).show();
            }
        });



    }
}