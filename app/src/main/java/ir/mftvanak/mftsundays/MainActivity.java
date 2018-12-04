package ir.mftvanak.mftsundays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

//        final TextView textView = findViewById(R.id.txt);
//
//        EditText editText = findViewById(R.id.edt);
//        String s = editText.getText().toString();
//
//
//
//        Button button = findViewById(R.id.btnChangeText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(MainActivity.this,"Pouya",Toast.LENGTH_LONG).show();
//
//            }
//        });
//


        Button button = findViewById(R.id.btnNewActivity);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("contentOfText","Salam");

                startActivity(intent);

            }
        });

    }
}
