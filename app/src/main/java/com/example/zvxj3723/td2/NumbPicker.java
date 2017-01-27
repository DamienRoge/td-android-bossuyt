package com.example.zvxj3723.td2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.NumberPicker;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by ZVXJ3723 on 24/01/2017.
 */

public class NumbPicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numberpicker);

        NumberPicker np = (NumberPicker) findViewById(R.id.np);
        final TextView number = (TextView) findViewById(R.id.number);

        np.setMinValue(10);
        np.setMaxValue(20);

        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                // Donne le nombre retourné par le datapicker
                number.setText("Nombre sélectionné : " + newVal);
            }
        });
    }
}
