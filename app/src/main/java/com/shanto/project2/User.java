package com.shanto.project2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class User {
    @PrimaryKey
    private int mId;

    @ColumnInfo(name="name")
    private String mName;
    @ColumnInfo(name="nid")
    private String mNid;
    @ColumnInfo(name="bloodGroup")
    private String mBloodGroup;
    @ColumnInfo(name="birthDate")
    private String mBirthDate;


    public User(int mId, String mName, String mNid, String mBloodGroup, String mBirthDate) {
        this.mId = mId;
        this.mName = mName;
        this.mNid = mNid;
        this.mBloodGroup = mBloodGroup;
        this.mBirthDate = mBirthDate;
    }
    public User getUser(){
        User user = new User(this.mId, this.mName, this.mNid, this.mBloodGroup, this.mBirthDate);
        return user;
    }
    public int getId() {
        return this.mId;
    }
    public String getName() {
        return this.mName;
    }
    public String getNid() {
        return this.mNid;
    }
    public String getBirthDate() {
        return this.mBirthDate;
    }
    public String getBloodGroup() {
        return this.mBloodGroup;
    }
}
