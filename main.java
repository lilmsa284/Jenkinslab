public class main {

    public static void main(String[] args) {

        System.out.println("Hello Jenkins CI Pipeline!");

        // Simple build step simulation
        System.out.println("Building project... DONE");

        // Simple test simulation
        int result = add(2, 3);

        if (result == 5) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

        System.out.println("Pipeline Finished Successfully!");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
