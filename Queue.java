class myStack{
    int arr[];
    int top;
    int cap;

myStack(int C){
    top=-1;
    cap= C;
     arr= new int[cap];
     
}

void push(int x){
    if(top==cap-1){
        // System.out.println("error");
    }
    top++;
    arr[top]= x;

}

void pop(){

    // why cant we write top
    if(top==-1){
        System.out.println("error");
    }
    // int res= arr[top];
    top--;
    // return res;

}

boolean isEmpty(){
   return(top==-1);
}

int size(){
    return(top+1);
}


public static void main( String args[]){
    myStack s = new myStack(5);
    s.push(10);
    s.push(20);
    System.out.println(s.pop());




}
}