package com.example.weatherapp321;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp321.adapter.HoursAdapter;
import com.example.weatherapp321.bean.DayWeatherBean;

public class HoursActivity extends AppCompatActivity {
    private RecyclerView rlvHours;
    private HoursAdapter mHoursAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hours);

        rlvHours=findViewById(R.id.rlv_hours);
        Intent intent=getIntent();
        DayWeatherBean weatherBean=(DayWeatherBean) intent.getSerializableExtra("hours");
        if(weatherBean==null){
            return;
        }
        mHoursAdapter=new HoursAdapter(this,weatherBean.getHoursBeans());
        rlvHours.setAdapter(mHoursAdapter);
        rlvHours.setLayoutManager(new LinearLayoutManager(this));
    }
}