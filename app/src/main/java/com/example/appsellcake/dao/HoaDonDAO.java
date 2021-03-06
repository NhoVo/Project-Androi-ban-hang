package com.example.appsellcake.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.appsellcake.entity.HoaDon;

import java.util.List;

@Dao
public interface HoaDonDAO {
    @Query("SELECT * FROM hoadon")
    List<HoaDon> getAll();

    @Query("SELECT * FROM hoadon where id like :id")
    HoaDon findHoaDonByID(int id);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void saveHoaDon(HoaDon hoaDon);

    @Update
    void update(HoaDon hoaDon);

}
