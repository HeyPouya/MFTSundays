package ir.mftvanak.mftsundays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CalculateRules{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        printResult();
    }

    @Override
    public void printResult() {

    }

    @Override
    public void calculateResult() {

    }

    @Override
    public void getNumbers() {

    }
}
