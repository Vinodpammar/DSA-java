import java.util.*;

public class ArraysFargument {
    public static void upadate(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;

        }

    }
    public static void main (String args[]){
        int marks[]={99,98,99};
        upadate(marks);
      for(int i=0; i<marks.length; i++){
        System.out.println(marks[i]+"");

      }
      System.out.println();
    }
    
}
