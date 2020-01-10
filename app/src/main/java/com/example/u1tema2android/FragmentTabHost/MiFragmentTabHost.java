package com.example.u1tema2android.FragmentTabHost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTabHost;

import android.os.Bundle;

import com.example.u1tema2android.R;

public class MiFragmentTabHost extends FragmentActivity {
    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_tab_host);
        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this,
                getSupportFragmentManager(), android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Lengüeta 1"),
                Tab1.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Lengüeta 2"),
                Tab2.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Lengüeta 3"),
                Tab3.class, null);
    }
}
