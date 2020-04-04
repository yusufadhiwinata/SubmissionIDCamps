package com.dicoding.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageView btnBack = findViewById(R.id.iv_back);
        ImageView ivConsole = findViewById(R.id.iv_console);
        ImageView ivWhatsapp = findViewById(R.id.iv_whatsapp);
        ImageView ivInstagram = findViewById(R.id.iv_instagram);
        ImageView ivDicoding = findViewById(R.id.iv_dicoding);
        ivConsole.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        ivWhatsapp.setOnClickListener(this);
        ivInstagram.setOnClickListener(this);
        ivDicoding.setOnClickListener(this);
        this.setTitle("Profile");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.iv_back:
                Intent backIntent = new Intent(ProfileActivity.this,MainActivity.class);
                startActivity(backIntent);
                finish();
                break;
            case R.id.iv_console:
                Intent consoleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Ashcorps+Ltd."));
                startActivity(consoleIntent);
                break;
            case R.id.iv_whatsapp:
                Intent  whatsappIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=6287774722625"));
                startActivity(whatsappIntent);
                break;
            case R.id.iv_instagram:
                Intent instagramIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/yusufadhiwinata_/"));
                startActivity(instagramIntent);
                break;
            case R.id.iv_dicoding:
                Intent dicodingIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dicoding.com/"));
                startActivity(dicodingIntent);
                break;
        }
    }
}
