public class Pregrado extends Estudiante{
    private double promedio;
    private boolean beca;

    public Pregrado(String id, String nombre, String documento, int semestre, String programa, double promedio, boolean beca){
        super(id,nombre,documento,programa,semestre);
    if(semestre < 1 || semestre > 10) {
        throw new IllegalArgumentException("El semestre debe estar entre 1 y 10");
    }
     if (promedio < 0.0 || promedio > 5.0) {
    throw new IllegalArgumentException("El promedio debe estar entre 0.0 y 5.0");
    }
    if (beca && promedio < 3.8) {
    throw new IllegalArgumentException("El promedio debe ser de 3.8 o mayor");   
}
    this.beca=beca;
    this.promedio=promedio;
    } 
public double getPromedio(){
    return promedio;
}
public void setPromedio(double promedio){
    if(promedio < 0.0 || promedio >5.0){
        throw new IllegalArgumentException("el promedio debe ser de entre 0.0 y 5.0");
    }
    this.promedio=promedio;
}
public boolean isBeca(){
    return beca;
}
public void setBeca(boolean beca){
    if (beca && promedio < 4.0) {
    throw new IllegalArgumentException("El promedio debe ser de 3.8 o mayor"); 
}
 this.beca=beca;}
    @Override
public String toString() {
    return "Pregrado{" +
            "id='" + getId() + '\'' +
            ", nombre='" + getNombre() + '\'' +
            ", documento='" + getDocumento() + '\'' +
            ", programa='" + getPrograma() + '\'' +
            ", semestre=" + getSemestre() +
            ", promedio=" + promedio +
            ", beca=" + beca +
            '}';
}

}
