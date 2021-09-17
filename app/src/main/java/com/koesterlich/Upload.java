package com.koesterlich;

public class Upload {

    private String mName;
    private String mImageUrl;

    public Upload(){
        //empty constructor needed
    }

    public Upload(String name, String ImageUrl){
        if(name.trim().equals("")){
            mName = "No Name";
        }
        mName = name;
        mImageUrl = ImageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

}
