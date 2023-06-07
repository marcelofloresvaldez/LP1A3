package Exercicios.Aula4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import Exercicios.Aula4.Circulo;
public class CirculoTest {
    @Test
    public void criarUmCirculoComRaio10() {
        double raio =10.0;
        double pi = 3.14;
        Circulo circulo = new Circulo(raio);
        Assertions.assertEquals(raio,circulo.getRaio());
    }
    @Test
    public void oCirculoComRaio150DebTerArea70650() {
        double areaEsperada = 70650;
        double pi = 3.14;
        Circulo circulo = new Circulo(150);
        double area = circulo.CalcularArea();
        Assertions.assertEquals(areaEsperada, area); 
    }
    @Test
    public void oCirculoComRaio3DeveTerPerimetro(){
        double perímetroEsperado = 18.84;
        double pi = 3.14;
        Circulo circulo = new Circulo(3);
        double perímetro = circulo.CalcularPerimetro();
        Assertions.assertEquals(perímetroEsperado, perímetro);
    }   

}
