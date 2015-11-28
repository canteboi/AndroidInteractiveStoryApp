package com.example.ibanezf.interactivestoryapp.model;

/**
 * Created by ibanezf on 11/28/2015.
 */
public class Choice {
    //region Properties
    private String mText;
    private int mImageId;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }
    //endregion

    public Choice(String text, int imageId){
        mImageId = imageId;
        mText = text;

    }
}
