package modelo;

public class Triangulo extends Figura{

    /// -----------
    /// Constructor 
    /// -----------
    private double a,b;

    public Triangulo(double b, double a){
        this.a = a;
        this.b = b;
    }

    /// -------
    /// Metodos
    /// -------
    public double hallarPerimetroTriangulo(){
        perimetro = (Math.sqrt(Math.pow(a, 2)+ Math.pow(b,2)));
        return perimetro;
    }

    public double hallarAreaTriangulo(){
        area = b*a/2;
        return area;
    }
}