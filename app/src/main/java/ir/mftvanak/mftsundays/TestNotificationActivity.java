package ir.mftvanak.mftsundays;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.orm.SugarContext;
import com.orm.SugarRecord;

public class TestNotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_notification);

        showNotification("MFT SUNDAYS!", "Its a notification!!!!!!!");

        SugarContext.init(this);
//        TestDatabase db = new TestDatabase(this, "mft", null, 1);
//        db.insertToDB("POUYA", "HEYDARI", 20);
//
//
//        String studentNames = db.getStudentsNames();

//        Toast.makeText(this, studentNames, Toast.LENGTH_LONG).show();


        StudentModel model = new StudentModel("Pouya","Heydari",10);
        SugarRecord.save(model);


        StudentModel getStudent = StudentModel.findById(StudentModel.class,1);
        Toast.makeText(this, getStudent.name, Toast.LENGTH_LONG).show();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0, 1, 0, "Hi");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.myid:
                Toast.makeText(TestNotificationActivity.this, "myid", Toast.LENGTH_LONG).show();
                break;
            case R.id.first:
                Toast.makeText(TestNotificationActivity.this, "first", Toast.LENGTH_LONG).show();
                break;
            case R.id.second:
                Toast.makeText(TestNotificationActivity.this, "second", Toast.LENGTH_LONG).show();
                break;
            case R.id.third:
                Toast.makeText(TestNotificationActivity.this, "third", Toast.LENGTH_LONG).show();
                break;
            case 1:
                Toast.makeText(TestNotificationActivity.this, "hi", Toast.LENGTH_LONG).show();
                break;

        }


        return super.onOptionsItemSelected(item);

    }


    void showNotification(String title, String text) {
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("default", "Our Channel", NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription("We send all notifications in this channel");
            mNotificationManager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext(), "default")
                .setSmallIcon(R.mipmap.ic_launcher) // notification icon
                .setContentTitle(title) // title for notification
                .setContentText(text)// message for notification
                .setAutoCancel(true); // clear notification after click
        Intent intent = new Intent(getApplicationContext(), TestAsyncClientActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(pi);
        mNotificationManager.notify(0, mBuilder.build());
    }


}
