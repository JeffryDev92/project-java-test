public class DecrementOperator {
    
    public static void main(String[] args) {
        int nivel = 3;

        System.out.println("Valor inicial: " + nivel);

        nivel--; // Decrementa en 1
        System.out.println("Despues de nivel--: " + nivel);

        --nivel; // Decrementa en 1 (equivalente a nivel = nivel - 1)
        System.out.println("Despues de --nivel: " + nivel);
    }
}
