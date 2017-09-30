package org.bits_waves.waves2017.ListItems;

/**
 * Created by Keshav on 10-Sep-17.
 */

public class AppItem {
    private String name;
    private String email;
    private String number;
    private String imageUrl;

    public AppItem(String name,String number, String email, String imageUrl) {
        this.name = name;
        this.email = email;
        this.number=number;
        this.imageUrl=imageUrl;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){return email;}

    public String getNumber() {
        return number;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
