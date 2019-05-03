package c.morgentec.assignment2;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SampleAdapter extends FragmentPagerAdapter {
    private Context myContext;
    private static final int TOTAL_TABS = 8;
    public SampleAdapter(Context context,FragmentManager fm) {
        super(fm);
        myContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FirstFragment.newInstance("ZerothFragment, Instance 0");
            case 1:
                return SecondFragment.newInstance("FirstFragment, Instance 0");
            case 2:
                return ThirdFragment.newInstance("SecondFragment, Instance 0");
            case 3:
                return FourthFragment.newInstance("ThirdFragment, Instance 0");
            case 4:
                return FifthFragment.newInstance("FourthFragment, Instance 0");
            case 5:
                return SixthFragment.newInstance("FifthFragment, Instance 0");
            case 6:
                return SeventhFragment.newInstance("SixthFragment, Instance 0");
            case 7:
                return EighthFragment.newInstance("SeventhFragment, Instance 0");
            default:
                return FirstFragment.newInstance("ZerothFragment, Instance 0");
        }

    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "1st";
            case 1:
                return "2nd";
            case 2:
                return "3rd";
            case 3:
                return "4th";
            case 4:
                return "5th";
            case 5:
                return "6th";
            case 6:
                return "7th";
            case 7:
                return "8th";
            default:
                return "";
        }
    }

    @Override
    public int getCount() {
        return TOTAL_TABS;
    }
}
