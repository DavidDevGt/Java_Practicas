public class Diseñador extends Empleado {
    public Diseñador(String nom) {
        super(nom);
    }

    @Override
    public void trabajar(Actividad act) {
        if (act instanceof Diseño) {
            System.out.println("El diseñador " + this.nombre + " realizo una actividad");
        }else if (act instanceof Programa) {
            System.out.println("El diseñador " + this.nombre + " No realiza actividades del área de Programación");
        } else {
            System.out.println("El diseñador " + this.nombre + " realizo una actividad general o simple");
        }
    }
}