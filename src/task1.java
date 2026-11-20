void main() {
    int[] arr = {6,-7,1,9,0,-32,5,-2,0,1};
    int pos=0 , neg=0 , zer=0;
    for(int x : arr){
        if (x>0){
            pos++;
            continue;
        }
        if(x<0){
            neg++;
            continue;
        }
        zer++;
    }
    System.out.print("Array: ");
    for(int x : arr){
        System.out.print(x+" ");
    }
    System.out.println("\nPositive: "+pos);
    System.out.println("Negative: "+neg);
    System.out.println("Zero: "+zer);
}
