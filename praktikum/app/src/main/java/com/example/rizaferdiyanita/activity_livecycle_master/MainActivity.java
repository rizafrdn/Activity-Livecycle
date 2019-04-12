package com.example.rizaferdiyanita.activity_livecycle_master;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt3 = (TextView) findViewById(R.id.txt3);
        txt3.setPaintFlags(txt3.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);
    }
}
