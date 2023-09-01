public class Empleado {
    String nombre;
    static int nextId = 1;
    int id;

    public Empleado(String nom) {
        this.nombre = nom;
        this.id = nextId++;
    }

    public void trabajar(Actividad act) {}

}