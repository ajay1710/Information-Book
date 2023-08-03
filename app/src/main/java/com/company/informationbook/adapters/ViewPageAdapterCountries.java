package com.company.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.company.informationbook.fragments.FragmentIndia;
import com.company.informationbook.fragments.FragmentUnitedKingdom;

public class ViewPageAdapterCountries extends FragmentStateAdapter {
    public ViewPageAdapterCountries(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPageAdapterCountries(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPageAdapterCountries(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch(position){
            case 0 :
                fragment= FragmentIndia.newInstance();
                break;
            case 1 :
                fragment= FragmentUnitedKingdom.newInstance();
                break;
            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
