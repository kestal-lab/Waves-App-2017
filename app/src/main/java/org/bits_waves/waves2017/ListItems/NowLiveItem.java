package org.bits_waves.waves2017.ListItems;

/**
 * Created by ashish on 21/10/17.
 */

public class NowLiveItem {
    private String Title;
    private String Venue;

    public NowLiveItem(String Title, String Venue) {
        this.Title = Title;
        this.Venue = Venue;

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String Venue) {
        this.Venue = Venue;
    }

}

