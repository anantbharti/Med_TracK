package com.example.medapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ContactUs extends AppCompatActivity {

    ImageView igAnant,fbAnant,linkAnant,mailAnant,webAnant,twitAnant,igGourav,fbGourav,linkGourav,mailGourav,webGourav,tweetGourav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        setupViews();

        igAnant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.instagram.com/anantbharti_happy/");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        fbAnant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.facebook.com/anant.bharti.940");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        linkAnant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.linkedin.com/in/anant-bharti-5173a9197/");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        mailAnant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("mailto:anantbharti.ab@gmail.com");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        webAnant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://anant--bharti.web.app/");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        twitAnant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://twitter.com/anant30atbi");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        igGourav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.instagram.com/pro_cras_tina_tor/");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        fbGourav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.facebook.com/gourav.modi.798");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        linkGourav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.linkedin.com/in/gourav-modi-10b3591a1/");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        mailGourav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("mailto:gouravmodi10@gmail.com");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        webGourav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://gourav-jsr.netlify.app/");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
//        tweetGourav.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Uri uri=Uri.parse("https://twitter.com/anant30atbi");
//                startActivity(new Intent(Intent.ACTION_VIEW,uri));
//            }
//        });

    }

    private void setupViews() {
        igAnant=findViewById(R.id.ig_anant);
        fbAnant=findViewById(R.id.fb_anant);
        linkAnant=findViewById(R.id.link_anant);
        mailAnant=findViewById(R.id.mail_anant);
        webAnant=findViewById(R.id.web_anant);
        twitAnant=findViewById(R.id.twit_anant);
        igGourav=findViewById(R.id.ig_gourav);
        fbGourav=findViewById(R.id.fb_gourav);
        linkGourav=findViewById(R.id.link_gourav);
        mailGourav=findViewById(R.id.mail_gourav);
        webGourav=findViewById(R.id.web_gourav);
        tweetGourav=findViewById(R.id.tweet_gourav);
    }
}