// Smolianova Varvara 115284311
public class Emirp {
    public static void main(String [] args){
        int i=13,countLine = 0, count = 0;
        while (count <100){
            if (isEmirp(i)){
                System.out.print(i + " ");
                count++;
                countLine++;
            }
            i++;
            if(countLine == 10){
                countLine=0;
                System.out.println();
            }
        }
    }
    public static boolean isPrime(int integer){
       for (int i = 2; i <integer; i++)
          if (integer%i == 0) return false;
         return true;
    }
    public static boolean isEmirp(int integer){
       int integerCheck = reverseInt(integer);
       if (isPrime(integer) && !isPalindrome(integer,integerCheck)){
           if(isPrime(integerCheck)) return true;
           else return false;
       }
        else return false;
    }

    public static int reverseInt(int integer){
        int reverse = 0;
        while (integer !=0){
            int i = integer%10;
            reverse = reverse *10 +i;
            integer /=10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int intInitial, int intReversed){
          if (intInitial == intReversed) return true;
          else return false;
    }

}