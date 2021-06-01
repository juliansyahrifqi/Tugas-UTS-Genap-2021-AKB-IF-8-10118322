package com.example.a10118322_rifqipratamaj_tugasuts;

public class Catatan {
    private String id;
    private String date;
    private String title;
    private String description;

    public Catatan(String id, String date, String title, String description) {
        this.id = id;
        this.date = date;
        this.title = title;
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

    public String getDescription() {
        return description;
    }
}
