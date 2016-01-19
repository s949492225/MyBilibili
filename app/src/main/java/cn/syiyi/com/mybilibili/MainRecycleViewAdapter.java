package cn.syiyi.com.mybilibili;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * MyBilibili...........
 * cn.syiyi.com.mybilibili...........
 * Created by lintao.song on 2016/1/18.
 */
public class MainRecycleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewPage
                = LayoutInflater.from(parent.getContext()).inflate(R.layout.ac_rv_recommend_viewpager, parent, false);
        View hot
                = LayoutInflater.from(parent.getContext()).inflate(R.layout.ac_rv_cardview_vertical_with_subtitle, parent, false);

        if (viewType == 0) {
            return new ViewPagerVH(viewPage);
        } else if (viewType == 1) {
            return new HotVH(hot);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewPagerVH) {
            final ViewPager viewPager = ((ViewPagerVH) holder).vpBanner;
            ViewPageAdapter adapter = new ViewPageAdapter();
            viewPager.setAdapter(adapter);
            viewPager.setFocusable(true);
            viewPager.requestFocus();

        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public int getItemCount() {
        return 20;
    }


    //首页横幅
    public class ViewPagerVH extends RecyclerView.ViewHolder {
        private ViewPager vpBanner;

        public ViewPagerVH(View itemView) {
            super(itemView);
            vpBanner = (ViewPager) itemView.findViewById(R.id.ac_viewpager_banner);
        }
    }

    //视图卡片 1
    public class HotVH extends RecyclerView.ViewHolder {
        private TextView tvTitleHot;

        public HotVH(View itemView) {
            super(itemView);
            tvTitleHot = (TextView) itemView.findViewById(R.id.ac_card_view_tv_1);
        }
    }

    //处理cardView中间的margin
    public static class MyDecoration extends RecyclerView.ItemDecoration {

        @Override
        public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
            super.onDraw(c, parent, state);
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

            outRect.set(0, 0, 10, 0);

        }
    }
}
