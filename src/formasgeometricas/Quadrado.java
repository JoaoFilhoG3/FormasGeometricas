
package formasgeometricas;


public class Quadrado implements FormaGeometrica {
    
    private int lado;
    
    
    public Quadrado(int lado){
        this.lado = lado;
    }
    
    public int getLado(){
        return lado;
    }
    public void setLado(int lado){
        this.lado = lado;
    }
    @Override
    public double calcularPerimetro(){
        return this.lado*4;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public String mostrarNome() {
        return "Quadrado";
    }
}
