package project.one.square.christophergt8.squareoneproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button configurations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configurations = (Button) findViewById(R.id.configurationsbutton);
        configurations.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.configurationsbutton:
                Intent toConfigurations = new Intent(MainActivity.this,ConfigurationActivity.class);
                break;
        }
    }
}
