package com.example.insertdatainsqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName, etAge, etAddress;
    Button btAdd;
    DatabaseSource studentDatabaseSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentDatabaseSource = new DatabaseSource(this);

        etName=findViewById(R.id.edtName);
        etAge=findViewById(R.id.edtAge);
        etAddress=findViewById(R.id.edtAddress);
        btAdd=findViewById(R.id.btnAdd);


        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseModel databaseModel=new DatabaseModel(etName.getText().toString(),Integer.valueOf(etAge.getText().toString()),etAddress.getText().toString());
                Boolean status= studentDatabaseSource.addStudent(databaseModel);
                if (status){
                    Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(MainActivity.this,"Not Saved",Toast.LENGTH_LONG).show();
            }
        });
    }
}
