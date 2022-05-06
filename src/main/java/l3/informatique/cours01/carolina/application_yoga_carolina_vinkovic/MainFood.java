package l3.informatique.cours01.carolina.application_yoga_carolina_vinkovic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainFood extends AppCompatActivity {

    Button button1, button2, button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_food);

        button1 = findViewById(R.id.Legume);
        button2 = findViewById(R.id.Fruit);
        button3 = findViewById(R.id.antioxydants);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainFood.this, MainLegume.class);
                startActivity(intent);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainFood.this, MainFruit.class);
                startActivity(intent);
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainFood.this, MainAntio.class);
                startActivity(intent);
            }

        });

    }
}