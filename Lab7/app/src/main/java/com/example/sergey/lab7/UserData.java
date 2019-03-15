package com.example.sergey.lab7;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface userData {

    @Query("SELECT * FROM user")
    public List<User> getAllUsers();

    @Query("SELECT COUNT(*) FROM user")
    public int getCountUsers();

    @Query("SELECT * FROM user WHERE first_name = :firstName")
    public List<User> getUsersByName(String firstName);

    @Query("DELETE FROM user")
    public void deleteAllUsers();

    @Insert
    public void createUsers(User... users);

}
