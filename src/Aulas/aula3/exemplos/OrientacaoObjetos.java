package aula3.exemplos;

public class OrientacaoObjetos {



    // poo
    // analise > projeto > mplementaço > teste > implantaçao
    //classe >  e uma estrutura que abstrai um conceito que precisa ser reprentado
    // objeto > e uma instancia de uma classe
    // a partir de uma classe posso criar objetos
    // classe tem 
    //atributos > definen o estado de um objeto
    //metodos > definen o comportamento de um objeto
    
    //crie um programa que calcule a area e peimetro de um quadrado
    public static void main(String[] args){
        double lado1 = 10;
        double lado2 = 5;

        double area1 = calcularArea(lado1);
        double area2 = calcularArea(lado2);

        double perimetro1 = calcularPerimetro(lado1);
        double perimetro2 = calcularPerimetro(lado2);
        
 
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(perimetro1);
        System.out.println(perimetro2);




       Quadrado q1 = new Quadrado(3.0);
       //q1.lado = 10;
      Quadrado q2 = new Quadrado(5.0);
       // q2.lado = 5;

        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());
        System.out.println(q2.calcularArea());
        System.out.println(q2.calcularPerimetro());

        Retangulo r1 = new Retangulo(10.0, 7.0);
       // r1.base = 10.1;
       // r1.altura = 5.0;
      //  Retangulo r1 = new Retangulo(base = 10.0, altura = 7.0);
        

        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
//  relacionamento de classes
  // dependencia associasao e (agregaçao e composiçao)
  //dependencia > classe recebe no parametro de um metodo outra classe
  //ou quando acessa um objeto estatico de outra classe

  // assiciaçao (agregaçao)> 
  //todo-parte : diario > professor : a parte existe sem o todo

  //associaçao-compociçao : a parte nao existe sem o todo - ciclo de vida esta atrelado
       // Endereco e1 = new Endereco("08280630", 15, "casa 3")
       // Cliente c1 = new Cliente(45, "marcelo", "mace@", e1)
       Cliente c1 = new (45, "marcelo", "mace@", "08280630", 15, "casa 3");
    }

    public static double calcularArea(double lado){
        return lado * lado;
    }
    public static double calcularPerimetro(double lado){
        return 4 * lado;
    }

}
