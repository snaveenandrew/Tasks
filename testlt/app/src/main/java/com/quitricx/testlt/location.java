package com.quitricx.testlt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naveen Andrew on 07-09-2017.
 */

public class location {
    double lat;
    double lng;
    List<String> photos = new ArrayList<String>();

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }
}
