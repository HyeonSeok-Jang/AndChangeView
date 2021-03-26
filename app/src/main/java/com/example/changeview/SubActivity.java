package com.example.changeview;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        ImageButton[] btns = new ImageButton[4];

        btns[0] = (ImageButton)findViewById(R.id.lowerbtn1);
        btns[1] = (ImageButton)findViewById(R.id.lowerbtn2);
        btns[2] = (ImageButton)findViewById(R.id.lowerbtn3);
        btns[3] = (ImageButton)findViewById(R.id.lowerbtn4);

        LinearLayout[] lay = new LinearLayout[4];

        lay[0] = (LinearLayout)findViewById((R.id.mainscreen1));
        lay[1] = (LinearLayout)findViewById((R.id.mainscreen2));
        lay[2] = (LinearLayout)findViewById((R.id.mainscreen3));
        lay[3] = (LinearLayout)findViewById((R.id.mainscreen4));
        for(int j =0;j<lay.length;j++){
            lay[j].setVisibility(View.INVISIBLE);
        }
        lay[0].setVisibility(View.VISIBLE);
        for(int i = 0;i<lay.length;i++){
            btns[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for(int j =0;j<lay.length;j++){
                        lay[j].setVisibility(View.INVISIBLE);
                        btns[j].setImageResource(R.drawable.btnoff);

                    }

                    if(btns[0].getId()==v.getId()){
                        lay[0].setVisibility(View.VISIBLE);
                        btns[0].setImageResource(R.drawable.btnon);
                    }else if(btns[1].getId()==v.getId()){
                        lay[1].setVisibility(View.VISIBLE);
                        btns[1].setImageResource(R.drawable.btnon);
                    }else if(btns[2].getId()==v.getId()){
                        lay[2].setVisibility(View.VISIBLE);
                        btns[2].setImageResource(R.drawable.btnon);
                    }else if(btns[3].getId()==v.getId()){
                        lay[3].setVisibility(View.VISIBLE);
                        btns[3].setImageResource(R.drawable.btnon);
                    }
                }
            });
        }


    }

}
