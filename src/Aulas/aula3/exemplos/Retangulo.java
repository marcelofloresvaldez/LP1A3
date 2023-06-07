package aula3.exemplos;

public class Retangulo {
    private double base;
   private double altura;
    // modifucador de acesso + tipo de retorno + nome + parametro

    public Retangulo (double base, double altura ){

        if(base <= 0.0){
            throw new IllegalArgumentException("base deve ser maior que zero");
        }
        if(altura <= 0.0){
            throw new IllegalArgumentException("altura deve ser maior que zero");
        }
        this.base = base;
        this,altura = altura;
    //metodo
    public double calcularArea(){
        return base * altura;

    }
    public double calcularPerimetro(){
        return 2 * (base + altura);

    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
}
