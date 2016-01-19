package cn.syiyi.com.mybilibili;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * MyBilibili...........
 * cn.syiyi.com.mybilibili...........
 * Created by lintao.song on 2016/1/18.
 */
public class ViewPageAdapter extends PagerAdapter {
    private Context context;


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        context = container.getContext();
        View view = new View(context);

        if (position == 0) {
            view.setBackgroundColor(context.getResources().getColor(R.color.color0));
        } else if (position == 1) {
            view.setBackgroundColor(context.getResources().getColor(R.color.color1));
        } else if (position == 2) {
            view.setBackgroundColor(context.getResources().getColor(R.color.color2));
        }
        container.addView(view, new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(container.getChildAt(3 - position));
    }
}
