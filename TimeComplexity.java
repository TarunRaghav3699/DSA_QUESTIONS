public class TimeComplexity {

    public static void function(int n) {
        if (n == 1) return;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {
        int n = 5; // Replace with your desired value of n
        long startTime = System.nanoTime();
        function(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("\nTime taken: " + duration + " nanoseconds");
    }
}

