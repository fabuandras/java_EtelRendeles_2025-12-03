package nezet;

import java.util.List;
import model.Asztal;
import model.Etel;

public class KonzolNezet {

    public void megjelenit(List<Asztal> asztalok) {
        for (int i = 0; i < asztalok.size(); i++) {
            Asztal a = asztalok.get(i);

            System.out.println(a.getSzin() + ":");
            System.out.println("=========================");

            List<Etel> etelek = a.getEtelek();
            for (int j = 0; j < etelek.size(); j++) {
                Etel e = etelek.get(j);
                System.out.printf("%-16s %5d Ft%n", e.getNev(), e.getAr());
            }
            
            System.out.println("_________________________");
            System.out.printf("Összesen:%18d Ft%n", a.getOsszeg());
            System.out.println();
        }
    }
}
