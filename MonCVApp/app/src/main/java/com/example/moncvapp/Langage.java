package com.example.moncvapp;

import android.widget.RatingBar;

public class Langage {
    private String langage;

    private Integer niveau;

    public Langage(String langage, Integer niveau) {
        this.langage = langage;
        this.niveau = niveau;
    }

    public String getLangage() { return langage; }

    public void setLangage(String langage) { this.langage = langage; }

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }
}
