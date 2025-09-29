public class Catedra extends Profesor {
    private int numeroHoras;
    private double valorHora;

    public Catedra(String id, String nombre, String titulo, int experiencia,int numeroHoras, double valorHora){
        super(id,nombre,titulo,experiencia);
        if(numeroHoras < 0) {
            throw new IllegalArgumentException("El número de horas no puede ser negativo");
        }
        if(valorHora < 0) {
            throw new IllegalArgumentException("El valor por hora no puede ser negativo");
        }
        this.numeroHoras = numeroHoras;
        this.valorHora = valorHora;
    }
    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        if(numeroHoras < 0) {
            throw new IllegalArgumentException("El número de horas no puede ser negativo");
        }
        this.numeroHoras = numeroHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora < 0) {
            throw new IllegalArgumentException("El valor por hora no puede ser negativo");
        }
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        return numeroHoras * valorHora;
    }

    @Override
    public String toString() {
        return "Profesor Catedra{" +
                "id='" + getId() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", experiencia=" + getExperiencia() +
                ", horas=" + numeroHoras +
                ", valorHora=" + valorHora +
                ", salario=" + calcularSalario() +
                '}';
    }

}


