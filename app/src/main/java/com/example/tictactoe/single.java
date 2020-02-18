package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class single extends AppCompatActivity{
    private Button[][] buttons = new Button [3][3];
    private boolean player1Turn = true;
    private int player1Points;
    private int player2Points;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sipl);

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                String buttonID = "button_"+ i + j;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttons[i][j] = findViewById(resID);
            }
        }
        buttons[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(((Button)v).getText().toString().equals("")){
                return;
            }
            if(player1Turn){

            }
            }
        });

    }
}
