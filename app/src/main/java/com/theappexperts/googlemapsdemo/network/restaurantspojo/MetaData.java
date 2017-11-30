package com.theappexperts.googlemapsdemo.network.restaurantspojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MetaData {

    @SerializedName("SearchedTerms")
    @Expose
    private Object searchedTerms;
    @SerializedName("TagDetails")
    @Expose
    private List<TagDetail> tagDetails = null;

    public Object getSearchedTerms() {
        return searchedTerms;
    }

    public void setSearchedTerms(Object searchedTerms) {
        this.searchedTerms = searchedTerms;
    }

    public List<TagDetail> getTagDetails() {
        return tagDetails;
    }

    public void setTagDetails(List<TagDetail> tagDetails) {
        this.tagDetails = tagDetails;
    }

}
