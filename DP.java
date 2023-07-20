import java.util.Scanner;
import java.util.*;


// ****** NTH FIBONACCI NUMBER USING TOP DOWN DP


//  *** MEMORIZATION***** 
// TOP DOWN


// import java.util.Scanner;
// public class DP {
//     static int[]arr;
//     static int res;

//     public static void main(String []args){
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         arr = new int[n+1];
//         for(int i =0; i<=n; i++){
//             arr[i]=-1;

//         }
//         int ans= fun(n);
//         System.out.println(ans);
//     }


//    static int fun(int n){
//         // int res;
       
//         if(arr[n]==-1){
         
//             if(n<=1){
//                 res=n;
//             }
//             else{
//                 res= fun(n-1)+fun(n-2);
//             }

//         arr[n]=res;

//         }
            
//         // else{ 
//         //     return arr[n];
//         // }

//         return arr[n];

        

//     }
    
// }



// ***** TABULATION ******
// BOTTOM UP


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
























// MAX LENGTH OF COMMON SUBSEQUENCE STRING
// TOP DOWN

// here we start calculating from last charac
// make 2d array memo with -1 values.
// if memo[n][m]!= -1 ...it means we have already filled its value so return memo [n][m]
// if n or m =0 ..if any of the string's length is 0 it means no commom subseq so return 0
// else if last characters same ..recursive call for 1+(n-1,m-1)
// if not ...max of (resursive call for (n-1,m), (n,m-1)
// rweturn memo[n][m]
// mistake correction....String s2 = sc.nextLine();



// every entry is going to be filled exactly once
// The code initializes a 2D memoization array memo of size (n+1) x (m+1) (where n and m are the lengths of s1 and s2, respectively). This initialization takes O(n*m) time.



// import java.io.*;
// import java.util.*;
// // import static java.lang.System.system.system.out;

// class GFG {

//     static int[][] memo;

//     static int lcs(String s1, String s2, int n, int m) {
//         if(memo[n][m] != -1) {
//             return memo[n][m];
//         }
//         // constant time operation


//         if(n == 0 || m == 0) {
//             memo[n][m] = 0;
//         }
//         else {
//             if(s1.charAt(n-1) == s2.charAt(m-1)) {         // constant time.
//                 memo[n][m] = 1 + lcs(s1, s2, n-1, m-1);
//             }
           



//             else {
//                 memo[n][m] = Math.max(lcs(s1, s2, n-1, m), lcs(s1, s2, n, m-1));
//             }
//         }
        
//         return memo[n][m];
//     }


//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
// System.out.print("Enter first string: ");
//         String s1 = sc.nextLine();

//     System.out.print("Enter second string: ");
//         String s2 = sc.nextLine();

//         int n = s1.length();
//         int m = s2.length();
        
//         memo = new int[n+1][m+1];
        
//         // for(int[] i: memo) {
//         //     Arrays.fill(i, -1);
//         // }
//         // OR
//         for(int i =0; i<=m; i++){
//                         for(int j =0;j<=n;j++){
//                             memo[i][j]=-1;
//                         }
//                     }

//        System.out.println("Length of LCS is " + lcs(s1, s2, n, m));
//     }
// }





























//  LONGEST COMMON SUBSEQUENCE THROUGH TABULATION

// here we start calculating from first letter
// make 2d array -table[n+1][m+1]...because we have to give space for 0 values also
// fill first column and row with 0's
// start traversing from i =1, j=1...if character(i-1) and character at (j-1)-same then table [i][j]=1 +(i-1)(j-1)..
// if not ....table [i][j]=max(table(i-1)(j)), table(i)(j-1)
// return table [n][m]


// The code initializes a 2D table table of size (n+1) x (m+1) (where n and m are the lengths of s1 and s2, respectively). This initialization takes O(n * m) time.



// import java.util.*;
// class main{
//     static int n;
//     static int m;
//     static int [][]table;
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s1=sc.nextLine();
//         String s2=sc.nextLine();
//         n=s1.length();
//         m=s2.length();
//         table= new int[n+1][m+1];
//     //    
//         for(int i =0;i<n;i++){
//             table[i][0]=0;
//         }
//         for(int j =0;j<m;j++){
//             table[0][j]=0;

//         }
//         int ans =lis(s1,s2,n,m);
//         System.out.println(ans);
//     }
// static int lis(String s1,String s2,int n, int m){
//     int i;
//     int j;
//     for(i =1;i<=n;i++){
//         for( j =1;j<=m;j++){
//             if(s1.charAt(i-1)==s2.charAt(j-1)){
//                 table[i][j]=1+table[i-1][j-1];
//             }
//             else{
//                 table[i][j]= Math.max(table[i-1][j],table[i][j-1]);

