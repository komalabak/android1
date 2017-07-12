package com.example.pandadesktop4.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 

        e = (EditText) findViewById(R.id.editText2);

        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = e.getText().toString();
                Toast t =Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);
                t.show();
            }
        });

        //TextView  t = (TextView) findViewById(R.id.textView4);
    }
}
