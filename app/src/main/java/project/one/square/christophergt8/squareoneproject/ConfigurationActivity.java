package project.one.square.christophergt8.squareoneproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ConfigurationActivity extends AppCompatActivity implements View.OnClickListener {

    Button setBackground;
    LinearLayout mainActivity;
    LinearLayout configActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        setBackground = (Button) findViewById(R.id.set_background);
        setBackground.setOnClickListener(this);

        LinearLayout  mainActivity = (LinearLayout) findViewById(R.id.activity_main);
        LinearLayout  configActivity = (LinearLayout) findViewById(R.id.activity_configuration);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.set_background:
                Toast.makeText(getApplicationContext(),"Cambiar fondo",Toast.LENGTH_LONG).show();

               //configActivity.setBackgroundResource(R.drawable.background_b);
               // mainActivity.setBackgroundResource(R.drawable.background_b);
                break;
        }
    }
}
