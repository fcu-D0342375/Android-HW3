package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.id.button2;

public class HelloActivity extends AppCompatActivity {

    private Button button2 ;
    private EditText et_input2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        et_input2 = (EditText) findViewById(R.id.editText2);
        button2 = (Button) findViewById(R.id.button2);


        Intent intent = new Intent();

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String input = et_input2.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("INPUT",input);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }


}
