package com.example.tugaskelompokbarnesyandixiirpl3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    Button info,lihat,tambah;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        tambah = (Button) findViewById(R.id.inputdata);
        tambah.setOnClickListener(this );
        info= (Button) findViewById(R.id.informasi);
        info.setOnClickListener(this );
        lihat = (Button) findViewById(R.id.lihatdata);
        lihat.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.inputdata:
                Intent input = new Intent(this, InputDataActivity.class);
                startActivity(input);
                break;
            case R.id.lihatdata:
                Intent lihat = new Intent(this, LihatDataActivity.class );
                startActivity(lihat);
                break;
            case R.id.informasi:
                Intent info = new Intent(this, LihatDataActivity.class );
                startActivity(info);
                break;
        }
    }
}
