
//  import java.util.Arrays;


// An array is a collection of items of same data type stored at 
// contiguous memory locations. This makes it easier to calculate the
//  position of each element by simply adding an offset to a base 
//  value, i.e., the memory location of the first element of the
//   array (generally denoted by the name of the array).






// import java.util.ArrayList;
// class arrays{
//   public static ArrayList<Integer> fun1(){
//      ArrayList<Integer>marks = new ArrayList<Integer>(2);
//     marks.add(5);
//     marks.add(6);
//     marks.add(6);
//     marks.add(6);
//     return marks;
    
//     }
//     public static void main(String[]args){
//        System.out.println(fun1());

//     }
// }

// import java.util.ArrayList;
// class arrays{
//     public static ArrayList<Integer> fun1(){
//         ArrayList<Integer>marks = new ArrayList<Integer>(4);
//         marks.add(5);
//         marks.add(6);
//         return marks;
//     }
//     public static void main(String[]args){
//         System.out.println(fun1());
//     }
// }

    
//     public static void main(String args[]){
       
    
//         System.out.println(fun1());
//     }
// }


// ***** LINEAR SEARCH ******
//  class array{

//     public static int fun(int arr[], int n, int x ){
//         for(int i=0; i<n; i++){
        
//             if(arr[i]==x){
//                 System.out.println(i);
//             }
            
            
//         }
    
//         return -1;
//     }
//         public static void main(String args[]){
//             int arr[]= {12,23,34,33};
//             int x=23;
//             fun( new int[] {12,23,34,33},3,34);
//         }

//     }


    // new int[] {12,23,34}

// **** INSERT OPERATION ****


// class array{
//     int insert(int arr[], int pos, int x,int n, ){
        
//         }
//        int idx= pos-1;


//         for(int i=n-1; i>=idx; i--){


//         }
//     }
// }


// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt(); // number of test cases
//         int n;
//         long x;
//         long y;
//         // int[] arr;
//         while (t>0) {
//              n = sc.nextInt(); // size of array

//              int[] arr = new int[n]; // array of integers

//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//              x = sc.nextLong(); // x value
//              y = sc.nextLong(); // y value
            
//             t--;
        
        
            
//             int count = 0; // counter for magical pairs
//             for (int j = 1; j <= n; j++) {
//                 for (int i = 1; i <= j; i++) {
//                     int ans =0;
//                     for( int a =0;a<n;a++){
//                         // ans=arr[i]*10 +arr[j];
                    
//                     long num = Long.parseLong(String.valueOf(arr[i]) + String.valueOf(arr[j]));
//                     }
//                     if (ans <= y && ans >= x) {
//                         count++;
//                     }
//                 }
//             }
//             System.out.println(count);
//         }
//     }
//     }





    //  ***** fibonacci number ******


// import java.util.Scanner;

// class array{
//     public static void main(String[]args){
//     Scanner sc= new Scanner(System.in);
//     int n = sc.nextInt();
//     int[]arr = new int[n+1];
//     int a =2;
//     arr[0]=0;
//     arr[1]=1;
//     while(a<=n){
//         arr[a]=arr[a-1]+arr[a-2];
//         a++;
        
//     }
//     System.out.println(arr[n]);
//     }


// }



// import java.util.Scanner;

// class array{
//     public static void main(String[]args){
//     Scanner sc= new Scanner(System.in);
//     int n = sc.nextInt();
//     int x= sc.
//     int[]arr = new int[n+1];
//     int a =2;
//     arr[0]=0;
//     arr[1]=1;
//     while(a<=n){
//         arr[a]=arr[a-1]+arr[a-2];
//         a++;
        
//     }
//     System.out.println(arr[n]);
//     }
// }



import java.util.Arrays;

class Array{
    // public arr[];
    public static int fun(arr[], int n, int x){
    for(int i =0; i<n;i++){
        if(arr[i]==x){
            return x;

  }

    }


}
public static void main( String args[]){
    arr[]={1,2,3};
    int x =2;
    fun(arr[],2,2);
}
}