package cn.syiyi.com.mybilibili;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * MyBilibili...........
 * cn.syiyi.com.mybilibili...........
 * Created by lintao.song on 2016/1/18.
 */
public class MainAdapter extends FragmentPagerAdapter {
    public MainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return MainFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "这是第一页";
        } else {
            return "这是第二爷";

        }
    }
}
