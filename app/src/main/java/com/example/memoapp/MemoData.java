package com.example.memoapp;

public class MemoData {
    private String memoTitle;
    private String memoDescription;
    private String memoDetails;

    public MemoData(String memoTitle, String memoDescription, String memoDetails) {
        this.memoTitle = memoTitle;
        this.memoDescription = memoDescription;
        this.memoDetails = memoDetails;
    }

    public String getMemoTitle() {
        return memoTitle;
    }

    public String getMemoDescription() {
        return memoDescription;
    }

    public String getMemoDetails() {
        return memoDetails;
    }
}
