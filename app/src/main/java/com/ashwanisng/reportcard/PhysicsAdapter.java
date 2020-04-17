package com.ashwanisng.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PhysicsAdapter extends ArrayAdapter<Physics> {

    public PhysicsAdapter(Context context, ArrayList<Physics> physics) {
        super(context, 0, physics);
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {

        Physics cuurentResult = getItem(position);

        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.result_phy, parent, false);
        }

        TextView studentNames = (TextView)listItemView.findViewById(R.id.studnet_name_phy);
        studentNames.setText(cuurentResult.getmNameOFStudents());

        TextView gradesStudent = (TextView)listItemView.findViewById(R.id.grades_phy);
        gradesStudent.setText(cuurentResult.getmGrades());


        return listItemView;
    }
}
