// Tanggal Pengerjaan : 2 Juni 2021
// NIM : 10118322
// Nama : Rifqi Pratama Juliansyah
// Kelas : IF-8

package com.example.a10118322_rifqipratamaj_tugasuts;

public class Catatan {
    private String id;
    private String date;
    private String title;
    private String category;
    private String description;


    public Catatan(String id, String date, String title, String category, String description) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.category = category;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
