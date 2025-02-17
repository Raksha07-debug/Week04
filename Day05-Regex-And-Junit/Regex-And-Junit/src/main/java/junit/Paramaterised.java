package junit;

public class Paramaterised {
    public static  boolean isEven( int number)
    {
        if(number%2==0) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] testNumbers = {2, 4, 6, 7, 9};
        for (int num : testNumbers) {
            System.out.println("Is " + num + " even? " + isEven(num));
        }

    }
}
