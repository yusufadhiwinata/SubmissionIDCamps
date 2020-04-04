package com.dicoding.submission1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlayer;
    private ArrayList<Player> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPlayer = findViewById(R.id.rv_player);
        rvPlayer.setHasFixedSize(true);
        list.addAll(PlayerData.getListData());
        showRecyclerCardView();
        this.setTitle("FIFA BEST PLAYER");
    }
    private void showRecyclerCardView(){
        rvPlayer.setLayoutManager(new LinearLayoutManager(this));
        CardViewPlayerAdapter cardViewPlayerAdapter= new CardViewPlayerAdapter(list);
        rvPlayer.setAdapter(cardViewPlayerAdapter);

        cardViewPlayerAdapter.setOnItemClickCallback(new CardViewPlayerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Player data) {
                Intent details=new Intent(MainActivity.this, DetailActivity.class);
                details.putExtra(DetailActivity.name, data.getName());
                details.putExtra(DetailActivity.photo, data.getPhoto());
                details.putExtra(DetailActivity.salary,data.getSalary());
                details.putExtra(DetailActivity.description,data.getDetail());
                details.putExtra(DetailActivity.current_club,data.getCurrent_club());
                details.putExtra(DetailActivity.birth_of_date,data.getBirthOfDate());
                details.putExtra(DetailActivity.url,data.getUrl());
                startActivity(details);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                ShowProfile();
                break;
        }
    }
    private void ShowProfile(){
        startActivity(new Intent(this,ProfileActivity.class));
    }
}