// class test{
//      public void fun1(){
       
//         System.out.println("hey");
//         fun1();
//     }
// }


// public class Recursion{



//     public static void main(String args[]){
//        test test1 = new test();
//        test1.fun1();


//     }
// }



//  **** OR *****

// class test{
//     static void fun1(){
//        // static is used so that we can assign a property to the whole class
       
//        System.out.println("hey");
//        fun1();
//    }


//    public static void main(String args[]){
//     //   test test1 = new test();
//     //   test1.fun1();
//     fun1();

    
//    }
// }



// errors-
// c++ -segmentation falut
// java - stackover flow 
//  ****** HOW TO FIX THESE ERRORS *****

// class test{
//     static void fun1(int n){
//         if(n==0)
//         return;
//         System.out.println("hey");
//         fun1(n-1);

//     }

//     public static void main(String args[]){
//         fun1(2);
//     }
// }


// TYPICAL STRUCTURE OF RECURSIVE FN

// fun(){
//     base cases

//     recursive call(i.e, call to fun())
//     with atleast one change in parameters
// }


// ****** RECURSION EXERCISE 1 ******

// class test1{
//     static void fun(int n)
//     {
//         if(n==0)
//         return;
//         System.out.println(n);
//         fun(n-1);
//         System.out.println(n);
//     } 

// public static void main(String args[]){
//     fun(3);

// }
// }
// output-
// 3
// 2
// 1 after this f(0) comes in the stack but it returns so deleted
// 1  fun(1) comes into execution from the stack ...fun(n-1);was already executed so we move to next line
// 2 fun(2) comes into execution
// 3

  




// ****RECURSION EX2*******



// class test2{
//     static void fun1(int n)
//     {
//         if(n==0)
//         return;
//         fun1(n-1);
//         System.out.println(n);
//         fun1(n-1);
//     }
//     public static void main(String[]args){
//         fun1(3);
//     }

// }
// explanation:
// f(3)
    // |___f(2)
    // |     |__f(1)
    // |     |     |__f(0)
    // |     |     |__1
    // |     |     |__f(0)
    // |     |__2
    // |       |__f(1)
    // |          |__ f(0)
    // |          |__f(1)
    // |          |__f(0)
    // |___3
    // |___f(2)
    //      |__f(1)
    //      |   |__f(0)
    //      |   |__1
    //      |   |__f(0)
    //      |__2
    //      |__f(1)
    //           |__ f(0)
    //           |__f(1)
    //           |__f(0)

                

// RECURSION EXERCISE 2
// class test3{


// static int fun2(int n){
//     if(n==1)
//     return 0;
//     else 
//     return (1+fun2(n/2));
// }
// public static void main(String args[]){
//     System.out.println(  fun2(16));
// }
// }

// output is 4
// 
// dividing a number by 2 until it becomes 1 ..ans is always log to the base 2 N
// log2 =1
// log 4= 2
// log 8= 3

// dividing a number by 3 until it becomes 1 ..ans is always log to the base 3 N



// *****DECIMAL TO BINARY ****

// class test4{
//     public void fun3(int n){
//         if( n==0)
//         return;
//         else{
//             fun3(n/2);
//             System.out.print(n%2);

//         }
//     }
// }

//     public class Recursion{
//         public static void main(String args[]){
//             test4 test41 = new test4();
//             // System.out.println(fun3(4));
//             test41.fun3(4);
//         }
//     }



    // PRINT N TO 1 USING RECURSION


// class test5{
//     public void fun4(int n){
//         if (n==0)
//         return;
//         else
//         System.out.println(n);
//         fun4(n-1);
//     }
// }
// public class Recursion{
//      public static void main(String args[]) {
//         test5 test51= new test5();
//         test51.fun4(5);


        
//     }
// }


// PRINT 1 TO N USING RECURSION


// class test5{

//     public void fun4(int n){
//         if(n==0)
//         return;
//         else
//         fun4(n-1);
//         System.out.println(n);
        
// }
// }
// public class Recursion{
//      public static void main(String args[]) {
//         test5 test51= new test5();
//         test51.fun4(5);   
//     }
// }

// WORK DONE- THETA (N)



// *****TAIL RECURSION*****

// class test6{
//     static void fun5(int n){
//         if (n==0)
//         return;
//         else
//         System.out.println(n);
//         fun5(n-1);
//     }
//     public static void main(String args[]){
//         fun5(5);
//     }
// }

// here when fun(1)is called again after fun(0), it has nothing to do 
// similar thing happens when fun(2).....fun(5) is called so this is a tail resursion
// when the last thinfg which happens in a function is recursion call and nothing happens after that it is called a tail recursive func.
// modern compilers do tail call elimination to optimize the code
// n= n-1
// goto start;
// this comes in place of fun(n-1) and before if(n==0) comes this:
// start:
// tail recursive code takes less time



// NON TAIL RECURSIVE CODE
// EX1

