package org.bits_waves.waves2017.ListItems;

/**
 * Created by aryan on 3/9/17.
 */

public class EventItem {
    private String head;
    private String desc;
    private String imageUrl;
    private String event_time;
    private String event_location;
    private String event_category;
    public EventItem(String head, String desc, String imageUrl, String event_time, String event_location, String event_category) {
        this.head = head;
        this.desc = desc;
        this.imageUrl = imageUrl;
        this.event_location = event_location;
        this.event_time = event_time;
        this.event_category = event_category;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEvent_location() {
        return event_location;
    }

    public void setEvent_location(String event_location) {
        this.event_location = event_location;
    }

    public String getEvent_time() {
        return event_time;
    }

    public void setEvent_time(String event_time) {
        this.event_time = event_time;
    }

    public String getEvent_category() {
        return event_category;
    }

    public void setEvent_category(String event_category) {
        this.event_category = event_category;
    }
}
