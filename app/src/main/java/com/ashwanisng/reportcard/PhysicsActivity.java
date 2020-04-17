package com.ashwanisng.reportcard;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhysicsActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_activity);

        ArrayList<Physics> physics = new ArrayList<>();

        physics.add(new Physics("Mohit","A+"));
        physics.add(new Physics("Ashwani Kumar Singh","O"));
        physics.add(new Physics("Harshit","A"));
        physics.add(new Physics("Shubham","B+"));
        physics.add(new Physics("Shashank","O"));
        physics.add(new Physics("Rahul","C"));
        physics.add(new Physics("Sohan","F"));
        physics.add(new Physics("Suresh","B+"));
        physics.add(new Physics("Shivansh","P"));
        physics.add(new Physics("Vishwas","B"));
        physics.add(new Physics("Hritk","A+"));

        PhysicsAdapter adapter = new PhysicsAdapter(this, physics);
        ListView listView = (ListView)findViewById(R.id.phy_list);
        listView.setAdapter(adapter);

    }
}
