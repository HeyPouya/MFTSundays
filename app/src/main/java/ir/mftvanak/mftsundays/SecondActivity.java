package ir.mftvanak.mftsundays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        String s = intent.getStringExtra("contentOfText");


        TextView textView = findViewById(R.id.txtShowText);

        textView.setText(s);


        Intent intent1 = new Intent(this,TestService.class);
        startService(intent1);


    }
}
