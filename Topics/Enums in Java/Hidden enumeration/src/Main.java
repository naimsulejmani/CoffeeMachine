public class Main {

    public static void main(String[] args) {
        // write your program here
        int counter = 0;
        for (Enum en : Secret.values()) {
            if (en.name().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

/* sample enum for inspiration
enum Secret {
    STAR, CRASH, START, // ...
}
*/