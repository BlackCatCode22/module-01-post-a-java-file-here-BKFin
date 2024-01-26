public class VarsAndMath {
    public static void main (String[] args) {
        System.out.println("\n Welcome to variables and math !! \n");
    

    // Declaring an integer named 'a' and giving it a value of 10
    int a = 10;

    // Declaring a double named 'b' and giving is a value of 5.5
    double b = 5.5;

    // Performing the math on 'a' and 'b' and storing the answer in a double called 'sum'
    double sum = a + b;

    // Outputting the sum to the screen
    System.out.println("\n\n The sum of " + a + " and " + b + " is " + sum);

    // Now doing multiplication and outputting the product, which will be a double
    double product = a * b;

    System.out.println("The product of " + a + " and " + b + " is: " + product);

    // And now changing a variable's value, specifically changing a from 10 to 20, then recalculating the sum
    a = 20;
    sum = a + b;
    System.out.println("The new sum of " + a + " and " + b + " is: " + sum);
    }
}
