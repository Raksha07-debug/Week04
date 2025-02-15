package multiplecatch;

import java.util.Scanner;

public class MultipleCatchExample {
    public  static  void  getValueAtIndex(int [] arr,int index){
        try{
            System.out.println("value at index "+index+": "+arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index");
        }
        catch(NullPointerException e)
        {
            System.out.println("Array is not intialised");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int[] number={2,5,4,8,3};
            System.out.println("enter index to retreive value");
            int index=sc.nextInt();
            getValueAtIndex(number,index);

        }
        catch (Exception e)
        {
            System.out.println("Invalid input ! please enter a valid index ");
        }
    }
}
