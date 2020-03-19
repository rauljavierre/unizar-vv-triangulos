package es.unizar.eina.vv6f.pruebas.triangulos;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrianguloTest {

    @Test
    public void comprobarTrianguloLados_3_3_3_esEquilatero() {
        assertEquals(TipoTriangulo.EQUILATERO, new Triangulo(3, 3, 3).tipo());
    }

    @Test
    public void comprobarTrianguloLados_3_3_2_esIsosceles() {
        assertEquals(TipoTriangulo.ISOSCELES, new Triangulo(3, 3, 2).tipo());
    }

    @Test
    public void comprobarTrianguloLados_3_2_3_esIsosceles() {
        assertEquals(TipoTriangulo.ISOSCELES, new Triangulo(3, 2, 3).tipo());
    }

    @Test
    public void comprobarTrianguloLados_2_3_3_esIsosceles() {
        assertEquals(TipoTriangulo.ISOSCELES, new Triangulo(2, 3, 3).tipo());
    }

    @Test
    public void comprobarTrianguloLados_3_4_5_esEscaleno() {
        assertEquals(TipoTriangulo.ESCALENO, new Triangulo(3, 4, 5).tipo());
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloLado_a_Negativo() {
        new Triangulo(-2, 3, 3); fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloLado_b_Negativo() {
        new Triangulo(3, -2, 3); fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloLado_c_Negativo() {
        new Triangulo(3, 3, -2); fail();
    }

    @Test
    public void comprobarTrianguloLados_1_1_1_esEquilatero() {
        assertEquals(TipoTriangulo.EQUILATERO, new Triangulo(1, 1, 1).tipo());
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloLado_a_Cero() {
        new Triangulo(0, 3, 3); fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloLado_b_Cero() {
        new Triangulo(3, 0, 3); fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloLado_c_Cero() {
        new Triangulo(3, 3, 0); fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloImposible_3_4_7() {
        new Triangulo(3, 4, 7); fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloImposible_3_7_4() {
        new Triangulo(3, 7, 4); fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloImposible_7_3_4() {
        new Triangulo(7, 3, 4); fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloImposible_1_2_7() {
        new Triangulo(1, 2, 7); fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloImposible_1_7_2() {
        new Triangulo(1, 7, 2); fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloImposible_7_1_2() {
        new Triangulo(7, 1, 2); fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void comprobarTrianguloImposible_0_0_0() {
        new Triangulo(0, 0, 0); fail();
    }

    @Test
    public void comprobarTrianguloEscalenoNoRectangulo() {
        assertEquals(TipoTriangulo.ESCALENO, new Triangulo(3, 4, 6).tipo());
    }
}