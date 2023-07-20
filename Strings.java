// import java.util.Arrays;
// // import java.util.Scanner;

// public class Strings {
    
//    static int leftmost(String s){
//     int res =Integer.MAX_VALUE;
//  int[] arr = new int[127];
//     Arrays.fill(arr,-1);

//     for(int i =0; i<s.length(); i++){
//         if(s.charAt(i)==-1){
//         arr[s.charAt(i)]=i;
//         }
//         else{
//             arr[s.charAt(i)]=Math.min(res,arr[s.charAt(i)]);


//         }
//     }
// return(res==Integer.MAX_VALUE ? -1: res);


//     }

//     public static void main(String[]args){
//         String s = "abbcc";
//         System.out.println(leftmost(s));
//     }


    
// }



import java.util.Arrays;

public class Strings {
    
    static int leftmost(String s) {
        int res = Integer.MAX_VALUE;
        int[] arr = new int[128];
        Arrays.fill(arr, -1);

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] == -1) {
                arr[s.charAt(i)] = i;
            } else {
                res = Math.min(res, arr[s.charAt(i)]);
            }
        }

        return (res == Integer.MAX_VALUE ? -1 : res);
    }

    public static void main(String[] args) {
        String s = "ayzz";
        System.out.println(leftmost(s));
    }
}







