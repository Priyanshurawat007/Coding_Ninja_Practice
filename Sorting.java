import java.util.Scanner;

public class Sorting {

    public static void SelectionSort1(int n,int arr[]){
        for(int i=0;i<n-2;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }
            int temp=0;
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void BubbleSort(int n, int arr[]) {
        int DidSwap=0;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) { 
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    DidSwap=1;
                }
            }
            if(DidSwap==0){
                break;
        }
    }
        System.out.println("The sorted array using Bubble Sort is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void InsertionSort(int n, int arr[]){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println("The sorted array using Bubble Sort is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    


    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number of elements:");
    int n=sc.nextInt();
    int  arr[]=new int[n];
    System.out.println("Enter the Elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    SelectionSort1(n, arr); //Calling the Selection Function
    BubbleSort(n, arr); // Calling the Bubble Function
    InsertionSort(n, arr); //Calling the Insertion Function
    sc.close();

    }
}


