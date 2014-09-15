package com.smartblue.hw2rockpaperscissors;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.smartblue.hw2rockpaperscissors.factory.RPSFactory;
import com.smartblue.hw2rockpaperscissors.model.Roshambo;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Button buttonRock = (Button) findViewById(R.id.buttonRock);
        buttonRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Roshambo rps = RPSFactory.getInstance();
                Toast toast = Toast.makeText(view.getContext(), rps.results(), Toast.LENGTH_LONG);
                toast.show();
                ImageView imageView = (ImageView) findViewById(R.id.imgView);
                imageView.setImageResource(rps.showRPSImage());
            }
        });

        Button buttonPaper = (Button) findViewById(R.id.buttonPaper);
        buttonPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Roshambo rps = RPSFactory.getInstance();
                Toast toast = Toast.makeText(view.getContext(), rps.results(), Toast.LENGTH_LONG);
                toast.show();
                ImageView imageView = (ImageView) findViewById(R.id.imgView);
                imageView.setImageResource(rps.showRPSImage());
            }
        });

        Button buttonScissors = (Button) findViewById(R.id.buttonScissors);
        buttonScissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Roshambo rps = RPSFactory.getInstance();
                Toast toast = Toast.makeText(view.getContext(), rps.results(), Toast.LENGTH_LONG);
                toast.show();
                ImageView imageView = (ImageView) findViewById(R.id.imgView);
                imageView.setImageResource(rps.showRPSImage());
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void buttonOnClick(View v) {
        //button for starting the game
    }
}
