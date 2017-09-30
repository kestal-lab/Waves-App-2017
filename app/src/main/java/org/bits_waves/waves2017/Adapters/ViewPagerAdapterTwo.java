package org.bits_waves.waves2017.Adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.bits_waves.waves2017.R;

/**
 * Created by ashish on 11/9/17.
 */

public class ViewPagerAdapterTwo extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflator;
    private Integer [] images= {R.drawable.ic_pen,R.drawable.ic_speaker,R.drawable.ic_team};

    public ViewPagerAdapterTwo(Context context) {
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
        View view = layoutInflator.inflate(R.layout.pager_item, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);
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