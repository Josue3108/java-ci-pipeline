
public class Test{

    public static void main(String[] args){
        Calculadora calculadora = new Calculadora(5,4);

        System.out.println("La suma es " + calculadora.Suma());
        System.out.println("La resta es " + calculadora.Resta());
        System.out.println("La multiplicacion es " + calculadora.Multiplicar());
        System.out.println("La division es " + calculadora.Dividir());
    }
}
