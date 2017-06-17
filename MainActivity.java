package com.sts.viewpagerdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ToxicBakery.viewpager.transforms.CubeOutTransformer;
import com.ToxicBakery.viewpager.transforms.FlipHorizontalTransformer;
import com.ToxicBakery.viewpager.transforms.ScaleInOutTransformer;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs= (TabLayout) findViewById(R.id.tabs);

        pager= (ViewPager) findViewById(R.id.pager);
        MyPagerAdapter adapter=new MyPagerAdapter(getSupportFragmentManager());

        adapter.getFragment(new FragmentOne(),"Coffe");
        adapter.getFragment(new FragmentTwo(),"Ice Cream");
        adapter.getFragment(new FragmentThree(),"Juice");

        pager.setAdapter(adapter);
        pager.setPageTransformer(true,new ScaleInOutTransformer());


        tabs.setupWithViewPager(pager);

    }
}
