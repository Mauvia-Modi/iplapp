package com.projects.witness.ipl_app;

/**
 * Created by Mauvia Modi on 03-04-2018.
 */

public class Schedule {

    private int mHomeIconResourceID;
    private String mHomeTeamName;

    private int mAwayIconResourceID;
    private String mAwayTeamName;

    private String mDay;
    private String mDate;
    private String mMonth;

    private String mVenue;

    private String mTimeNumber;
    private String mTimePeriod;

    public Schedule(int homeIconResourceID, String homeTeamName, int awayIconResourceID,
                    String awayTeamName, String day, String date, String month, String venue,
                    String timeNumber, String timePeriod)
    {
        mHomeIconResourceID = homeIconResourceID;
        mHomeTeamName = homeTeamName;
        mAwayIconResourceID = awayIconResourceID;
        mAwayTeamName = awayTeamName;
        mDay = day;
        mDate = date;
        mMonth = month;
        mVenue = venue;
        mTimeNumber = timeNumber;
        mTimePeriod = timePeriod;
    }

    public int getmHomeIconResourceID() {
        return mHomeIconResourceID;
    }

    public String getmHomeTeamName() {
        return mHomeTeamName;
    }

    public int getmAwayIconResourceID() {
        return mAwayIconResourceID;
    }

    public String getmAwayTeamName() {
        return mAwayTeamName;
    }

    public String getmDay() {
        return mDay;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmMonth() {
        return mMonth;
    }

    public String getmVenue() {
        return mVenue;
    }

    public String getmTimeNumber() {
        return mTimeNumber;
    }

    public String getmTimePeriod() {
        return mTimePeriod;
    }

}
