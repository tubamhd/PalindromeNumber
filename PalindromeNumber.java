public class PalindromeNumber {

    static boolean ispalindrome(int number){
        //If function value is boolean return value has to be true or false!
       int temp = number;
       int reversenumber = 0;
       int lastnumber;

       while ( temp != 0){
           lastnumber = temp % 10;
           reversenumber = (reversenumber * 10) + lastnumber;
           temp /= 10;
       }

       if (number == reversenumber)
           return true;
       else
           return false;
    }


    public static void main(String[] args) {
        System.out.println(ispalindrome(432));
        System.out.println(ispalindrome(242));
        System.out.println(ispalindrome(765));
        System.out.println(ispalindrome(101));

        //int a = number % 10; (Bir sayının 10a bölümünden kalanı gösterir ve son haneyi siler.

    }
}
