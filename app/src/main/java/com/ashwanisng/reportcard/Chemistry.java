package com.ashwanisng.reportcard;

public class Chemistry {
    private String mGrades;
    private String mNameOFStudents;

    public Chemistry(String nameOFStudents, String grades){
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
