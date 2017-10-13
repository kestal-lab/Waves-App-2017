package org.bits_waves.waves2017.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.system.StructPollfd;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.bits_waves.waves2017.R;

public class RuleBook extends Fragment {
    private String event_name_string;
    private TextView rules;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_rule_book, container, false);
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
        rules = (TextView) view.findViewById(R.id.rules);
        if (event_name_string.equals("Heading 0 2")){
            rules.setText("This is a successful test");
        }
        return view;
    }
}

