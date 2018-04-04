package com.projects.witness.ipl_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button iplScheduleButton;
    Button teamsButton;
    Button scoreTableButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iplScheduleButton = findViewById(R.id.ipl_schedule_button);
        iplScheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
                startActivity(intent);
            }
        });

        teamsButton = findViewById(R.id.teams_button);
        teamsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TeamsActivity.class);
                startActivity(intent);
            }
        });

        scoreTableButton = findViewById(R.id.score_table_button);
        scoreTableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScoreTableActivity.class);
                startActivity(intent);
            }
        });
    }
}
