package com.teamuppercaseguy2.android_PHINMAUPangGuide;

public class CampusModel {
    public int getCampus_image() {
        return campus_image;
    }

    public String getCampus_name() {
        return campus_name;
    }

    public CampusModel(int campus_image, String campus_name) {
        this.campus_image = campus_image;
        this.campus_name = campus_name;
    }

    int campus_image;
    String campus_name;

}
