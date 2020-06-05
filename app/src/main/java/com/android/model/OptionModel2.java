package com.android.model;

import androidx.annotation.NonNull;

import com.google.gson.Gson;

public class OptionModel2 {

    private String title;
    private String ans;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    @NonNull
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
