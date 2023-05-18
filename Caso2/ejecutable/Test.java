package ejecutable;

import javax.swing.JOptionPane;
import modelo.Rectangulo;
import modelo.Triangulo;
import modelo.Circulo;


public class Test {
    public static void main(String[] args) {
        /// Entrada de datos
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base: "));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));

    /// Creacion de un objeto rectangulo

    Rectangulo miRectangulo = new Rectangulo(a,b);
    miRectangulo.hallarAreaRectangulo();
    JOptionPane.showMessageDialog(null, "El área del rectangulo con altura " + a + " y base " + b + " es: " + miRectangulo.hallarAreaRectangulo());

    miRectangulo.hallarPerimetroRectangulo();
    JOptionPane.showMessageDialog(null, "El perimetro del rectangulo con altura " + a + " y base " + b + " es: " + miRectangulo.hallarPerimetroRectangulo());

    Circulo miCirculo = new Circulo(r);
    miCirculo.hallarAreaCirculo();
    JOptionPane.showMessageDialog(null, "El área del circulo con radio " + r + " es: " + miCirculo.hallarAreaCirculo());

    miCirculo.hallarPerimetroCirculo();
    JOptionPane.showMessageDialog(null, "El perimetro del circulo con radio " + r + " es: " + miCirculo.hallarPerimetroCirculo());

    Triangulo miTriangulo = new Triangulo(a,b);
    miTriangulo.hallarAreaTriangulo();
    JOptionPane.showMessageDialog(null, "El área del triángulo con altura " + a + " y base " + b + " es: " + miTriangulo.hallarAreaTriangulo());
    miTriangulo.hallarPerimetroTriangulo();
    JOptionPane.showMessageDialog(null, "El perimetro del triángulo es: " + miTriangulo.hallarPerimetroTriangulo());

    System.exit(0);
    }
}