public class Practica extends Materia{
    private int horasPractica;
    private int numeroLaboratorios;

    public Practica(String codigo, String nombre, int numeroHoras, int creditos, String semestre, String profesor, int horasPractica, int numeroLaboratorios ){
        super(codigo,nombre,numeroHoras,creditos,semestre,profesor);
        if (horasPractica < 0) {
            throw new IllegalArgumentException("Las horas de práctica no pueden ser negativas");
            }
        if(numeroLaboratorios<0){
            throw new IllegalArgumentException("El numero de laboratorios no puede ser negativo");
        } 
        
this.horasPractica=horasPractica;
this.numeroLaboratorios=numeroLaboratorios;
    }
    @Override
    public int calcularHorasTotales() {
        return getNumeroHoras() + horasPractica; 
    }

    public int getHorasPractica() { return horasPractica; }
    public void setHorasPractica(int horasPractica) {
        if (horasPractica < 0) {
            throw new IllegalArgumentException("Las horas de práctica no pueden ser negativas");
        }
        this.horasPractica = horasPractica;
    }

    public int getNumeroLaboratorios() { return numeroLaboratorios; }
    public void setNumeroLaboratorios(int numeroLaboratorios) {
        if (numeroLaboratorios < 0) {
            throw new IllegalArgumentException("El número de laboratorios no puede ser negativo");
        }
        this.numeroLaboratorios = numeroLaboratorios;
    }
    }

