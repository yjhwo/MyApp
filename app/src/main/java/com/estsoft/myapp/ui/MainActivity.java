package com.estsoft.myapp.ui;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import com.estsoft.myapp.R;

public class MainActivity extends AppCompatActivity {
    private MainTabsAdapter mainTabsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main );

        mainTabsAdapter = new MainTabsAdapter( this, (TabHost)findViewById( android.R.id.tabhost ), (ViewPager)findViewById( R.id.pager ));

        mainTabsAdapter.selectTab(0);           // 첫 번째

    }
}
