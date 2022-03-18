package clases;

public class SmartDevice {
    String tipo;
    String marca;
    
    public SmartDevice(String tipo, String marca){
        this.tipo = tipo;
        this.marca = marca;
    }
}

class SmartPhone {
    String marca;
    double pulgadas;
    int procesador;
    int memoriaRam;
    int capacidad;
    int camara;
    int bateria;
    String color;

    public SmartPhone(String marca, double pulgadas, int procesador, int memoriaRam, int capacidad, int camara,
                      int bateria, String color){
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.capacidad = capacidad;
        this.camara = camara;
        this.bateria = bateria;
        this.color = color;
    }
}

class SmartWatch {
    String marca;
    double pulgadas;
    int procesador;
    int memoriaRam;
    int capacidad;
    int bateria;
    String color;

    public SmartWatch(String marca, double pulgadas, int procesador, int memoriaRam, int capacidad, int bateria,
                      String color){
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.capacidad = capacidad;
        this.bateria = bateria;
        this.color = color;
    }
}