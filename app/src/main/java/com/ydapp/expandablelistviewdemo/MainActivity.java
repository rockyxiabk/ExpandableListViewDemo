package com.ydapp.expandablelistviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.andexert.expandablelayout.library.ExpandableLayoutListView;


public class MainActivity extends Activity {

    private final String[] array = {"1、Hello", "2、World", "3、Android", "4、is", "5、Awesome", "6、World", "7、Android"};
    private ExpandableLayoutListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = ((ExpandableLayoutListView) findViewById(R.id.listview));
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.view_row, R.id.header_text, array);
        listView.setAdapter(arrayAdapter);
    }

}
