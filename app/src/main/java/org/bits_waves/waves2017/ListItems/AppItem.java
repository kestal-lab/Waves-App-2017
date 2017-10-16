package org.bits_waves.waves2017.ListItems;

/**
 * Created by Keshav on 10-Sep-17.
 */

public class AppItem {
    private String name;
    private String email;
    private String number;
    private String imageUrl;

    private String name2;
    private String email2;
    private String number2;
    private String imageUrl2;

    public AppItem(String name,String number, String email, String imageUrl, String name2,String number2, String email2, String imageUrl2) {
        this.name = name;
        this.email = email;
        this.number=number;
        this.imageUrl=imageUrl;

        this.name2 = name2;
        this.email2 = email2;
        this.number2=number2;
        this.imageUrl2=imageUrl2;
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



    public String getName2(){
        return name2;
    }

    public String getEmail2(){return email2;}

    public String getNumber2() {
        return number2;
    }


    public String getImageUrl2() {
        return imageUrl2;
    }

    public void setImageUrl2(String imageUrl2) {
        this.imageUrl2 = imageUrl2;
    }
}

