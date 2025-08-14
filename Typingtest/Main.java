import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int choice=1;
        Scanner scan = new Scanner(System.in);
        do{
            Test.start();
            System.out.println("Do you want to take the test again(yes=1/No=0):");
            choice = scan.nextInt();
        }while(choice==1);
        scan.close();
    }
}