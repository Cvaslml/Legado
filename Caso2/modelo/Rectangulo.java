package modelo;

public class Rectangulo extends Figura{
    
    /// -----------
    /// Constructor 
    /// -----------
    private double a;
    private double b;

    public Rectangulo(double a, double b){
        this.a = a;
        this.b = b;
    }

    /// -------
    /// Metodos
    /// -------
    public double hallarPerimetroRectangulo(){
        perimetro = 2 * (a + b);
        return perimetro;
    }

    public double hallarAreaRectangulo(){
        area = a*b;
        return area;
    }

}