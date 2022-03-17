public class EjT8 {

    public static void main(String[] args) {
        // Crear clase Persona.
        class Persona {
            // Crear variables las privadas edad, nombre y telefono de la clase Persona.
            private int edad;
            private String nombre;
            private String telefono;
            // Crear gets y sets de cada propiedad.
            public void setEdad(int edad) {
                this.edad = edad;
            }
            public int getEdad(){
                return this.edad;
            }
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public String getNombre(){
                return this.nombre;
            }
            public void setTelefono(String telefono) {
                this.telefono = telefono;
            }
            public String getTelefono(){
                return this.telefono;
            }
        }
        // Crear un objeto persona en el main.
        Persona alumno = new Persona();
        // Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último
        // muéstralas por consola.
        alumno.setEdad(23);
        alumno.setNombre("John");
        alumno.setTelefono("+1234567890");

        System.out.println(alumno.getNombre() + " " + alumno.getEdad() + " " + alumno.getTelefono());
    }
}
