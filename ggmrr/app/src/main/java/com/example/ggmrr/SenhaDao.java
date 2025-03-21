package com.example.ggmrr;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface SenhaDao {
    @Insert
    void insert(Senha senha);

    @Delete
    void delete(Senha senha);

    @Query("SELECT * FROM senha")
    List<Senha> getAllSenhas();
}