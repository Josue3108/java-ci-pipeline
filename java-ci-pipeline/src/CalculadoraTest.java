import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void suma() {
        Calculadora calculadora = new Calculadora(1,2);
        assertEquals(3, calculadora.Suma());
    }
    @Test
    void resta() {
        Calculadora calculadora = new Calculadora(2,1);
        assertEquals(1, calculadora.Resta());
    }
    @Test
    void multiplicar() {
        Calculadora calculadora = new Calculadora(3,2);
        assertEquals(6, calculadora.Multiplicar());
    }
    @Test
    void dividir() {
        Calculadora calculadora = new Calculadora(6,2);
        assertEquals(3, calculadora.Dividir());
    }
    @Test
    void suma2() {
        Calculadora calculadora = new Calculadora(3,2);
        assertEquals(5, calculadora.Suma());
    }
    @Test
    void resta2() {
        Calculadora calculadora = new Calculadora(7,8);
        assertEquals(-1, calculadora.Resta());
    }
    @Test
    void multiplicar2() {
        Calculadora calculadora = new Calculadora(5,6);
        assertEquals(30, calculadora.Multiplicar());
    }
    @Test
    void dividir2() {
        Calculadora calculadora = new Calculadora(1000,25);
        assertEquals(40, calculadora.Dividir());
    }
}