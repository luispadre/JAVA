//import java.lang.reflect.Method;
//import java.util.Collection;
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        Test x= new Test(new Scanner(System.in));
//        x.x();
//        Method[] m=x.getClass().getMethods();
//        for (Method s:m){
//            System.out.println(s.getName().equals("x"));
//        }
//    }
//}
public class main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(11  ));
    }
    public static boolean isPalindrome(int number){
        int rev=0,temp;
        if(number<0){
            temp = number;
            rev = 0;
            while(temp !=0){
                rev = (rev*10)+(temp%10);
                temp = temp/10;
            }
        }else{
            number = number*(-1);
            temp = number;
            rev =0;
            while(temp !=0){
                rev = (rev*10)+(temp%10);
                temp = temp/10;
            }
        }
        if(rev == number){
            return true;
        }
        return false;
    }
}