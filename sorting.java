

// BUBBLE SORT
// simplest sorting algorithm- repeatedly swapping of adjacent elements until they are not in the intended order.


import java.util.*;

class sorting{
    public static void bubbleSort(int arr[]){
for(int i =0;i<arr.length-1;i++){
    for(int j =0; j<arr.length-1-i;j++){
        // if we are taking ath element at the back then we have to leave last a elements in iteration
    if(arr[j]>arr[j+1]){
        int temp = arr[j];

        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
}
}

    }
    public static void main (String args[]){
        int arr[]= {7,8,3,1,2};
        bubbleSort(arr);
        for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i]);

    }
}
}

// time complexity - O(n^2)