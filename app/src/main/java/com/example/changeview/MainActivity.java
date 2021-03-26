package com.example.changeview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn = (ImageButton)findViewById(R.id.login_btn);
        btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);
            }
        });




//        btns[0].setOnClickListener(new ImageButton.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                tab.removeAllTabs();
//            }
//        });

//        for(int i = 0;i<btns.length;i++){
//            btns[i].setOnClickListener(new ImageButton.OnClickListener(){
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(getApplicationContext(), ClickActivity.class);
//                    startActivity(intent);
//
//                    //
//                }
//            });
//        }

    }
}