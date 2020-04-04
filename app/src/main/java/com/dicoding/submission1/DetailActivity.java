package com.dicoding.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String name = "name";
    public static final String photo = "photo";
    public static final String description = "description";
    public static final String salary= "salary";
    public static final String url = "url";
    public static final String birth_of_date = "birth_of_date";
    public static final String current_club = "current_club";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView imgPhoto = findViewById(R.id.img_detail);
        TextView tvTitle = findViewById(R.id.txt_detail_title);
        TextView tvDescription = findViewById(R.id.txt_history_player);
        TextView tvRate = findViewById(R.id.txt_salary);
        TextView tvBirthOfDate = findViewById(R.id.txt_birth_of_date);
        TextView tvPrice = findViewById(R.id.txt_current_club);
        ImageView btUrl = findViewById(R.id.iv_detail_url);
        String getName = getIntent().getStringExtra(name);
        int getPhoto = getIntent().getIntExtra(photo,0);
        String getDescription = getIntent().getStringExtra(description);
        String getSalary = getIntent().getStringExtra(salary);
        String getBirthOfDate = getIntent().getStringExtra(birth_of_date);
        String getCurrentClub = getIntent().getStringExtra(current_club);
        tvTitle.setText(getName);
        tvDescription.setText(getDescription);
        tvRate.setText(getSalary);
        tvBirthOfDate.setText(getBirthOfDate);
        tvPrice.setText(getCurrentClub);
        Glide.with(this)
                .load(getPhoto)
                .apply(new RequestOptions().override(350,350))
                .into(imgPhoto);
        btUrl.setOnClickListener(this);
        this.setTitle("Profile Player");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_detail_url:
                String getUrl = getIntent().getStringExtra(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getUrl));
                startActivity(intent);
        }
    }

}
