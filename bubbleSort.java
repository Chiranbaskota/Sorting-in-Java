//wap to sort elements of array using bubble sort
public class bubbleSort
{
public static void main(String[] args)
{
    int arr[]={98,23,48,83,22,19,8,3,39,10};
    int temp;
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
            }
        }
    }
    System.out.println("The sorted elements in array are ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    

    
//System.out.print();
}
}
