package main;

import java.util.ArrayList;
import java.util.List;
import model.Asztal;
import model.Etel;
import nezet.KonzolNezet;
import vezerlo.AsztalVezerlo;

public class Program {

    public static void main(String[] args) {
        List<Asztal> asztalok = new ArrayList<>();
        
        Etel babgulyas     = new Etel("Babgulyás", 700);
        Etel rantottSajt   = new Etel("Rántott sajt", 900);
        Etel gyumolcsleves = new Etel("Gyümölcsleves", 800);
        Etel becsiSzelet   = new Etel("Bécsi szelet", 1200);
        Etel somloi        = new Etel("Somlói galuska", 500);

        Asztal piros = new Asztal("Piros asztal");
        piros.addEtel(babgulyas);
        piros.addEtel(rantottSajt);

        Asztal zold = new Asztal("Zöld asztal");
        zold.addEtel(gyumolcsleves);
        zold.addEtel(becsiSzelet);
        zold.addEtel(somloi);

        Asztal kek = new Asztal("Kék asztal");
        kek.addEtel(gyumolcsleves);
        kek.addEtel(rantottSajt);

        Asztal feher = new Asztal("Fehér asztal");
        feher.addEtel(becsiSzelet);

        asztalok.add(piros);
        asztalok.add(zold);
        asztalok.add(kek);
        asztalok.add(feher);

        KonzolNezet nezet = new KonzolNezet();

        AsztalVezerlo vezerlo = new AsztalVezerlo(asztalok, nezet);

        vezerlo.futtat();
    }
    
}
