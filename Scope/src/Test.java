import java.util.Scanner;

public class Test  {
    private int x;
    public Test(Scanner x){
        System.out.println("Please enter a number");
        this.x=x.nextInt();
    }
    public  void x(){
        for(int x=1;x<13;x++){

            System.out.println(x+ "times "+this.x+" equals "+x*this.x);
        }
    }
}
