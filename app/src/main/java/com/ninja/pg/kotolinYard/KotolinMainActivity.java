package com.ninja.pg.kotolinYard;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ninja.pg.R;
import com.ninja.pg.constant.ListContentType;
import com.ninja.pg.screen.ListFragment001;

public class KotolinMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_fragment);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        ListFragment001 fragment = ListFragment001.newInstance(ListContentType.KOTOLIN_MAIN_PAGE_CATEGORY);
        fragmentTransaction.add(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}
