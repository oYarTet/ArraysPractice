import java.util.Scanner;
void main() {
    int[] arr = new int[5];
    int pos=0, neg=0;
    double avg=0;
    Scanner scan = new Scanner(System.in);
    System.out.println("\tEnter Scores: ");
    for(int i=0 ; i<arr.length ; ){
        System.out.print("Score #"+(i+1)+": ");
        arr[i]=scan.nextInt();
        if(arr[i]>=0 && arr[i]<=100){
            avg+=arr[i];
            if(arr[i]<60)neg++;
            else pos++;
            i++;
            continue;
        }
        System.out.println("Invalid score, enter again");
    }
    avg/=arr.length;
    System.out.print("Scores: ");
    for(int x : arr){
        System.out.print(x+" ");
    }
    System.out.println("\nPassed: "+pos);
    System.out.println("Failed: "+neg);
    System.out.println("Average: "+avg);



}
