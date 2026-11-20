void main() {
    int[] arr = {12 , 5 , 28 , 3 , 19 , 7 , 15 , 9};
    int mx=0 , mn=0;
    for(int i=0 ; i< arr.length ; i++){
        if(arr[i]>arr[mx])mx=i;
        if(arr[i]<arr[mn])mn=i;
    }
    System.out.print("Array: ");
    for(int x : arr){
        System.out.print(x+" ");
    }
    System.out.println("\nLargest: "+arr[mx]+" at index "+mx);
    System.out.println("Smallest: "+arr[mn]+" at index "+mn);
}
