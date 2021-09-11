package com.shanto.project2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "university_table")
public class University {
    @PrimaryKey
    private int mId;

    @ColumnInfo(name="university")
    private String mUniversity;
    @ColumnInfo(name="department")
    private String mDepartment;
    @ColumnInfo(name="studentId")
    private String mStudentId;
    @ColumnInfo(name="studyLevel")
    private String mStudyLevel;
    @ColumnInfo(name="email")
    private String mEmail;

    public University(int mId, String mUniversity, String mDepartment, String mStudentId, String mStudyLevel, String mEmail) {
        this.mId = mId;
        this.mUniversity = mUniversity;
        this.mDepartment = mDepartment;
        this.mStudentId = mStudentId;
        this.mStudyLevel = mStudyLevel;
        this.mEmail = mEmail;
    }

    public int getId() {
        return mId;
    }
    public String getUniversity() {
        return mUniversity;
    }
    public String getDepartment() {
        return mDepartment;
    }
    public String getStudentId() {
        return mStudentId;
    }
    public String getStudyLevel() {
        return mStudyLevel;
    }
    public String getEmail() {
        return mEmail;
    }
}
