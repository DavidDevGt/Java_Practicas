public class Programador extends Empleado {
    public Programador(String nom) {
        super(nom);
    }

    @Override
    public void trabajar(Actividad act) {
        if (act instanceof Programa) {
            System.out.println("El programador " + this.nombre + " realizo una actividad");
        } else if (act instanceof Diseño) {
            System.out.println("El programador " + this.nombre + " No realiza actividades del área de Diseño");
        } else {
            System.out.println("El programador " + this.nombre + " realizo una actividad simple o general");
        }
    }
}