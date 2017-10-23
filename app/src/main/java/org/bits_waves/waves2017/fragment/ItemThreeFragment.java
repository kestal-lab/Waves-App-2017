package org.bits_waves.waves2017.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import org.bits_waves.waves2017.Activities.Category_home_page;
import org.bits_waves.waves2017.Activities.Mini_fest;
import org.bits_waves.waves2017.Activities.NowLive;
import org.bits_waves.waves2017.Activities.OurTeam;
import org.bits_waves.waves2017.Activities.RegActivity;
import org.bits_waves.waves2017.Manifest;
import org.bits_waves.waves2017.R;
import org.bits_waves.waves2017.Activities.WinnersActivity;

public class ItemThreeFragment extends Fragment {
    public ImageButton ourTeam, regBut;
    private View myFragmentView;
    private Button live,winner_but,category,hello;
    public static ItemThreeFragment newInstance() {
        ItemThreeFragment fragment = new ItemThreeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragmentView=inflater.inflate(R.layout.fragment_item_three, container, false);
        ourTeam = myFragmentView.findViewById(R.id.ourTeam);
        regBut = myFragmentView.findViewById(R.id.regBut);
        live = myFragmentView.findViewById(R.id.live);
        winner_but=myFragmentView.findViewById(R.id.winners);
        category=myFragmentView.findViewById(R.id.category_mainpage);
        hello=myFragmentView.findViewById(R.id.minifest_mainpage);

        ourTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), OurTeam.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.transition.enter, R.transition.exit);

            }
        });
        regBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), RegActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.transition.left_to_right, R.transition.right_to_left);
            }
        });
        live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), NowLive.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.transition.up_to_down, R.transition.down_to_up);
            }
        });
        winner_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), WinnersActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.transition.up_to_down, R.transition.down_to_up);
            }
        });
        category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), Category_home_page.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.transition.up_to_down, R.transition.down_to_up);
            }
        });
        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), Mini_fest.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.transition.up_to_down, R.transition.down_to_up);
            }
        });

        return myFragmentView;
    }
}
