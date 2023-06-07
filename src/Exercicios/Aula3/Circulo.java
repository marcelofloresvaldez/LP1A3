package Exercicios.Aula3;


// Implemente a classe Circulo com o atributo raio e métodos para calcular área e o perímetro.
public class Circulo {
    public static final String MENSAGEM_RAIO_INVALIDO = "raio deve ser maior a zero" ; 
        
    private double raio;
    private double pi = 3.14;

    public Circulo (double raio) {
        setRaio(raio);
    }
     //A área de um círculo é pi vezes o raio elevado ao quadrado (A = π r²).
     public double CalcularArea() {
        return pi*(raio*raio);
        
    }
    //C = 2 * π * r, onde: C = comprimento da circunferência ou perímetro.
    public double  CalcuraPerimetro() {
        return 2*pi*raio;
    }
    
    public void setRaio(double raio) {
        if(raio <= 0.0){
            throw new IllegalArgumentException("MENSAGEM_RAIO_INVALIDO");
        }
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }
   
}
