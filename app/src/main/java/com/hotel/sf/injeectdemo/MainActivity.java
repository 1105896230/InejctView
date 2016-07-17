package com.hotel.sf.injeectdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.BindView;
import com.hotel.sf.injectviews.InjectView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.text)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectView.bind(this);
        textView.setText("1234");
    }
}
