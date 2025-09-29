import java.util.List;
import java.util.ArrayList;
public abstract class Materia {
    private String codigo;
    private String nombre;
    private int numeroHoras;
    private int creditos;
    private String semestre;
    private String profesor;
    private List<Estudiante> estudiantesInscritos;
    public  Materia(String codigo, String nombre, int numeroHoras, int creditos, String semestre, String profesor ){

if (codigo == null || codigo.isBlank()) {
throw new IllegalArgumentException("El código de la materia no puede estar vacío");
}
if (numeroHoras <= 0) {
throw new IllegalArgumentException("Las horas semanales deben ser mayores a 0");
}
if (creditos<=0){ 
throw new IllegalArgumentException("los creditos deben ser mayores a 0");
}
        this.codigo=codigo;
        this.nombre=nombre;
        this.numeroHoras=numeroHoras;
        this.creditos=creditos;
        this.semestre=semestre;
        this.profesor=profesor;
        this.estudiantesInscritos = new ArrayList<>();
    }
    public abstract int calcularHorasTotales();

public String getCodigo(){
    return codigo;
}
public void setCodigo(String codigo){
    if (codigo == null || codigo.isBlank()) {
        throw new IllegalArgumentException("El código de la materia no puede estar vacío");
    }
    this.codigo=codigo;
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public int getNumeroHoras(){
    
    return numeroHoras;
}
public void setNumeroHoras(int numeroHoras){
    if (numeroHoras <= 0) {
        throw new IllegalArgumentException("Las horas semanales deben ser mayores a 0");
    }
    this.numeroHoras=numeroHoras;
}
public int getCreditos(){
    return creditos;
}
public void setCreditos(int creditos){
    this.creditos=creditos;
}
public String getSemestre(){
    return semestre;
}
public void setSemestre(String semestre){
    this.semestre=semestre;
}
public String getProfesor(){
    return profesor;
}
public void setProfesor(String profesor){
    this.profesor=profesor;
}
 
public boolean tieneEstudiante(String idEstudiante) {
    return estudiantesInscritos.stream()
            .anyMatch(e -> e.getId().equals(idEstudiante));
}
public void inscribirEstudiante(Estudiante estudiante) {
    estudiantesInscritos.add(estudiante);
}
public List<Estudiante> getEstudiantesInscritos() {
    return estudiantesInscritos;
}
@Override
public String toString() {
    return "Materia{" +
           "codigo='" + codigo + '\'' +
           ", nombre='" + nombre + '\'' +
           ", horas=" + numeroHoras +
           ", creditos=" + creditos +
           ", semestre='" + semestre + '\'' +
           ", profesor='" + profesor + '\'' +
           '}';
}
}

