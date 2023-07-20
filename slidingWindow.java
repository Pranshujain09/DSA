// public class slidingWindow {
// public static int max(int arr[], int n , int k){
//     int sum = 0;
//     for(int i= 0; i<n-k+1; i ++ ){
//         for(int j=0;j<k; j++){
//             sum+= arr[i];

//         }
//     }
//     return sum;

// }

// public static void main (String args[]){

//     int arr[] = { 1,2,1,0,2};
//         int k = 3;
//         int n = arr.length;
//         System.out.println(max(arr, n, k));


// }  
// }





// class Solution {
//     public int SubarrayProductLessThanK(int[] array, int k) {
//         int start=0;
//         int end =0;
//         int product=1;
//         int ans=0;
//         while(end<array.length){
//             product=array[end]*product;
//             while(start<=end && product>=k){
//                 product=product/array[start];
//                 start++;
                
//             }
//             ans+=end-start+1;
//             end++;
//         }
//         return ans;
//     }
// }


// class abc{
//     public static int fun(int[]arr, int k  ){
//         if(arr.length ==0 || k<=0 || k>=arr.length){
//             return -1;
//         }

//         int sum = 0;
//         for(i=0 ; i<k ; i ++){
//             sum = sum + arr[i];
//         }

//         int max_sum = sum;
//         int start = 0;

//         for(int j = k; j<arr.length; j++){
//             sum = sum + arr[j] - arr[i];
//             if(sum >max_sum){
//                 max_sum = sum ;

//             }
//         }
//         return max_sum;
//     }
//     public static void main(String args[]){
//         int arr[] = { 1,2,1,0,2};
        
//         System.out.println(fun(arr,3));
//     }
// }


// class NumArray{
//     public Num
// }