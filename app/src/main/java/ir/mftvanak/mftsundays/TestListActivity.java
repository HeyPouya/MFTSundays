package ir.mftvanak.mftsundays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TestListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_list);


        List<String> list = new ArrayList<>();
        list.add("Pouya Heydari");
        list.add("Hanie Aslani");
        list.add("Neda Ghiasvand");
        list.add("Mohsen Bavin");
        list.add("Saeed Samei");
        list.add("Qazale Sanae");
        list.add("Majid Gorjizade");
        list.add("Mahdi Shahmirzae");
        list.add("Amirreza Jabberi");
        list.add("Natasha Ghaemi");
        list.add("Aryana Oveisi");
        list.add("Termeh Tabatabae");
        list.add("Soha Jafari");


        RecyclerView rv = findViewById(R.id.recycler);



    }
}
