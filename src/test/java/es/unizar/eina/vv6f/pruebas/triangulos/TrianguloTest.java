package es.unizar.eina.vv6f.pruebas.triangulos;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrianguloTest {

    @Test
    public void comprobarTrianguloLados_3_3_3_esEquilatero() {
        Triangulo triangulo = new Triangulo(3, 3, 3);
        assertEquals(TipoTriangulo.EQUILATERO, triangulo.tipo());
    }

    @Test
    public void comprobarTrianguloLados_3_3_2_esIsosceles() {
        Triangulo triangulo = new Triangulo(3, 3, 2);
        assertEquals(TipoTriangulo.ISOSCELES, triangulo.tipo());
    }

    @Test
    public void comprobarTrianguloLados_3_2_3_esIsosceles() {
        Triangulo triangulo = new Triangulo(3, 2, 3);
        assertEquals(TipoTriangulo.ISOSCELES, triangulo.tipo());
    }

    @Test
    public void comprobarTrianguloLados_2_3_3_esIsosceles() {
        Triangulo triangulo = new Triangulo(2, 3, 3);
        assertEquals(TipoTriangulo.ISOSCELES, triangulo.tipo());
    }

}