//wap to sort array by using selection sort
public class selectionSort
{
public static void main(String[] args)
{
    int arr[]={59,28,19,38,98,3,93,83,71,62,99,1,5,8,29,39,98,81};
    System.out.println("Initial array is ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
  
    for(int i=0;i<arr.length-1;i++){
       
        int smallest =i;

        for(int j=i;j<arr.length-1;j++){
            
           if(arr[smallest]>arr[j+1]){
            smallest=j+1;
            }
        
        }
        //swap
        if(smallest!=i){
        int temp=arr[i];
        arr[i]=arr[smallest];
        arr[smallest]=temp;
        }
    }
    System.out.println("The sorted array is ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    

    
//System.out.print();
}
}
