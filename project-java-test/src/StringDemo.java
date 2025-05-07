public class IntegerDemo {
    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "Jeffrey Epstein";
        String message = greeting + ", " + name + "!";

        System.out.println(message);
        System.out.println("The length of the message is: " + message.length());
        System.out.println("The first character of the message is: " + message.charAt(0));
        System.out.println("Uppercase message: " + message.toUpperCase());
        System.out.println("First 5 characters: " + message.substring(0, 5));

    }
}
