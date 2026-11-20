void main() {
    int[] arr = {3, 8, 12, 5, 9, 2, 7};

    System.out.print("Original: ");
    for(int x : arr){
        System.out.print(x+" ");
    }

    System.out.print("\nReversed: ");
    for(int i=arr.length-1 ; i>=0 ; i--){
        System.out.print(arr[i]+" ");
    }
}
