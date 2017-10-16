package org.bits_waves.waves2017.ListItems;

/**
 * Created by Keshav on 10-Sep-17.
 */

public class AppItem {
    private String name;
    private String email;
    private String number;
    private String imageUrl;
    private String link;
    private String link2;
    private String position, position2;
    private String name2;
    private String email2;
    private String number2;
    private String imageUrl2;

    public AppItem(String name,String position, String number, String email, String link, String imageUrl, String name2,String position2, String number2, String email2, String link2, String imageUrl2) {
        this.name = name;
        this.email = email;
        this.number=number;
        this.imageUrl=imageUrl;
        this.link=link;
        this.link2=link2;
        this.name2 = name2;
        this.email2 = email2;
        this.position=position;
        this.position2=position2;
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

    public String getLink2() {
        return link2;
    }

    public void setLink2(String link2) {
        this.link2 = link2;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPosition2() {
        return position2;
    }

    public void setPosition2(String position2) {
        this.position2 = position2;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

