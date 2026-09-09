public class PatternD {
    public static void main(String[] args) {
        int rows = 7;
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces to right-align
            for (int j = 1; j <= rows - i; j++) {
                System.print(" ");
            }
            // Print characters from 'A' up to the current row length
            char ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
