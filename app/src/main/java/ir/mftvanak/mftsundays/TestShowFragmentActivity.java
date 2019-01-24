package ir.mftvanak.mftsundays;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TestShowFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_show_fragment);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                TestFragment1 testFragment = TestFragment1.getInstance();
                replaceFragment(testFragment);
            }
        }, 3000);


    }

    void replaceFragment(Fragment fragment) {

        FragmentManager manager = getSupportFragmentManager();

        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.frg, fragment);

        transaction.commit();

    }
}
