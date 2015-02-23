package com.dolia.artsiom.p0421_simplelist;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    String[] names = { "John", "Mary", "Peter", "Antony",
            "Dan", "Bred", "Chris", "Ben", "Hannah", "Dennis", "Andrew", "Mary", "Peter", "Antony",
            "Dan", "Bred", "Chris", "Ben", "Hannah", "Dennis", "Andrew" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView lvMain = (ListView) findViewById(R.id.lvMain);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>
                (this, R.layout.my_list_item, names);

        lvMain.setAdapter(adapter);
    }
}
