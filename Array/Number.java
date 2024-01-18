package Array;

public class Number {
    public static void main(String args[]){
        int num1[ ] = new int[4];
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 4;
            int smallest = num1[0];
            int largest = num1[0];
            for (int i = 1; i < num1.length; i++) {
                if (num1[i] < smallest) {
                    smallest = num1[i];
                } else if (num1[i] > largest) {
                    largest = num1[i];
                }
            }

            System.out.println("Smallest Number: " + smallest);
            System.out.println("Largest Number: " + largest);
        }
    }