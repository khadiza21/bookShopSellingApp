package com.example.bookshopapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.TextView;
import android.content.Intent;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;



public class signUp extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //start

        TextView textView = findViewById(R.id.textView);

        SpannableString spannableString = new SpannableString("Already have an Account? Login");

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                // Handle the click event, e.g., navigate to another intent page
                Intent intent = new Intent(signUp.this, login.class);
                startActivity(intent);
            }
        };

        // Set the clickable span only for the word "Login"
        spannableString.setSpan(clickableSpan, 23, 28, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

//end

}