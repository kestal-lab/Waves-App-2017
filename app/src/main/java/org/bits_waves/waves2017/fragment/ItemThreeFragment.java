package org.bits_waves.waves2017.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import org.bits_waves.waves2017.Activities.OurTeam;
import org.bits_waves.waves2017.R;
import org.bits_waves.waves2017.Activities.RegActivity;

public class ItemThreeFragment extends Fragment {
    private View myFragmentView;
    public ImageButton ourTeam, regBut;
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
        ourTeam = (ImageButton) myFragmentView.findViewById(R.id.ourTeam);
        regBut = (ImageButton) myFragmentView.findViewById(R.id.regBut);

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
        return myFragmentView;
    }
}
