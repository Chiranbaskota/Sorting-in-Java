//wap to sort array using insertion sort
public class insertionSort
{
public static void main(String[] args)
{
    int arr[]={5,1,39,98,12,38,83,92,11,33,22,66,55};
    int hold;
    for(int i=1;i<arr.length;i++){
        hold=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>hold){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=hold;

    }
    System.out.println("The sorted list of array is ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
//System.out.print();
}
}
