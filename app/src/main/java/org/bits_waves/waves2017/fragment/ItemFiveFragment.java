package org.bits_waves.waves2017.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bits_waves.waves2017.R;

public class ItemFiveFragment extends Fragment {

    public static ItemFiveFragment newInstance() {
        ItemFiveFragment fragment = new ItemFiveFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item_five, container, false);
    }
}
