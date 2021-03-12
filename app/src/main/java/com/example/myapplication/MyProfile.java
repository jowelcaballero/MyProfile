package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MyProfile extends AppCompatActivity {
    Button btnFirstActivity;
    ImageButton imagebtnFacebook, imagebtnInstagram, imagebtnYoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        btnFirstActivity =(Button)findViewById(R.id.btnFirstActivity);
        btnFirstActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyProfile();
            }
        });

        imagebtnFacebook = (ImageButton) findViewById(R.id.imagebtnFacebook);
        imagebtnFacebook.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                openFacebook();
            }
        });
        imagebtnInstagram = (ImageButton) findViewById(R.id.imagebtnInstagram);
        imagebtnInstagram.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                openInstagram();
            }
        });

        imagebtnYoutube = (ImageButton) findViewById(R.id.imagebtnYoutube);
        imagebtnYoutube.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                openYoutube();
            }
        });
    }

    public void openMyProfile()
    {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void openFacebook()
    {
        Uri uri = Uri.parse("https://www.facebook.com/jowel.caballero");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openInstagram()
    {
        Uri uri = Uri.parse("https://www.instagram.com/jowelcaballero/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openYoutube()
    {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=2L8gzAasxCw");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}

