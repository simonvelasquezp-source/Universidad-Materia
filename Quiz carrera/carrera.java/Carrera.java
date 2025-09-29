import java.util.ArrayList;
import java.util.List;
public class Carrera {
    private String nombre;
    private String codigo;
    private List<Materia> materias;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;

    public Carrera(String nombre, String codigo) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la carrera no puede estar vacío");
        }
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El código de la carrera no puede star vacío");
        }
        this.nombre = nombre;
        this.codigo = codigo;
        this.materias = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public void eliminarMateria(String codigo) {
        materias.removeIf(m -> m.getCodigo().equals(codigo));
    }

    public void listarMateriasPorSemestre(String semestre) {
        materias.stream()
                .filter(m -> m.getSemestre().equals(semestre))
                .forEach(System.out::println);
    }

    //  CRUD Profesores 
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void eliminarProfesor(String id) {
        profesores.removeIf(p -> p.getId().equals(id));
    }

    public void listarProfesores() {
        profesores.forEach(System.out::println);
    }

    //  CRUD Estudiantes
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(String id) {
        estudiantes.removeIf(e -> e.getId().equals(id));
    }

    public void listarEstudiantes() {
        estudiantes.forEach(System.out::println);
    }
    
public void listarEstudiantesEnMateria(String codigoMateria) {
        materias.stream()
                .filter(m -> m.getCodigo().equals(codigoMateria))
                .findFirst()
                .ifPresentOrElse(
                        m -> m.getEstudiantesInscritos().forEach(System.out::println),
                        () -> System.out.println("Materia no encontrada"));
    }
    public void inscribirEstudianteEnVariasMaterias(String idEstudiante, List<String> codigosMaterias) {
    Estudiante estudiante = estudiantes.stream()
            .filter(e -> e.getId().equals(idEstudiante)).findFirst()
            .orElseThrow(() -> new IllegalArgumentException("El estudiante no esta inscrito"));
            for (String codigoMateria : codigosMaterias) {
        materias.stream()
                .filter(m -> m.getCodigo().equals(codigoMateria))
                .findFirst()
                .ifPresentOrElse(
                        m -> m.inscribirEstudiante(estudiante),
                        () -> System.out.println("Materia con código " + codigoMateria + " no encontrada")
                );
    }
}

    public int calcularCreditosEstudiante(String idEstudiante) {
    return materias.stream()
            .filter(m -> m.tieneEstudiante(idEstudiante)) 
            .mapToInt(Materia::getCreditos)
            .sum();
}
    
}