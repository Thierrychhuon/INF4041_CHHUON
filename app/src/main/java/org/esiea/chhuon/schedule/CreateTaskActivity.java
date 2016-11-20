package org.esiea.chhuon.schedule;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by admin on 19/11/2016.
 */

public class CreateTaskActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_task);

        Toolbar toolbar =   (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
    }


}
