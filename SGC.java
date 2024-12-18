import java.util.Scanner;
public class SGC{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("..........\t\t\tSTUDENT GRADE CALCULATOR ");
        int s=sc.nextInt();
        int total=0;
        System.out.println("Enter the marks obtained in "+s+"subjects respectively");
        for (int  i= 0;  i<s; i++) {
            int marks =sc.nextInt();
            total=total+marks;
        }
        
    
    //avgper =average percentage
    double avgper=(double)total/5;
    String Grade;
    if(avgper>=90){
        Grade ="A+";
    }
    else if(avgper>=80){
        Grade="A";
    }
    else if(avgper>=70){
        Grade="B";
    }
    else if(avgper>=60){
        Grade="C";
    }
    else if(avgper>=50){
        Grade="D";
    }
    else if(avgper>=40){
        Grade="E";
    }
    else{
        Grade="FAIL(F)";
    }
    System.out.println("Total Marks:"+total);
    System.out.println("Average percentage" +avgper);
    System.out.println("Grade is"+Grade);
}
}