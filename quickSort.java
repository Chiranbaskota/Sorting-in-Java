//Wap to sort the array elements using quick sort.
public class quickSort
{
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void quickSo(int arr[],int first,int last){
          int i,j,pivot;
          if(first>=last){
             return;
          }
          i=first;
          j=last;
          pivot=arr[first];
          do{
               while(arr[i]<=pivot&&i<last){
                i++;
               }
               while(arr[j]>pivot&&j>first){
                j--;
               }
               if(i<j){
                swap(arr,i,j);
               }
               else{
                break;
               }
          }while(first<last); //also can write while(true)
           swap(arr,first,j);
           quickSo(arr,first,j-1);
           quickSo(arr,j+1,last);
    }
public static void main(String[] args)
{
    int arr[]={2,5,9,1,3,8,4,7,6,-1,};
    int n=arr.length-1;
    quickSo(arr,0,n);
    System.out.println("The sorted elements in array are ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

//System.out.print();
}
}
