package com.example.tugaskelompokbarnesyandixiirpl3.dbhandler;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import static java.sql.Types.INTEGER;

public class DBHelper extends SQLiteOpenHelper {

    private static final int dbversion = 2;
    private static final String dbname = "siswa";
    private static final String table_name = "table_siswa";
    private static final String key_name = "nama";
    private static final String key_telepon = "telepon";
    private static final String key_alamat = "alamat";
    private static final String key_jenis_kelamin = "jenis_kelamin";
    private static final String key_tanggal_lhr = "tanggal lahir";

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            String crT = "CREATE TABLE :" +table_name+ "("+key_name+"TEXT PRIMARY KEY," +key_alamat+ "INTEGER"+" "+key_jenis_kelamin+ "TEXT," +key_alamat+ "TEXT," +key_telepon+  ")";
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
