public class Empresa {
    public static void main(String[] args) {
        Programador prog = new Programador("Ronald Mackay");
        Diseñador dis = new Diseñador("Amilcar Montejo");

        Actividad actGeneral = new Actividad("Simple", "Tarea simple y rapida"); // Como mandar un correo o algo que cualquiera puede hacer
        Programa actProg = new Programa("Programar", "Tarea de echarse la sesion nocturna de codigo");
        Diseño actDis = new Diseño("Diseño", "Tarea de hacerse unos wireframes para la app copia de uber 2.0");

        prog.trabajar(actProg);
        prog.trabajar(actDis);
        prog.trabajar(actGeneral);

        dis.trabajar(actDis);
        dis.trabajar(actGeneral);
        dis.trabajar(actProg);
    }
}


/*
☕ Salida en la terminal ☕


El programador Ronald Mackay realizó una actividad
El programador Ronald Mackay No realiza actividades del área de Diseño
El programador Ronald Mackay realizó una actividad simple o general
El diseñador Amilcar Montejo realizó una actividad
El diseñador Amilcar Montejo realizó una actividad general o simple
El diseñador Amilcar Montejo No realiza actividades del área de Programación
*/
