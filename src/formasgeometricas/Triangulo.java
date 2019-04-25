
package formasgeometricas;

public class Triangulo implements FormaGeometrica{
    private int lado1;
    private int lado2;
    private int lado3;
    private int altura;
    private int base;
    
    
    public Triangulo(int lado1, int lado2, int lado3, int altura, int base){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
        this.altura=altura;
        this.base=base;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado1+this.lado2+this.lado3;
    }

    @Override
    public double calcularArea() {
        return (this.base*this.altura)/2;
    }

    @Override
    public String mostrarNome() {
        return "Triângulo";
    }
    
}
