package com.example.jadedh.myprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MyProfile.class);

        EditText editText = (EditText) findViewById(R.id.editText6);
        EditText et_blood_group = (EditText) findViewById(R.id.editText7);
        EditText et_education = (EditText) findViewById(R.id.editText14);
        EditText et_work = (EditText) findViewById(R.id.editText9);
        EditText et_mobile = (EditText) findViewById(R.id.editText9);
        EditText et_gender = (EditText) findViewById(R.id.editText10);
        EditText et_marriage = (EditText) findViewById(R.id.editText11);
        EditText et_dob = (EditText) findViewById(R.id.editText12);
        EditText et_email = (EditText) findViewById(R.id.editText13);

        String message = editText.getText().toString();
        String str_blood_group = et_blood_group.getText().toString();
        String str_education = et_education.getText().toString();
        String str_work = et_work.getText().toString();
        String str_mobile = et_mobile.getText().toString();
        String str_gender = et_gender.getText().toString();
        String str_marriage = et_marriage.getText().toString();
        String str_dob = et_dob.getText().toString();
        String str_email = et_email.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra("bloodgroup", str_blood_group);
        intent.putExtra("education",str_education);
        intent.putExtra("work",str_work);
        intent.putExtra("mobile",str_mobile);
        intent.putExtra("gender",str_gender);
        intent.putExtra("marriage",str_marriage);
        intent.putExtra("dob",str_dob);
        intent.putExtra("email",str_email);
        startActivity(intent);
    }
}
