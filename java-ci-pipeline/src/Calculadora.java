public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora (int val1, int val2){
        num1 = val1;
        num2 = val2;
    }

    public int Suma(){
        return num1 + num2;
    }

    public int Resta(){
        return num1 - num2;
    }

    public int Multiplicar(){
        return num1 * num2;
    }

    public int Dividir(){
        return num1/num2;
    }
}

class Test{

    public static void main(String[] args){
        Calculadora calculadora = new Calculadora(5,4);

        System.out.println("La suma es " + calculadora.Suma());
        System.out.println("La resta es " + calculadora.Resta());
        System.out.println("La multiplicacion es " + calculadora.Multiplicar());
        System.out.println("La division es " + calculadora.Dividir());
    }
}

