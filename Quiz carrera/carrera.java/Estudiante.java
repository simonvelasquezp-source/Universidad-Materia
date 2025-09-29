public abstract class Estudiante { 
private String id; 
private String nombre; 
private String documento; 
private String programa; 
private int semestre; 
    
public Estudiante(String id, String nombre, String documento, String programa, int semestre){ 
    if (id == null || id.isBlank()) { throw new IllegalArgumentException("El ID del estudiante no puede estar vacío.");
} 
    if (semestre <= 0) { throw new IllegalArgumentException("El semestre debe ser mayor que 0."); }

this.id = id; 
this.nombre = nombre; 
this.documento = documento; 
this.programa = programa;
this.semestre = semestre; } 
       
public String getId(){ 
return id; } 
public void setId(String id){
if (id == null || id.isBlank()) { throw new IllegalArgumentException("El ID no puede estar vacío.");
} this.id = id; } 
public String getNombre() { 
return nombre; 
} 
public void setNombre(String nombre) { 
this.nombre = nombre; 
}
public String getDocumento() { 
return documento;
} 
public void setDocumento(String documento) { 
this.documento = documento;
}
public String getPrograma(){
return programa; 
} 
public void setPrograma(String programa) {
this.programa = programa; 
} 
public int getSemestre() {
return semestre;
}
public void setSemestre(int semestre) {
if (semestre <= 0) { throw new IllegalArgumentException("El semestre debe ser mayor que 0.");
 } this.semestre = semestre;
}
@Override 
public String toString() {  
return "Estudiante{" + "id='" + id + '\''
+ ",nombre='" + nombre + '\''
+ ", documento='" + documento + '\'' 
+ ", programa='" + programa + '\''
+ ", semestre=" + semestre + '}'; 
 }

}

