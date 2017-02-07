package project.one.square.christophergt8.squareoneproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button configurations;
    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.configurations:
                Intent toConfigurations = new Intent(MainActivity.this,ConfigurationActivity.class);
                startActivity(toConfigurations);
                break;
            case R.id.play:
                Intent toPlay = new Intent(MainActivity.this,PlayingActivity.class);
                startActivity(toPlay);
                break;

        }
    }

    private void initButtons(){
        configurations = (Button) findViewById(R.id.configurations);
        configurations.setOnClickListener(this);

        play = (Button) findViewById(R.id.play);
        play.setOnClickListener(this);
    }
}
