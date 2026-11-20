void main() {
    int[] arr = {10, 20, 30, 40, 50, 60};
    double average=0;
    int n=0;
    for (double x : arr){
        average+=x;
    }
    average/=arr.length;

    System.out.print("Array: ");
    for(double x : arr){
        System.out.print(x+" ");
        if (x>average)n++;
    }
    System.out.println("\nAverage: "+average);
    System.out.println("Numbers above average: "+n);
}
