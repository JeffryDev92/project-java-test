public class SimpleAssignment {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);

        a = b;

        System.out.println("Nuevo valor de a (despues de a = b): " + a);
    }
}
