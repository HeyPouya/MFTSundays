package ir.mftvanak.mftsundays;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;
import ir.mftvanak.mftsundays.pray.PrayerTimesModel;

public class TestAsyncClientActivity extends AppCompatActivity {

    Boolean hasUserClickedOnBack = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_async_client);
        final TextView txt = findViewById(R.id.txt);
        String url = "http://api.aladhan.com/v1/timingsByCity?city=Tehran&country=Iran&method=8";

        final Gson gson = new Gson();
        AsyncHttpClient client = new AsyncHttpClient();


        client.get(url, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                Toast.makeText(TestAsyncClientActivity.this, "OK!", Toast.LENGTH_LONG).show();

                PrayerTimesModel model = gson.fromJson(response.toString(), PrayerTimesModel.class);

                String zohr = model.getData().getTimings().getDhuhr();


                txt.setText(zohr);
            }


            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);

                Toast.makeText(TestAsyncClientActivity.this, "Failed", Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public void onBackPressed() {
        if (hasUserClickedOnBack == false) {

            Toast.makeText(TestAsyncClientActivity.this, "Please press back again", Toast.LENGTH_LONG).show();
            hasUserClickedOnBack = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    hasUserClickedOnBack = false;
                }
            }, 2000);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.first:
                Toast.makeText(TestAsyncClientActivity.this, "Clicked!", Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

//        menu.add(0, 1, 0, "title");

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);


    }
}
