package es.unizar.eina.vv6f.pruebas.triangulos;

/**
 * Clase para la representación de triángulos a partir únicamente de la longitud <b>entera</b>
 * de sus lados.
 */
public class Triangulo {

    private int a;
    private int b;
    private int c;

    /**
     * Construye un triángulo cuyos lados miden a, b y c unidades.
     *
     * @param a
     *            la longitud entera del primer lado del triángulo.
     * @param b
     *            la longitud entera del segundo lado del triángulo.
     * @param c
     *            la longitud entera del tercer lado del triángulo.
     * @throws IllegalArgumentException
     *            cuando alguno de los lados es menor o igual que cero o cuando las longitudes de
     *            los mismos no permiten formar un triángulo porque la suma de las longitudes de los
     *            dos lados menores es menor o igual que la longitud del más largo.
     */
    public Triangulo(int a, int b, int c) throws IllegalArgumentException {
        // Desigualdad triangular
        if((a + b <= c) || (a + c <= b) || (b + c <= a)){
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Devuelve el tipo de este triángulo (equilátero, isósceles o escaleno)
     * @return el tipo de este triángulo (equilátero, isósceles, escaleno).
     */
    public TipoTriangulo tipo() {
        if (a == b && b == c){
            return TipoTriangulo.EQUILATERO;
        }
        else if(a != b && b != c && a != c) {
            return TipoTriangulo.ESCALENO;
        }
        else{
            return TipoTriangulo.ISOSCELES;
        }
    }
}
