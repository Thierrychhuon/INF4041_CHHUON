package org.esiea.chhuon.schedule;

//import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
//import android.widget.CheckBox;
//import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.view.View;
import android.app.DialogFragment;


/**
 * Created by admin on 19/11/2016.
 */

public class CreateTaskActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_task);
        initializeVariables();

        Toolbar toolbar =   (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        // Initialize the textview with '0'.
        textView.setText("Vous allouez: " + seekBar.getProgress()*5 + "mn");

        seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
                //Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView.setText("Vous allouez: " + progress*5 + "mn");
                Toast.makeText(getApplicationContext(), "Stopped tracking seekbar", Toast.LENGTH_SHORT).show();
            }
        });
    }
    // A private method to help us initialize our variables.
    private void initializeVariables() {
        seekBar = (SeekBar) findViewById(R.id.seekBar4);
        textView = (TextView) findViewById(R.id.textView5);
    }

    public void onButtonClicked(View v){
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getFragmentManager(),"TimePicker");
    }

    //Reading titlefield
        //final EditText titleField = (EditText) findViewById(R.id.editText);
        //String title = titleField.getText().toString();

        //Reading Checkbox
        //final CheckBox responseCheckbox = (CheckBox) findViewById(R.id.checkBox);
        //boolean bRequiresResponse = responseCheckbox.isChecked();
}
