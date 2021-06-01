package com.example.a10118322_rifqipratamaj_tugasuts;

import android.database.Cursor;

public interface CatatanInterface {

    public Cursor read();
    public boolean create(Catatan catatan);
    public boolean update(Catatan catatan);
    public boolean delete(String id);

}