//             }
//     }
   

// }
// return table[n][m];
// return (m-table[n][m]);


// }
// }

























// ****LONGEST INCREASING SUBSEQUENCE****** 

// make a dp array
// iterate i ..for every i, max =0....
// iterate j till smaller than i ...if dp[j]>max , max =dp[j];
// dp[i]= max +1
// at last  iterate dp array and find maximum



// due to the nested loops, the time complexity of the code is quadratic, or O(n^2), where n is the size of the input array.



// public class DP{
//     static int n;
//     static int []dp;
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//          n=sc.nextInt();
//         int []arr = new int [n];
//         for(int i =0; i<n;i++){
//             arr[i]=sc.nextInt();
            
//         }
//        dp = new int [arr.length];
//        for(int i =0; i<n; i++){
//         dp[i]=-1;
//        }

//         System.out.println(lis(arr));
        
//     }

//     static int lis(int[]arr){
//         for (int i =0; i<n;i++){
//             int max =0;
//             for(int j =0; j<i; j++){
//                 if(arr[j]<arr[i]){
//                     if(dp[j]>max){
//                         max=dp[j];
//                     }
//                 }
//             }
//             dp[i]=max+1;
//         }

//         int omax=0;
//         for(int i =0; i<n; i++){
//             if (omax<=dp[i]){
//                 omax=dp[i];
//             }
//         }

//         return omax;
//     }
// }




















// MAXIMUM DELETIONS TO MAKE AN ARRAY SORTED

// same as above just do n-omax


// public class DP{
//     static int n;
//     static int []dp;
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//          n=sc.nextInt();
//         int []arr = new int [n];
//         for(int i =0; i<n;i++){
//             arr[i]=sc.nextInt();
            
//         }
//        dp = new int [arr.length];
//        for(int i =0; i<n; i++){
//         dp[i]=-1;
//        }

//         System.out.println(lis(arr));
        
//     }

//     static int lis(int[]arr){
//         for (int i =0; i<n;i++){
//             int max =0;
//             for(int j =0; j<i; j++){
//                 if(arr[j]<arr[i]){
//                     if(dp[j]>max){
//                         max=dp[j];
//                     }
//                 }
//             }
//             dp[i]=max+1;
//         }

//         int omax=0;
//         for(int i =0; i<n; i++){
//             if (omax<=dp[i]){
//                 omax=dp[i];
//             }
//         }

//         return n-omax;
//     }
// }



















// Maximum SUM OF INCREASING SUBSEQUENCE


// iterate input array and put same values of index to msis array
// for every j which is smaller than i -find max of msis[i] and arr[i]+msis[j] and change of msis to this.
// at last ....iterate msis array and return maximum value


// due to the nested loops, the time complexity of the code O(n^2), where n is the size of the input array.





// public class DP{
//     static int[]arr;
//     static int []msis;
//     static int n;
//     public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//      n = sc.nextInt();

//     arr= new int[n];
//     for(int i =0; i<n; i++){
//         arr[i]= sc.nextInt();
//     }

//     msis=new int [n];
//     System.out.println(MSIS(arr));

// }
// static int MSIS(int[] arr){
//     for(int i =0; i<n; i++){
//         msis[i]=arr[i];
//         for(int j =0; j<n; j++){
//             if(arr[j]<arr[i]){
//                 msis[i]= Math.max(msis[i], arr[i]+msis[j]);
//             }
//         }
//     }
// int omax=0;
//     for(int i =0; i<n;i++){
//         if(msis[i]>omax){
//             omax= msis[i];
//         }


//     }
//     return omax;

// }


// }



















// *****  MAXIMUM LENGTH OF BITONIC SUBSEQUENCE  *****

// BITONIC SUBSEQUENCE- first incresing subseq then decresing subseq
// make 2 dp arrays ..1st array- will store the length of inc subseq till an element
// 2nd array- will store the length of dec subseq starting from that ele....
// (mistake i made- started traversing from begining and stored the length of dec subseq till that element)
// what to do-start traversing from backwards
// at last traverse both arrays together with single i and find max value of  dp1[i]+dp2[i]-1

// time complexity is O(n^2), where n is the size of the input array.

// public class DP{
//         static int n;
//         static int []dp;
//         static int []dp1;
//         public static void main(String[]args){
//             Scanner sc = new Scanner(System.in);
//              n=sc.nextInt();
//             int []arr = new int [n];
//             for(int i =0; i<n;i++){
//                 arr[i]=sc.nextInt();
                
//             }
//            dp = new int [arr.length];
        
