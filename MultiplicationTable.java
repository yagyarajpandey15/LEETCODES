public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 23; // the number for which the table is printed

        System.out.println("Multiplication Table of " + number);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
