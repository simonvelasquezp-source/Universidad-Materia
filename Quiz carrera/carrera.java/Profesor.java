public abstract class Profesor {
    
    private String id;
    private String nombre;
    private String titulo;
    private int experiencia;
    public Profesor(String id, String nombre, String titulo, int experiencia){
if(id==null || id.isBlank()){
    throw new IllegalArgumentException("el id no puede quedar vacio "); 
}
if(nombre==null || nombre.isBlank()){
    throw new IllegalArgumentException("tiene que escribir su nombre");
}
if(experiencia<0){
    throw new IllegalArgumentException("el valor no puede ser negativo");
}
        this.id=id;
        this.titulo=titulo;
        this.nombre=nombre;
        this.experiencia=experiencia;
    }
public String getId(){
    return id;
}
public void setId(String id){
    if(id==null || id.isBlank()){
        throw new IllegalArgumentException("el id no puede quedar vacio "); 
    }
    this.id=id;
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
 if(nombre==null || nombre.isBlank()){
 throw new IllegalArgumentException("tiene que escribir su nombre");
}
this.nombre=nombre;
}

public String getTitulo(){
    return titulo;
}
public void setTitulo(String titulo){
    this.titulo=titulo;
}
public int getExperiencia(){
 return experiencia;
}
public void setExperiencia(int experiencia){
    if(experiencia<0){
        throw new IllegalArgumentException("el valor no puede ser negativo");
    }
   this.experiencia=experiencia;
}
@Override
public String toString() {
    return "Profesor{" +
            "id='" + id + '\'' +
            ", nombre='" + nombre + '\'' +
            ", titulo='" + titulo + '\'' +
            ", experiencia=" + experiencia +
            '}';
}
}