package com.theappexperts.googlemapsdemo.network.restaurantspojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Logo {

    @SerializedName("StandardResolutionURL")
    @Expose
    private String standardResolutionURL;

    public String getStandardResolutionURL() {
        return standardResolutionURL;
    }

    public void setStandardResolutionURL(String standardResolutionURL) {
        this.standardResolutionURL = standardResolutionURL;
    }

}
