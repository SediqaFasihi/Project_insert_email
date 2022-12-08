package sediqaf.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public View Et;
    public View Ac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et = findViewById(R.id.second);
        Ac = findViewById(R.id.action_button);

        Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = Et.toString();
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
            }
        });
        
    }
}