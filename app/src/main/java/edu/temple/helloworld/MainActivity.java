package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView1);
        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setText("You have clicked the button");
            }
        });
    }
}
