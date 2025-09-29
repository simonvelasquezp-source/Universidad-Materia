public class Teorica extends Materia {
    private int horasTeoria;
    public Teorica(String codigo, String nombre, int numeroHoras, int creditos, String semestre, String profesor, int horasTeoria){
        super(codigo,nombre,numeroHoras,creditos,semestre,profesor);
this.horasTeoria=horasTeoria;
}
public int getHorasTeoria(){
    return horasTeoria;
}
public void setHorasTeoria(int horasTeoria){
    this.horasTeoria=horasTeoria;
}
@Override
    public int calcularHorasTotales() {
        return getNumeroHoras() + horasTeoria; 
    }
}
