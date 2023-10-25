
public class Dinosaurio extends Especimen {
    String tipo;
    double tamano;
    double peso;

     // Getters
     public String getTipo() {
        return tipo;
    }

    public double getTamano() {
        return tamano;
    }

    public double getPeso() {
        return peso;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}