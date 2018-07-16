
package com.example.android.miwok;

public class Word {
    private String defaultWord;
    private String miwokWord;
    private int image;
    private int audio;

    public Word(String m,String d,int a)
    {
        miwokWord=m;
        defaultWord=d;
        image=R.mipmap.ic_launcher;
        audio=a;
    }

    public Word(String m,String d,int r,int a)
    {
        miwokWord=m;
        defaultWord=d;
        image=r;
        audio=a;
    }

    public String getDefaultWord(){
        return defaultWord;
    }
    public String getMiwokWord(){
        return miwokWord;
    }
    public int getImage(){
        return image;
    }
    public void setImage(int R){image=R;}
    public boolean hasImage(){return image!=R.mipmap.ic_launcher;}
    public int getAudio(){return audio;}
}
