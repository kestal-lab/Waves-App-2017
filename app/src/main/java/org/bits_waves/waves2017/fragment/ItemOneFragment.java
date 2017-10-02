package org.bits_waves.waves2017.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.bits_waves.waves2017.ListItems.EventItem;
import org.bits_waves.waves2017.R;
import org.bits_waves.waves2017.tabs.Day0;
import org.bits_waves.waves2017.tabs.Day1;
import org.bits_waves.waves2017.tabs.Day2;
import org.bits_waves.waves2017.tabs.Day3;

import java.util.ArrayList;
import java.util.List;

public class ItemOneFragment extends Fragment {
    private View myFragmentView;
    private String imgURL;
    private int bitIMG;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<EventItem> listItems = new ArrayList<>();

    public static ItemOneFragment newInstance() {
        ItemOneFragment fragment = new ItemOneFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fixtures_new_tabs,container, false);
        // Setting ViewPager for each Tabs
        ViewPager viewPager = view.findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        TextView title = view.findViewById(R.id.title_text);
        title.setText("Events");
        title.setTextColor(getResources().getColor(R.color.white));
        // Set Tabs inside Toolbar
        TabLayout tabs = view.findViewById(R.id.result_tabs);
        tabs.setupWithViewPager(viewPager);


        return view;
    }
    private void setupViewPager(ViewPager viewPager) {


        Adapter adapter = new Adapter(getChildFragmentManager());
        adapter.addFragment(new Day0(), "Day 0");
        adapter.addFragment(new Day1(), "Day 1");
        adapter.addFragment(new Day2(), "Day 2");
        adapter.addFragment(new Day3(), "Day 3");

        viewPager.setAdapter(adapter);



    }
    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
