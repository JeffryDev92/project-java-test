public class IncrementOperator {
    public static void main(String[] args) {
        int contador = 0;

        System.out.println("Valor inicial: " + contador);

        contador++; // Incrementa en 1
        System.out.println("Despues de contador++: " + contador);

        ++contador; // Incrementa en 1 (equivalente a contador = contador + 1)
        System.out.println("Despues de ++contador: " + contador);
    }
}
