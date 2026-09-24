public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5.0, 5.0);

        System.out.println("É quadrado? " + r1.isQuadrado());
        System.out.println("Área: " + r1.calcularArea());
    }
}
