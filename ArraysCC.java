import java.util.*;
public class ArraysCC {

public static void main(String args[]){
    int marks []= new int[100];

    Scanner sc=new Scanner(System.in );
     
       marks[0]=sc.nextInt();//phy
       marks[1]=sc.nextInt();//chem
       marks[2]=sc.nextInt();//maths

       System.out.println("phy:"+marks[0]);
       System.out.println("chem:"+marks[1]);
       System.out.println("maths:"+marks[2]);
       

     //upsdate marks[2]
     marks[2]=100;

     System.out.println("maths:"+marks[2]);

    // count 1 extra missing marks maths
     
     marks[2]=marks[2]+1;

     System.out.println("maths:"+marks[2]);
      
    // PERCENTAGE OF MARKS[0] MARKS[1]AND MARKS[2]
    
     int percentage=(marks[0]+marks[1]+marks[2])/3;
     System.out.println("percentage:"+percentage+ "%");


    

}
    
}
