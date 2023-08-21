//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class Agenda {
    public Agenda() {
    }

    public void menuAgenda(Vector var1) {
        String var2 = "";
        Scanner var3 = new Scanner(System.in);
        System.out.println("¿Qué desea hacer en su agenda?");
        System.out.println("Ver agenda (escriba 'VER')");
        System.out.println("Agregar contacto (escriba 'AGR')");
        System.out.println("Eliminar contacto (escriba 'ELI')");
        System.out.println("Modificar contacto (escriba 'MOD')");
        var2 = var3.nextLine();
        if (Objects.equals(var2, "VER")) {
            this.mostrarAgenda(var1);
        } else if (Objects.equals(var2, "AGR")) {
            this.crearAgenda(var1);
        } else if (Objects.equals(var2, "ELI")) {
            this.eliminarAgenda(var1);
        } else if (Objects.equals(var2, "MOD")) {
            this.modificarAgenda(var1);
        } else {
            System.out.println("¡Digite bien los comandos!!");
        }

    }

    public void mostrarAgenda(Vector var1) {
        for(int var2 = 0; var2 < var1.size(); ++var2) {
            Contacto var3 = (Contacto)var1.elementAt(var2);
            System.out.println(var2 + ".-" + var3.nombre + " " + var3.apellido + " " + var3.email);
        }

        this.menuAgenda(var1);
    }

    public void crearAgenda(Vector var1) {
        Scanner var2 = new Scanner(System.in);
        System.out.println("Nombre:");
        String var3 = var2.nextLine();
        System.out.println("Apellido:");
        String var4 = var2.nextLine();
        System.out.println("e-Mail:");
        String var5 = var2.nextLine();
        var1.addElement(new Contacto(var3, var4, var5));
        this.menuAgenda(var1);
    }

    public void eliminarAgenda(Vector var1) {
        Scanner var2 = new Scanner(System.in);
        System.out.println("Ingrese el indice del contacto a eliminar:");
        int var3 = var2.nextInt();
        var1.removeElementAt(var3);
        System.out.println("Contato borrado");
        this.mostrarAgenda(var1);
    }

    public void modificarAgenda(Vector var1) {
        Scanner var2 = new Scanner(System.in);
        Scanner var3 = new Scanner(System.in);
        System.out.println("Ingrese el indice del contacto a editar:");
        int var4 = var3.nextInt();
        System.out.println("Va a modificar el contacto:");
        Contacto var5 = (Contacto)var1.elementAt(var4);
        System.out.println(var4 + ".-" + var5.nombre + " " + var5.apellido + " " + var5.email);
        System.out.println("Nombre:");
        String var6 = var2.nextLine();
        System.out.println("Apellido:");
        String var7 = var2.nextLine();
        System.out.println("e-Mail:");
        String var8 = var2.nextLine();
        Contacto var9 = new Contacto(var6, var7, var8);
        var1.removeElementAt(var4);
        var1.insertElementAt(var9, var4);
        this.mostrarAgenda(var1);
    }
}
