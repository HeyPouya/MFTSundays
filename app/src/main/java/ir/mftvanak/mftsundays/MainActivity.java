package ir.mftvanak.mftsundays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
                Intent intent = new Intent(MainActivity.this, SubActivity.class);

                startActivityForResult(intent, 1400);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        String s;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1400)
            if (resultCode == Activity.RESULT_OK) {
                s = data.getStringExtra("result");
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
            }


    }
}
