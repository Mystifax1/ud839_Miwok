package com.example.android.miwok;

public class Word {

    private String mMiwokWord;
    private String mDefaultWord;
    private Integer mImageResourceID;

    public Word(String defaultWord, String miwok){
        mMiwokWord = miwok;
        mDefaultWord = defaultWord;

    }

    public String getMiwokTranslation(){
        return mMiwokWord;
    }

    public String getDefaultTranslation() {
        return  mDefaultWord;
    }

    public Integer getmImageResourceID() {
        return mImageResourceID;
    }
}
