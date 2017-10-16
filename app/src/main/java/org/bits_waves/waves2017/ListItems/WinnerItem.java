package org.bits_waves.waves2017.ListItems;

/**
 * Created by aryan on 23/9/17.
 */

public class WinnerItem {
    private String Win_name;
    private String Event_Name;
    private String Win_name2;
    private String Win_name3;

    public WinnerItem(String event_name, String winner_name, String winner_name2, String winner_name3) {
        this.Event_Name = event_name;
        this.Win_name = winner_name;
        this.Win_name2=winner_name2;
        this.Win_name3=winner_name3;
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

    public String getWin_name2() {
        return Win_name2;
    }

    public void setWin_name2(String win_name2) {
        Win_name2 = win_name2;
    }

    public String getWin_name3() {
        return Win_name3;
    }

    public void setWin_name3(String win_name3) {
        Win_name3 = win_name3;
    }
}
