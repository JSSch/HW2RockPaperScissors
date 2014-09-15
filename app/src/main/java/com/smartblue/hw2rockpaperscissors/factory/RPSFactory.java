package com.smartblue.hw2rockpaperscissors.factory;

import android.util.Log;

import com.smartblue.hw2rockpaperscissors.model.Paper;
import com.smartblue.hw2rockpaperscissors.model.Rock;
import com.smartblue.hw2rockpaperscissors.model.Roshambo;
import com.smartblue.hw2rockpaperscissors.model.Scissors;

import java.util.Date;
import java.util.Random;

/**
 * Created by James on 9/14/2014.
 */
public class RPSFactory {
    private static int number = 1;
    private RPSFactory() {}
    public static Roshambo getInstance() {
        Random randomGenerator = new Random(new Date().getTime() + number++);
        int val = randomGenerator.nextInt(4);//up to four but not including
        Log.d("RPS", "RPS number: " + val);
        switch (val) {
            case 1:
                return new Rock();
            case 2:
                return new Paper();
            default:
                return new Scissors();
        }

    }
}
