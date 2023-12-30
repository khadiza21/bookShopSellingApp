package com.example.bookshopapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class homeP extends AppCompatActivity {


private BottomNavigationView bottomNavigationView;
private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_p);

         bottomNavigationView = findViewById(R.id.bottomNavigationView);
         frameLayout = findViewById(R.id.frameLayout);


//
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.action_home:
//                        // Handle Home click
//                        startActivity(new Intent(homeP.this, homeP.class));
//                        break;
//                    case R.id.action_about:
//                        // Handle About click
//                        startActivity(new Intent(homeP.this, aboutUs.class));
//                        break;
//                    case R.id.action_contact:
//                        // Handle Contact click
//                        startActivity(new Intent(homeP.this, contact.class));
//                        break;
//                    case R.id.action_profile:
//                        // Handle Profile click
//                        startActivity(new Intent(homeP.this, userProfile.class));
//                        break;
//                    case R.id.action_sign_out:
//                        // Handle Sign Out click
//                        startActivity(new Intent(homeP.this, logINP.class));
//                        break;
//                }
//                return true;
//            }
//        });
    }
}
