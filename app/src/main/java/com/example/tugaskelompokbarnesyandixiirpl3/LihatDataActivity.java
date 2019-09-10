package com.example.tugaskelompokbarnesyandixiirpl3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LihatDataActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listdata);

//        Button showMenu = findViewById(R.id.popup);
//        showMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Membuat Instance/Objek dari PopupMenu
//                PopupMenu popupMenu = new PopupMenu(LihatDataActivity.this, view);
//                popupMenu.setOnMenuItemClickListener(LihatDataActivity.this);
//                popupMenu.inflate(R.menu.popup_menu);
//                popupMenu.show();
//            }
//        });
        btn = (Button) findViewById(R.id.popup);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.popup:
                Intent input = new Intent(this, InputDataActivity.class);
                startActivity(input);
                break;
        }

//    @Override
//    public boolean onMenuItemClick(MenuItem menuItem) {
//        switch (menuItem.getItemId()){
//            case R.id.menu1:
//                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.menu2:
//                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.menu3:
//                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT).show();
//                break;
//
//        }
//        return true;
//    }


    }
}