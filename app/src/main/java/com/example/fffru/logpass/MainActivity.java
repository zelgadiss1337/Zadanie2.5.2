package com.example.fffru.logpass;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static String user_login = "Admin";
    static String user_password = "qwerty123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText log = findViewById(R.id.editText);
        final EditText pass = findViewById(R.id.editText2);
        final Button enter = findViewById(R.id.button);
        final TextView res = findViewById(R.id.textView);

        enter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if ((log.getText().toString().equals(user_login)) && (pass.getText().toString().equals(user_password))) {
                    res.setTextColor(Color.GREEN);
                    res.setText("Login and Password are correct");
                } else {
                    res.setTextColor(Color.RED);
                    res.setText("Login or Password are incorrect");
                }
                log.setText("Admin");
                pass.setText("qwerty123");
            }
        });
    }
}
