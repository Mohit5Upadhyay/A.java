public class A {
    public static void main(String[] args) {
        // for alphbet "A"
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || i==(n-1)/2 || j==0 || j==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");                    
                }
            }
            System.out.println();     
        }
    }
}
