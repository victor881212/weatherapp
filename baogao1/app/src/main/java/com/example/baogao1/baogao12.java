package com.example.baogao1;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class baogao12 extends Application {
    private static baogao12 singleton;

    private List<Location> myLocations;

    public List<Location> getMyLocations() {
        return myLocations;
    }

    public void setMyLocations(List<Location> myLocations) {
        this.myLocations = myLocations;
    }

    public static baogao12 getInstance() {
        return singleton;
    }
    public void onCreate(){
        super.onCreate();
        singleton=this;
        myLocations = new ArrayList<>();
    }
}
