public class linearserch {
   public static int linearserch (int numbers[],int key) {
    for(int i=0; i<numbers.length;i++ ){
        if(numbers[i]==key){
            return i;

        }
    }
       return -1;
   }
    
    public static void main (String args[]){
        int marks[]={2,4,6,8,10,12,14,16};
        int key=30;
        int index = linearserch(marks, key);
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index : "+linearserch(marks, key));
        }


    }
}