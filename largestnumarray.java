public class largestnumarray{
    public static void main(String[]args){
        int arr[]={10,20,30,50,40};
        int max=arr[0];
        int secondlargest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                secondlargest=arr[i];

            }
        }
        System.out.println("the largest number in the array is:"+max);
        System.err.println("the second largest number is:"+secondlargest);

        

    
        
    }
}