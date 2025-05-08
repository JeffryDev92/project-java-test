public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a; // Pre-incremento: a se incrementa antes de asignar a b
        System.out.println("a: " + a + ", y (prefijo): " + b); // Imprime 6, 5

        int x = 5;
        int y = x++; // Post-incremento: x se asigna a y antes de incrementarse
        System.out.println("x: " +x+ ", y (posfijo): " + y);

    }
}
