package org.bits_waves.waves2017.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.bits_waves.waves2017.R;

public class Schedule extends Fragment {
    private String event_name_string;
    private TextView schedule;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_schedule, container, false);
        if (savedInstanceState == null) {
            Bundle extras = getActivity().getIntent().getExtras();
            if (extras == null) {
                event_name_string = null;
            } else {
                event_name_string = extras.getString("event_name");
            }
        } else {
            event_name_string = (String) savedInstanceState.getSerializable("event_name");
        }
        schedule = (TextView) view.findViewById(R.id.schedule);
        if (event_name_string.equals("Heading 0 2")){
            schedule.setText("This is a just a silly test");
        }
        return view;
    }
}

