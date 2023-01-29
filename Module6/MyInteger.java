public class MyInteger {
    private int value;
    public MyInteger(int v) {
        value = v;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int v){
        this.value = v;
    }
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value == 1 || value == 2) return true;
        for (int i = 2; i < value; i++)
            if (value % i == 0) return false;
        return true;
    }

    public static boolean isEven(int integer){
        return integer%2 == 0;
    }
    public static boolean isOdd(int integer){
        return integer%2 !=0;
    }
    public static boolean isPrime(int integer){
        if (integer == 1 || integer == 2)return true;
        for (int i = 2; i<integer; i++)
            if (integer%i == 0) return false;
        return true;
    }
    public static boolean isEven(MyInteger integer) {
        return integer.isEven();
    }

    public static boolean isOdd(MyInteger integer) {
        return integer.isOdd();
    }

    public static boolean isPrime(MyInteger integer) {
        return integer.isPrime();
    }

    public boolean equals(int v) {
        return value == v;
    }
    public boolean equals(MyInteger integer) {
        return integer.value == this.value;
    }
}