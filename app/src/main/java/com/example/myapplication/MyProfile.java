package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MyProfile extends AppCompatActivity {
    ImageButton imagebtnFirstActivity;
    ImageButton imagebtnFacebook;
    ImageButton imagebtnInstagram;
    ImageButton imagebtnYoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        imagebtnFirstActivity =(ImageButton)findViewById(R.id.imagebtnFirstActivity);
        imagebtnFirstActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfile.this, FirstActivity.class);
                startActivity(intent);
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
        Uri uri = Uri.parse("https://www.youtube.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}

