
package formasgeometricas;


public class Formasgeometricas {

    
    public static void main(String[] args) {
        FormaGeometrica Q1= new Quadrado(3);
        FormaGeometrica T1=new Triangulo(3,4,5,3,4);
        
        System.out.println(Q1.mostrarNome());
        System.out.println(Q1.calcularPerimetro());
        System.out.println(Q1.calcularArea());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(T1.mostrarNome());
        System.out.println(T1.calcularPerimetro());
        System.out.println(T1.calcularArea());
    }
    
}
