package com.ashwanisng.reportcard;

public class Physics {

    private String mGrades;
    private String mNameOFStudents;

    public Physics(String nameOFStudents, String grades){
        mGrades = grades;
        mNameOFStudents = nameOFStudents;
    }

    public String getmNameOFStudents() {
        return mNameOFStudents;
    }

    public String getmGrades() {
        return mGrades;
    }
}