// class test7{
//     static void fun6(int n){
//         if(n==0)
//         return;
//         else
//         fun6(n-1);
//         System.out.println(n);

//     }
//     public static void main(String args[]){
//         fun6(5);
//     }
// }


// how to convert above code in tail recursive code



// class test7{
//     int k=1;
//     static void fun6(int n, int k){
//         if(n==0)
//         return;
//         else
//         System.out.println(k);
//         fun6(n-1,k+1);
//         // System.out.println(n);

//     }
//     public static void main(String args[]){
//         fun6(5,1);
//     }
// }




// *******  FACTORIAL  *******


// class test8{

//    static int fact(int n){
//         if (n==0 || n==1){
//             return 1;
//         }
//         return n*fact(n-1);
//     }
//     public static void main(String args[]){
//         // fact(3, 1);
//         System.out.println(fact(3));
//     }
// }


// how to convert above code in tail recursive code


// class test8{
//     int k=1;
//    static int fact(int n, int k){
//         if (n==0 || n==1){
//             return k;
//         }
//         return fact(n-1,n*k);
//     }
//     public static void main(String args[]){
//         // fact(3, 1);
//         System.out.println(fact(3,1));
//     }
// }


// FACTORIAL N

// class test{
//     static int fun(int n){
//         if(n==0)
//         return 1;
//         return n*(fun(n-1));


//     }
//     public static void main(String args[]){
//         System.out.println(fun(3)); 
//     }
// }


// FIBONACCI NUMBER

// class test{
//     static int fun(int n){
//         // int k=0;

//         if(n<=1)
//         return n;
//         // if(n==0)
//         // return 0;

//         // if(n==1)
//         // return 1;
//         return fun(n-1)+fun(n-2);

//     }
//     public static void main(String args[]){
//         System.out.println(fun(3));
//     }
// }

import java.util.Scanner;
class Test{
  

    static int fun(int n){
       
       
        if(n<=1){
            return n;
        }

        else{
            return(fun(n-1)+fun(n-2));
        }
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
   int n= sc.nextInt();
   int fib= fun(n);
   System.out.println(fib);

    }

}


// import java.util.Scanner;

// class Test {
//     static int fibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         } else {
//             return fibonacci(n - 1) + fibonacci(n - 2);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int nthFibonacciNumber = fibonacci(n);
//         System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacciNumber);
//     }
// }









// SUM OF FIRST N NATURAL NUMBERS 


// class test{
//     static int fun(int n){
//         if(n== 1)
//         return n;
//         return n+ fun(n-1);
//     }
//     public static void main(String args[]){
//         System.out.println(fun(4));
//     }

//     // time complexity=> T = T(n-1)+ theta(1) +> theta(n)
//     // Aux space= theta(n)
// }

// class test1{
    
    
//     static boolean isPalindrome(String str, int start, int end){

 

//  if (start>= end){
//     return true;
    
//  }
//  else{
//     return (str.charAt(start)== str.charAt(end))&&
//    (isPalindrome( str,  start+1, end-1));

//  }
// }

//     public static void main(String args[]){
//         // String abba;
//         System.out.println(isPalindrome( "abba", 0, 3));
//     }
//     }


    // class test2{
    // // static int x=0;
    //  public static int fun(int n){
    //     if (n<=0)
    //     return 0;
    //     else{
          
    //         //  x= x+ n%10;
    //     // return x;
    //   return fun(n/10) + n%10;
    // //    return x;

    //     }


    //    }
    //    public static void main(String args[]){
    //     System.out.println(fun(123));
    //    }
    // }


    // CLIMBING STAIRS QUESTION?

    // class Solution {
    //     public  static int climbStairs(int n) {
    //         int curr,prev1=1,prev2=1;
    //         for(int i=1;i<n;i++){
    //             // There are 2 ways to reach this step; take 1 step from previous or 2 steps from 2 steps below
    //             curr=prev1+prev2;
    //             prev2=prev1;
    //             prev1=curr;
    //         }
    //         return prev1;
    //     }

    //     public static void main(String args[]){
    //         System.out.println(climbStairs(3));
    //     }
    // }

//     You are climbing a stair case. It takes n steps to reach to the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


// MAZE PATH
// m*n
// retina 
// find the word




// static ArrayList<String> powerSet(String s)
//     {
//         String sub=" ";
//         ArrayList<String> res=new ArrayList<String>();
//         curr(s,0,sub,res);
//         Collections.sort(res);
//         res.add(0, " ");
//         return res;
//     }
    
//     public static void curr(String s, int i, String b, ArrayList<String> arr)
//     {
//         if(i<s.length())
//         {
            
//             String l=b;
//             String r=b+s.charAt(i);
            
//             arr.add(l);
            
//             curr(s,i+1,l,arr);
//             arr.remove(l);
//             arr.add(r);
//             curr(s,i+1,r,arr);
//         }
//         return;
       
//     }