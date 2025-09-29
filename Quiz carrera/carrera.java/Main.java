import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main (String[]args) {
    Estudiante e1=new Posgrado("001", "juan carlos", "1092453637", 2, "ingenieria de sistemas", "Inteligencia artificial");
    Estudiante e2 = new Pregrado("002", "sebastian", "1234567", 2, "ingenieria de sistemas", 4.2, true  );

 Materia m1 = new Teorica("PS01", "pensamiensto sistemico", 4, 3, "2", "Andres", 20);
 Materia m2 = new Practica("PRO01", "Programación", 6, 4, "2", "juan", 50, 10);

Carrera carrera = new Carrera("Ingeniería de Sistemas", "IS01");

carrera.agregarEstudiante(e1);
carrera.agregarEstudiante(e2);

 carrera.agregarMateria(m1);
 carrera.agregarMateria(m2);

List<String> materiasE1 = new ArrayList<>();
materiasE1.add("PS01"); 
materiasE1.add("PRO01"); 
carrera.inscribirEstudianteEnVariasMaterias("001", materiasE1);

List<String> materiasE2 = new ArrayList<>();
materiasE2.add("PRO01"); 
carrera.inscribirEstudianteEnVariasMaterias("002", materiasE2);

        System.out.println(carrera);
        System.out.println("Estudiantes Pensamiento sistemico: " + m1.getEstudiantesInscritos());
        System.out.println("Estudiantes en Programación: " + m2.getEstudiantesInscritos());
    }
}


