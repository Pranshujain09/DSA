// import java.util.Scanner;

// public class questions2{
// public static void main (String []args){

// Scanner sc = new Scanner(System.in);
// String s1 = sc.next();
// String ans = Reverse(s1);
// System.out.println(ans);

// }

// static String Reverse(String s1){
//     StringBuilder sb = new StringBuilder(s1);
//     sb.reverse();
//     return sb.toString();


// }
// }x


import java.util.Arrays;
import java.util.Scanner;
public class questions2{


    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
      
int n= sc.nextInt();
     int[]arr = new int[n];
     for(int i =0; i<n;i++){
       arr[i]= sc.nextInt();
    }
        int ans = secondLargest(arr);
        System.out.println(ans);

    }

    static int secondLargest(int []arr){
        Arrays.sort(arr);
        
  
        return arr[arr.length-2];
        

    }
}





