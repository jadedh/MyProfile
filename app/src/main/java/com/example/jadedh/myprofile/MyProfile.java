package com.example.jadedh.myprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MyProfile extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myprofile.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(DisplayMessageActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.name);
        textView.setText(message);
    }

    public void EditPage(View view)
    {
        Intent intent = new Intent(MyProfile.this, DisplayMessageActivity.class);
        startActivity(intent);
    }


}
