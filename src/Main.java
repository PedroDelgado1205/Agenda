//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Vector;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Vector var1 = new Vector();
        Contacto var2 = new Contacto("Pedro", "Delgado", "pemildebra@gmail.com");
        var1.add(var2);
        Agenda var3 = new Agenda();
        var3.menuAgenda(var1);
    }
}
