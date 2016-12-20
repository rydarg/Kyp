package com.example.android.kyp;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CategoryAdapter extends FragmentStatePagerAdapter {
    private Context mContext;

    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // Total number of 'pages'
    @Override
    public int getCount() {
        return 4;
    }

    // Page Position is matched to each fragment
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    // Tab bar matched to display the current fragment table
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getResources().getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getResources().getString(R.string.category_family);
        } else if (position == 2) {
            return mContext.getResources().getString(R.string.category_colors);
        } else {
            return mContext.getResources().getString(R.string.category_phrases);
        }
    }

}
