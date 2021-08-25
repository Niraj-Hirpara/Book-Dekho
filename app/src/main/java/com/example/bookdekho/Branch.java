package com.example.bookdekho;

public class Branch {

    private String mBranchName;
    private int mImgID;
    private int mSmallImgID;
    private String mColorCode;

    public Branch (int smallImgID, String branchName, int imgID, String colorCode) {
        mSmallImgID = smallImgID;
        mBranchName = branchName;
        mImgID = imgID;
        mColorCode = colorCode;
    }

    public int getSmallImgID() {
        return mSmallImgID;
    }

    public String getBranchName() {
        return mBranchName;
    }

    public int getImgID () {
        return mImgID;
    }

    public String getColorCode() { return mColorCode; }


}
