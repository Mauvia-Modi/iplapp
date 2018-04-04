package com.projects.witness.ipl_app;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mauvia Modi on 03-04-2018.
 */

public class ScheduleAdapter extends ArrayAdapter<Schedule> {

    public ScheduleAdapter(Context context, ArrayList<Schedule> schedules) {
        super(context, 0, schedules);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.schedule_list_item, parent, false);
        }

       Schedule currentSchedule = getItem(position);

        ImageView homeIconView = listItemView.findViewById(R.id.home_team_icon);
        homeIconView.setImageResource(currentSchedule.getmHomeIconResourceID());

        TextView homeTeamNameView = listItemView.findViewById(R.id.home_team_name);
        homeTeamNameView.setText(currentSchedule.getmHomeTeamName());

        ImageView awayIconView = listItemView.findViewById(R.id.away_team_icon);
        awayIconView.setImageResource(currentSchedule.getmAwayIconResourceID());

        TextView awayTeamNameView = listItemView.findViewById(R.id.away_team_name);
        awayTeamNameView.setText(currentSchedule.getmAwayTeamName());

        TextView dayTextView = listItemView.findViewById(R.id.day_text);
        dayTextView.setText(currentSchedule.getmDay());

        TextView dateTextView = listItemView.findViewById(R.id.date_text);
        dateTextView.setText(currentSchedule.getmDate());

        TextView monthTextView = listItemView.findViewById(R.id.month_text);
        monthTextView.setText(currentSchedule.getmMonth());

        TextView venueTextView = listItemView.findViewById(R.id.venue_text);
        venueTextView.setText(currentSchedule.getmVenue());

        TextView timeNumberView = listItemView.findViewById(R.id.time_number_text);
        timeNumberView.setText(currentSchedule.getmTimeNumber());

        TextView timePeriodView = listItemView.findViewById(R.id.time_period_text);
        timePeriodView.setText(currentSchedule.getmTimePeriod());

        return listItemView;
    }
}
