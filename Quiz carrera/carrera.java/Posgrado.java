public class Posgrado extends Estudiante {
  
    private String investigacion;
public Posgrado (String id, String nombre, String documento, int semestre, String programa, String investigacion){
    super(id,nombre,documento,programa,semestre);
    if (investigacion == null || investigacion.isBlank()) {
        throw new IllegalArgumentException("La línea de investigación no puede estar vacía");
    }
   this.investigacion=investigacion;
}

public String getInvestigacion(){
    return investigacion;
}
public void setInvestigacion(String investigacion){
    if (investigacion == null || investigacion.isBlank()) {
        throw new IllegalArgumentException("La línea de investigación no puede estar vacía");
    }
    this.investigacion=investigacion;}
    @Override
    public String toString() {
        return "Posgrado{" +
                "id='" + getId() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", documento='" + getDocumento() + '\'' +
                ", programa='" + getPrograma() + '\'' +
                ", semestre='" + getSemestre() + '\'' +
                ", investigacion='" + investigacion + '\'' +
                '}';
    }
    }