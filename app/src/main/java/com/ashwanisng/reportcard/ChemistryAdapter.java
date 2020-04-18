package com.ashwanisng.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ChemistryAdapter extends ArrayAdapter<Chemistry> {

    public ChemistryAdapter(Context context, ArrayList<Chemistry> chem) {
        super(context, 0, chem);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Chemistry currentResult = getItem(position);

        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.res_chem, parent, false);
        }

        TextView student = (TextView)listItemView.findViewById(R.id.studnet_name_chem);
        student.setText(currentResult.getmNameOFStudents());

        TextView grades = (TextView)listItemView.findViewById(R.id.grades_chem);
        grades.setText(currentResult.getmGrades());


        return listItemView;
    }


}
