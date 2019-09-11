package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //change button's click behavior
        findViewById(R.id.clickButton).setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view)
                    {
                        ((android.widget.TextView)findViewById(R.id.infoText)).setText("You have clicked the button");
                    }
                });

    }
}
