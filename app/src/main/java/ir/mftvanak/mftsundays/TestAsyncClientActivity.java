package ir.mftvanak.mftsundays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;
import ir.mftvanak.mftsundays.pray.PrayerTimesModel;

public class TestAsyncClientActivity extends AppCompatActivity {

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
}