//            dp1 = new int [arr.length];
          
    
//             System.out.println(lis(arr));
            
//         }
    
//         static int lis(int[]arr){
//             for (int i =0; i<n;i++){
//                 int max =0;
//                 for(int j =0; j<i; j++){
//                     if(arr[j]<arr[i]){
//                         if(dp[j]>max){
//                             max=dp[j];
//                         }
//                     }
//                 }
//                 dp[i]=max+1;
//             }


//             for (int i =n-1; i>=0;i--){
//                 int max =0; 
//                 for(int j =n-1; j>i; j--){
//                     if(arr[i]>arr[j]){
//                         if(dp1[j]>max){
//                             max=dp1[j];
//                         }
//                     }
//                 }
//                 dp1[i]=max+1;
//             }


    
//             int omax=0;
//             for(int i =0; i<n; i++){
//                 if (omax<=dp[i]+dp1[i]-1){
//                     omax=dp[i]+dp1[i]-1;
//                 }
//             }
    
//             return omax;
//         }
//     }
    
    
    
    
    









// import java.util.*;
// // import static java.lang.System.system.system.out;

// class GFG {

//     static String[][] memo;

//     static String lcs(String s1, String s2, int n, int m) {
//         if(memo[n][m] != "") {
//             return memo[n][m];
//         }
//         // constant time operation


//         if(n == 0 || m == 0) {
//             memo[n][m] = "";
//         }
//         else {
//             if(s1.charAt(n-1) == s2.charAt(m-1)) {         // constant time.
//                 memo[n][m] = s1.charAt(n-1) + lcs(s1, s2, n-1, m-1);
//             }
           



//             else {
//                 String lcs1 = lcs(s1, s2, n - 1, m);
//                 String lcs2 = lcs(s1, s2, n, m - 1);
//                 memo[n][m] = lcs1.length() > lcs2.length() ? lcs1 : lcs2;
//             }
//         }
        
//         return memo[n][m];
//     }



//     public static void main (String[] args) {
//                 Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first string: ");
//                 String s1 = sc.nextLine();
        
//             System.out.print("Enter second string: ");
//                 String s2 = sc.nextLine();
        
//                 int n = s1.length();
//                 int m = s2.length();
                
//                 memo = new String[n+1][m+1];
                
                
//                 for(int i =0; i<=m; i++){
//                                 for(int j =0;j<=n;j++){
//                                     memo[i][j]=" ";
//                                 }
//                             }
        
//                System.out.println("Length of LCS is " + lcs(s1, s2, n, m));
//             }
//         }





















// import java.util.*;

// class GFG {

//     static String[][] memo;

//     static String lcs(String s1, String s2, int n, int m) {
//         if (!memo[n][m].equals("")) {
//             return memo[n][m];
//         }

//         if (n == 0 || m == 0) {
//             memo[n][m] = "";
//         } else {
//             if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
//                 memo[n][m] = s1.charAt(n - 1) + lcs(s1, s2, n - 1, m - 1);
//             } else {
//                 String lcs1 = lcs(s1, s2, n - 1, m);
//                 String lcs2 = lcs(s1, s2, n, m - 1);
//                 memo[n][m] = lcs1.length() > lcs2.length() ? lcs1 : lcs2;
//             }
//         }

//         return memo[n][m];
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first string: ");
//         String s1 = sc.nextLine();

//         System.out.print("Enter second string: ");
//         String s2 = sc.nextLine();

//         int n = s1.length();
//         int m = s2.length();

//         memo = new String[n + 1][m + 1];

//         for (int i = 0; i <= m; i++) {
//             for (int j = 0; j <= n; j++) {
//                 memo[j][i] = "";
//             }
//         }

//         System.out.println("LCS is " + lcs(s1, s2, n, m));
//     }
// }























import java.util.*;
class main{
    static int n;
    static int m;
    static String [][]table;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        n=s1.length();
        m=s2.length();
        table= new String[n+1][m+1];
    //    
        for(int i =0;i<n;i++){
            table[i][0]=" ";
        }
        for(int j =0;j<m;j++){
            table[0][j]=" ";

        }
        String ans =lis(s1,s2,n,m);
        System.out.println(ans);
    }
static String lis(String s1,String s2,int n, int m){
    int i;
    int j;
    for(i =1;i<=n;i++){
        for( j =1;j<=m;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                table[i][j]=s1.charAt(i-1)+table[i-1][j-1];
            }
            else{


                String lcs1 = table[i-1][j];
                              String lcs2 = table[i][j-1];
                           



                table[i][j]= lcs1.length() > lcs2.length() ? lcs1 : lcs2;

            }
    }
   

}
return table[n][m];



}
}

