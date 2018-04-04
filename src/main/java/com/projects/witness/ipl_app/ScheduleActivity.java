package com.projects.witness.ipl_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mauvia Modi on 03-04-2018.
 */

public class ScheduleActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_list);

        final ArrayList<Schedule> schedules = new ArrayList<Schedule>();

        schedules.add(new Schedule(R.drawable.csk_logo, getResources().getString(R.string.csk_name),
                R.drawable.csk_logo, getResources().getString(R.string.csk_name),
                getResources().getString(R.string.saturday), "07", "April",
                "Wankhede Stadium, Mumbai", "8", "PM"));

        schedules.add(new Schedule(R.drawable.csk_logo, getResources().getString(R.string.csk_name),
                R.drawable.csk_logo, getResources().getString(R.string.csk_name),
                getResources().getString(R.string.saturday), "07", "April",
                "Wankhede Stadium, Mumbai", "8", "PM"));

        schedules.add(new Schedule(R.drawable.csk_logo, getResources().getString(R.string.csk_name),
                R.drawable.csk_logo, getResources().getString(R.string.csk_name),
                getResources().getString(R.string.saturday), "07", "April",
                "Wankhede Stadium, Mumbai", "8", "PM"));

        final ListView scheduleListView = findViewById(R.id.schedule_list_layout);

        ScheduleAdapter adapter = new ScheduleAdapter(this, schedules);

        scheduleListView.setAdapter(adapter);

    }

}
