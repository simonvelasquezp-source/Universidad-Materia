public class Planta extends Profesor{
    private String proyectos;
    private String dedicacion;
    private boolean esSindicalizado;
   
 public Planta(String id, String nombre, String titulo, int experiencia,String proyectos, String dedicacion, boolean esSindicalizado){
        super(id,nombre,titulo,experiencia);
        this.proyectos=proyectos;
        this.dedicacion=dedicacion;
        this.esSindicalizado=esSindicalizado;

    }
public String getProyectos(){
    return proyectos;
}
public void setProyectos(String proyectos){
    this.proyectos=proyectos;
}
public String getDedicacion() {
    return dedicacion;
}

public void setDedicacion(String dedicacion) {
    this.dedicacion = dedicacion;
}

public boolean isEsSindicalizado() {
    return esSindicalizado;
}

public void setEsSindicalizado(boolean esSindicalizado) {
    this.esSindicalizado = esSindicalizado;
}

@Override
public String toString() {
    return "Profesor Planta{" +
            "id='" + getId() + '\'' +
            ", nombre='" + getNombre() + '\'' +
            ", titulo='" + getTitulo() + '\'' +
            ", experiencia=" + getExperiencia() +
            ", dedicacion='" + dedicacion + '\'' +
            ", sindicalizado=" + esSindicalizado +
            '}';
}
}
