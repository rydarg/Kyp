package com.example.android.kyp;

public class Word {
    private String fromTrans;
    private String toTrans;
    private int dispImgInt;

    public Word(String origTranslation, String toTranslation) {
        fromTrans = origTranslation;
        toTrans = toTranslation;
    }

    public Word(String origTranslation, String toTranslation, int dispImgID) {
        fromTrans = origTranslation;
        toTrans = toTranslation;
        dispImgInt = dispImgID;
    }

    public String getFromTranslation() {
        return fromTrans;
    }

    public String getToTranslation() {
        return toTrans;
    }

    public int getDispImgInt() {
        return dispImgInt;
    }
}
