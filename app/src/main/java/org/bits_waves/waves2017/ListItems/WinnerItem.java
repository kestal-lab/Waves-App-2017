package org.bits_waves.waves2017.ListItems;

/**
 * Created by aryan on 23/9/17.
 */

public class WinnerItem {
    private String Win_name;
    private String Event_Name;

    public WinnerItem(String winner_name, String event_name) {
        this.Event_Name = event_name;
        this.Win_name = winner_name;
    }

    public String getEvent_Name() {
        return Event_Name;
    }

    public void setEvent_Name(String event_Name) {
        Event_Name = event_Name;
    }

    public String getWin_name() {
        return Win_name;
    }

    public void setWin_name(String win_name) {
        Win_name = win_name;
    }
}
