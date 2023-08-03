package com.company.informationbook.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.adapters.ViewPageAdapterCountries;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CountriesActivity extends AppCompatActivity {

    private TabLayout tabLayoutCountries;
    private ViewPager2 viewPagerCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        tabLayoutCountries=findViewById(R.id.tabLayoutWonders);
        viewPagerCountries=findViewById(R.id.viewPagerWonders);

        ViewPageAdapterCountries adpater=new ViewPageAdapterCountries(getSupportFragmentManager(),getLifecycle());
        viewPagerCountries.setAdapter(adpater);

        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayoutCountries, viewPagerCountries        , true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){

                    case 0 :
                        tab.setText("India");
                        break;

                    case 1 :
                        tab.setText("United Kingdom");
                        break;


                }
            }
        });
        tabLayoutMediator.attach();
    }
}