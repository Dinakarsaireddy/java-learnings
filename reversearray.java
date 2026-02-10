public class reversearray{
    public static void main(String[]args){
        int arr[]={10,20,30,40,50};
        int start=0;
        int end=arr.length-1;
        int temp=0;
        for(int num=0;num<arr.length-1;num++){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;



            start++;
            end--;

            

        }
        
        System.out.println("The reverse of the given array is:");
         for (int num : arr) {
            System.out.print(num + " ");
         }

        
    }
}