//Varvara Smolianova 115284311
public class Lab16_2 {
    public static void main(String[]args){
       MyInteger test1 = new MyInteger(14); //even
       MyInteger test2 = new MyInteger(7); //odd


        System.out.println("isEven() Method: ");
        System.out.printf("   test 1: %d is even? %s%n", test1.getValue(), test1.isEven());
        System.out.printf("   test 2: %d is even? %s%n", test2.getValue(), test2.isEven());

        System.out.println("\nisOdd() Method: ");
        System.out.printf("   test 1: %d is odd? %s%n", test1.getValue(), test1.isOdd());
        System.out.printf("   test 2: %d is odd? %s%n", test2.getValue(), test2.isOdd());

        System.out.println("\nisPrime() Method: ");
        System.out.printf("   test 1: %d is prime? %s%n", test1.getValue(), test1.isPrime());
        System.out.printf("   test 2: %d is prime? %s%n", test2.getValue(), test2.isPrime());

        System.out.println("\nisEven(MyInteger) Method: ");
        System.out.printf("   Is 16 even? %s%n", MyInteger.isEven(16));

        System.out.println("\nisOdd(MyInteger) Method: ");
        System.out.printf("   Is 16 odd? %s%n", MyInteger.isOdd(16));

        System.out.println("\nisPrime(MyInteger) Method: ");
        System.out.printf("   Is 11 prime? %s%n", MyInteger.isPrime(11));

        System.out.println("\nequals(MyInteger) Method: ");
        System.out.printf("   %d equals %d? %s%n", test1.getValue(), test2.getValue(), test1.equals(test2));
    }
}

