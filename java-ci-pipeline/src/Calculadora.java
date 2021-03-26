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



