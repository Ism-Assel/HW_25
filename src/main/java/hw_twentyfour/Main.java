package hw_twentyfour;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[10][10];

        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (j <= arr[i].length) {
                for (int c = arr.length - j; c > 0; c--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= j; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            j++;
        }
    }
}
