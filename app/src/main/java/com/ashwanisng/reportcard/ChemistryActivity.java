package com.ashwanisng.reportcard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ChemistryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chemistry_activity);

        ArrayList<Chemistry> chem = new ArrayList<>();

        chem.add(new Chemistry("Mohit","A+"));
        chem.add(new Chemistry("Ashwani Kumar Singh","O"));
        chem.add(new Chemistry("Harshit","A"));
        chem.add(new Chemistry("Shubham","B+"));
        chem.add(new Chemistry("Shashank","O"));
        chem.add(new Chemistry("Rahul","C"));
        chem.add(new Chemistry("Sohan","F"));
        chem.add(new Chemistry("Suresh","B+"));
        chem.add(new Chemistry("Shivansh","P"));
        chem.add(new Chemistry("Vishwas","B"));
        chem.add(new Chemistry("Hritk","A+"));

        ChemistryAdapter adapter = new ChemistryAdapter(this, chem);
        ListView listView = (ListView)findViewById(R.id.chem_list);
        listView.setAdapter(adapter);

    }
}
