package org.bits_waves.waves2017;

/**
 * Created by aryan on 23/9/17.
 */

public class WinnerPuller {
    private String Event_Name;
    private String Winner_Name, winner_2, winner_3;


    public String getWinner_Name() {
        return Winner_Name;
    }

    public void setWinner_Name(String winner_Name) {
        Winner_Name = winner_Name;
    }

    public String getEvent_Name() {
        return Event_Name;
    }

    public void setEvent_Name(String event_Name) {
        Event_Name = event_Name;
    }

    public String getWinner_2() {
        return winner_2;
    }

    public void setWinner_2(String winner_2) {
        this.winner_2 = winner_2;
    }

    public String getWinner_3() {
        return winner_3;
    }

    public void setWinner_3(String winner_3) {
        this.winner_3 = winner_3;
    }
}
