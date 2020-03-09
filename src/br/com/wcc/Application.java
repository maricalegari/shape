package br.com.wcc;

import br.com.wcc.model.Circulo;
import br.com.wcc.model.Quadrado;

public class Application {
}
public static void main(final String[] args) {
    final Circulo circulo1 = new Circulo(1d);
    final Circulo circulo2 = new Circulo(2d);
    System.out.println("Circulo1:  area:" + circulo1.getArea() + " perimetro:  " + circulo1.getPerimetro());

    System.out.println("Circulo2:  area:" + circulo2.getArea() + " perimetro:  " + circulo2.getPerimetro());

    final Quadrado quadrado1 = new Quadrado(2d, 4d);
    final Quadrado quadrado2 = new Quadrado(1d, 2d);
    System.out.println("Quadrado1: area:"  + quadrado1.getArea() +
                         " perimetro:  "  + retangulo1.getPerimetro());
     System.out.println("Quadrado: area:"  + quadrado2.getArea() +
                         " perimetro:  "  + quadrado2.getPerimetro());                    
                    
}
}



















/* package br.com.wcc;

public class Application {

}
public static void main(String[] args) {
    Circulo circulo1 = new Circulo (1d);
    Circulo circulo2 = new Circulo(2d);
    System.out.println("Circulo1:  area:"  +  circulo.getArea() + 
                        " perimetro:  " + circulo.getPerimetro());

    System.out.println("Circulo2:  area:"  +  circulo2.getArea() + 
                        " perimetro:  " + circulo2.getPerimetro());

    Retangulo retangulo1 = new Retangulo(2d, 4d);
    Retangulo retangulo2 = new Retangulo(1d, 2d);
    System.out.println("Retangulo1: area:"  + retangulo1.getArea() +
                         " perimetro:  "  + retangulo1.getPerimetro());
     System.out.println("Retangulo2: area:"  + retangulo2.getArea() +
                         " perimetro:  "  + retangulo2.getPerimetro());                    
                    
}
}
*/