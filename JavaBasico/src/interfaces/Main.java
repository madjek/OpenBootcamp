package interfaces;

public class Main {

    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        Coche citroen = new Coche("Citroen", "diesel", "manual", 2017);
        Coche renault = new Coche("Renault", "gasolina", "manual", 2007);
        Coche peugeot = new Coche("Peugeot", "electrico", "automatico", 2020);

        cocheCRUD.save(citroen);
        cocheCRUD.save(renault);
        cocheCRUD.save(peugeot);

        cocheCRUD.findAll();
        cocheCRUD.delete(renault);
        cocheCRUD.findAll();
    }

}
