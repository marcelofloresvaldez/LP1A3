package Exercicios.Aula4;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import Exercicios.Aula4.Retangulo;
public class RectanguloTest {
    @Test
    public  void criarUmRetangulo() {
        double base = 10;
        double altura = 5;
        Retangulo retangulo = new Retangulo(base, altura) ;     
        Assertions.assertEquals(base,altura);
    }
        @Test
    public void areaRetanguloIgual50() {
            double areaEsperada = 50;
            Retangulo retangulo = new Retangulo(10, 5);
            double area = retangulo.calcularArea();
            Assertions.assertEquals(areaEsperada, area);
            
        }
        @Test
        public void perimetroRetanguloIgual50() {
            double perimetroEsperada = 30;
            Retangulo retangulo = new Retangulo(10, 5);
            double perimetro = retangulo.calcularPerimetro();
            Assertions.assertEquals(perimetroEsperada , perimetro);
            
        }
        
}



    

