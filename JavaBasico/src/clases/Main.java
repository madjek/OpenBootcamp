package clases;

public class Main {

    public static void main(String[] args){
    SmartDevice telefono = new SmartDevice("SmartPhone", "Apple");
    SmartDevice reloj = new SmartDevice("SmartWatch", "Apple");
    SmartPhone iphoneX = new SmartPhone("Apple", 6.1, 4, 4, 64,12, 4000, "negro");
    SmartWatch appleWatch7 = new SmartWatch("Apple", 1.4, 2, 2, 32, 600, "negro");

    System.out.println(telefono.tipo);
    System.out.println(reloj.marca);
    System.out.println(iphoneX.procesador + " nucleos");
    System.out.println(appleWatch7.capacidad + " GB");
    }
}
