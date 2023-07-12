import java.util.Scanner;

public class ReverseTheRange {
    public static int[] reverse(int []array, int size, int start, int stop){
        int temp=0;
        while(start<stop){
            temp=array[start];
            array[start]=array[stop];
            array[stop]=temp;
            start++;
            stop--;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println("Enter the Start Range");
        int start=scanner.nextInt();
        System.out.println("Enter the End Range");
        int stop=scanner.nextInt();
        reverse(array,size,start,stop);
        System.out.println("The reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
