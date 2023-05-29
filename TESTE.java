
    public class CalculadoraTest {
        @Test
        public void testSomarValores() {
            Calculadora calculadora = new Calculadora();
            calculadora.somarValores(10.0, 10.0);
            assertEquals(20.0, calculadora.getResultado(), 0.001);
        }

        @Test
        public void testSubtrairValores() {
            Calculadora calculadora = new Calculadora();
            calculadora.subtrairValores(10.0, 10.0);
            assertEquals(0.0, calculadora.getResultado(), 0.001);
        }

        @Test
        public void testMultiplicarValores() {
            Calculadora calculadora = new Calculadora();
            calculadora.multiplicarValores(10.0, 10.0);
            assertEquals(100.0, calculadora.getResultado(), 0.001);
        }

        @Test
        public void testDividirValoresComSegundoNumeroDiferenteDeZero() {
            Calculadora calculadora = new Calculadora();
            calculadora.dividirValores(10.0, 10.0);
            assertEquals(1.0, calculadora.getResultado(), 0.001);
        }

        @Test
        public void testDividirValoresComSegundoNumeroIgualAZero() {
            Calculadora calculadora = new Calculadora();
            calculadora.dividirValores(10.0, 0.0);
            assertEquals(-1.0, calculadora.getResultado(), 0.001);
        }
    }
    Os casos de teste acima foram implementados utilizando a biblioteca JUnit e garantem que os mét


2 / 2







    Regenerate response

}
