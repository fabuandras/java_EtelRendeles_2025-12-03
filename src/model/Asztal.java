package model;

import java.util.ArrayList;
import java.util.List;

public class Asztal {
    private String szin;
    private List<Etel> etelek;

    public Asztal(String szin) {
        this.szin = szin;
        this.etelek = new ArrayList<>();
    }

    public String getSzin() {
        return szin;
    }

    public void addEtel(Etel e) {
        if (etelek.size() < 5) {
            etelek.add(e);
        }
    }

    public List<Etel> getEtelek() {
        return etelek;
    }

    public int getOsszeg() {
        int osszeg = 0;
        for (int i = 0; i < etelek.size(); i++) {
            osszeg += etelek.get(i).getAr();
        }
        return osszeg;
    }
}
