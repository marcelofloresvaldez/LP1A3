package aula3.exemplos;

public class Quadrado {
    private double lado;
   
       // if(lado <= 0.0){
       //     throw new IllegalArgumentException("lado deve ser maior que zero");
       // }
    public Quadrado (double lado){
       setlado(lado);
        this.lado = lado;

    }
    public double calcularArea(){
        return lado * lado;

    }
    public double calcularPerimetro(){
        return 4*lado;

    }
    public void setlado(double lado){
        if(lado <= 0.0){
            throw new IllegalArgumentException("lado deve ser maior que zero");
        }
        this.lado = lado;
    }
    public double getlado {
        return lado;
    }

}
