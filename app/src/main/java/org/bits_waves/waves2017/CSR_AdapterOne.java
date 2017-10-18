package org.bits_waves.waves2017;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by ashish on 10/9/17.
 */

public class CSR_AdapterOne extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflator;
    private Integer [] images= {R.drawable.ic_assignment_ind_black_24dp,R.drawable.ic_hand,R.drawable.ic_fire};

    public CSR_AdapterOne(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflator.inflate(R.layout.csr_pager, null);
        ViewPager vp =(ViewPager) container;
        vp.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
