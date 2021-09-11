package com.shanto.project2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "phone_table")
public class Phone {
    @PrimaryKey
    private int mId;

    @ColumnInfo(name = "tag")
    private String mTag;
    @ColumnInfo(name = "phone")
    private String mPhone;

    public Phone(int mId, String mTag, String mPhone) {
        this.mId = mId;
        this.mTag = mTag;
        this.mPhone = mPhone;
    }
    public int getId() {
        return mId;
    }
    public String getTag() {
        return mTag;
    }
    public String getPhone() {
        return mPhone;
    }

}
