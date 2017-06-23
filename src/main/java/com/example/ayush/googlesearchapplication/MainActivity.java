package com.example.ayush.googlesearchapplication;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et1 = (EditText) findViewById(R.id.editext);
        Button bt1 = (Button) findViewById(R.id.button);//Decleration
        
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                String term = et1.getText().toString();//gets input from user
                intent.putExtra(SearchManager.QUERY, term);//searches the input in whichever search engine is selected
                startActivity(intent);
            }
        });
    }
}
