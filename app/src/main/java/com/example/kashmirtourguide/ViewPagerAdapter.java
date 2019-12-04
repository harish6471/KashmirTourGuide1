package com.example.kashmirtourguide;


import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MustVisitFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else if (position == 3) {
            return new RestaurantsFragment();
        } else {
            return new SportsFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.must_visit);
        } else if (position == 1) {
            return mContext.getString(R.string.parks);
        } else if (position == 2) {
            return mContext.getString(R.string.food);
        } else if (position == 3) {
            return mContext.getString(R.string.restaurants);
        } else {
            return mContext.getString(R.string.sports);
        }
    }
}
