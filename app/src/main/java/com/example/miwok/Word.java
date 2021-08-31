package com.example.miwok;

import java.security.PublicKey;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static int NO_IMAGE_PROVIDED=-1;
    private int maudioResourceID;

    public Word(String defaultTranslation,String MiwokTranslation,int audioId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        maudioResourceID=audioId;
    }
    public Word(String defaultTranslation,String MiwokTranslation,int resourceId,int audioId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceId=resourceId;
        maudioResourceID=audioId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public int getaudioResourceID(){return maudioResourceID;}
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", maudioResourceID=" + maudioResourceID +
                '}';
    }
}
