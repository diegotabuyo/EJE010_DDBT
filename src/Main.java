import figuras.Circulo;

//Diego Daniel Becerra Tabuyo 3IM1

public class Main {
    public static void main(String[] args) {
        // 1. Creación de 3 instancias con distintos constructores y valores
        System.out.println("=== CREACIÓN DE CÍRCULOS ===");
        Circulo c1 = new Circulo();                     // (0, 0), r = 1
        Circulo c2 = new Circulo(3.0, 4.0);             // (3, 4), r = 1
        Circulo c3 = new Circulo(-2.5, 5.0, 4.5);       // (-2.5, 5), r = 4.5

        // Dibujar estado inicial
        c1.dibujar();
        c2.dibujar();
        c3.dibujar();

        // 2. Cálculo de área y perímetro
        System.out.println("\n=== CÁLCULOS DE ÁREA Y PERÍMETRO ===");
        mostrarMetricas("Círculo 1", c1);
        mostrarMetricas("Círculo 2", c2);
        mostrarMetricas("Círculo 3", c3);

        // 3. Modificación de posición mediante métodos de movimiento
        System.out.println("\n=== TRASLACIÓN DE CÍRCULOS ===");
        c1.moverX(5.0);           // Se mueve 5 unidades en X
        c2.moverY(-2.0);          // Se mueve -2 unidades en Y
        c3.moverXY(2.5, -5.0);    // Se mueve a la derecha y abajo

        System.out.println("Nuevas posiciones tras el movimiento:");
        c1.dibujar();
        c2.dibujar();
        c3.dibujar();
    }

    // Método auxiliar para imprimir métricas de forma limpia
    private static void mostrarMetricas(String nombre, Circulo c) {
        System.out.printf("%s -> Área: %.4f | Perímetro: %.4f%n",
                nombre, c.calcularArea(), c.calcularPerimetro());
    }
}