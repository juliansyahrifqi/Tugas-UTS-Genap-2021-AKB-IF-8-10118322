package com.example.a10118322_rifqipratamaj_tugasuts;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CatatanImp extends SQLiteOpenHelper implements CatatanInterface {

    public static String DB_NAME = "db_catatan";

    private static final int DB_VERSION = 1;

    public CatatanImp(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sql) {
        sql.execSQL("CREATE TABLE tbl_catatan (id TEXT, date TEXT, title TEXT, description TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sql, int i, int j) {
        sql.execSQL("DROP TABLE tbl_catatan");
    }

    @Override
    public Cursor read() {
        SQLiteDatabase sql = getReadableDatabase();
        return sql.rawQuery("SELECT * FROM tbl_catatan", null);
    }

    @Override
    public boolean create(Catatan catatan) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("INSERT INTO tbl_catatan VALUES ('"+catatan.getId()+"','"+catatan.getDate()+"','"+catatan.getTitle()+"', '"+catatan.getDescription()+"')");
        return true;
    }

    @Override
    public boolean update(Catatan catatan) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("UPDATE tbl_catatan SET date = '"+catatan.getDate()+"','"+catatan.getTitle()+"','"+catatan.getDescription()+"' WHERE id='"+catatan.getId()+"'");
        return true;
    }

    @Override
    public boolean delete(String id) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("DELETE FROM tbl_catatan WHERE='"+id+"'");
        return true;
    }


}
