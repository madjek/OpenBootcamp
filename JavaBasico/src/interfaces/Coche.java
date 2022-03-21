package interfaces;

public class Coche {
    String marca;
    String combustible;
    String transmision;
    int fabricado;

    public Coche(String marca, String combustible, String transmision, int fabricado) {
        this.marca = marca;
        this.combustible = combustible;
        this.transmision = transmision;
        this.fabricado = fabricado;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", combustible='" + combustible + '\'' +
                ", transmision='" + transmision + '\'' +
                ", fabricado=" + fabricado +
                '}';
    }
}
