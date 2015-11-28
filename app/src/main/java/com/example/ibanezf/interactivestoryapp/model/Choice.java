package com.example.ibanezf.interactivestoryapp.model;

/**
 * Created by ibanezf on 11/28/2015.
 */
public class Choice {
    //region Properties
    private String mText;
    private int mNextPage;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
    //endregion

    public Choice(String text, int nextPage){
        mNextPage = nextPage;
        mText = text;

    }


}
