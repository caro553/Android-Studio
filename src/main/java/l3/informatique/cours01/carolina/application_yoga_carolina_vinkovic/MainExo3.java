package l3.informatique.cours01.carolina.application_yoga_carolina_vinkovic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;


public class MainExo3 extends AppCompatActivity {

    Button button5;

    private Chronometer chronometer;
    private long pauseOffset;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exo3);

        chronometer = findViewById(R.id.chronometer);


        button5 = findViewById(R.id.Menubutton);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainExo3.this, MainActivity.class);
                startActivity(intent);
            }

        });

    }

    public void startChronometer(View v){
        if(!running){
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            chronometer.start();
            running = true;
        }
    }
    public void pauseChronometer(View v){
        if(running){
            chronometer.stop();
            pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
            running = false;
        }

    }

    public void resetChronometer(View v){

        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;
    }
}