// Tanggal Pengerjaan : 2 Juni 2021
// NIM : 10118322
// Nama : Rifqi Pratama Juliansyah
// Kelas : IF-8

package com.example.a10118322_rifqipratamaj_tugasuts;

import android.database.Cursor;

public interface CatatanInterface {

    public Cursor read();
    public boolean create(Catatan catatan);
    public boolean update(Catatan catatan);
    public boolean delete(String id);
}
