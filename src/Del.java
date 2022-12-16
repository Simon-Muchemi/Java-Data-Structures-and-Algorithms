public class Del {

    public static void main (String [] args)
    {
        int[] arr = new int[5];
        int index=4, n=5;
        System.out.println("Before Delete");
        for(int i=0;i<5;i++){
            arr[i]=i+1;
            System.out.print(arr[i] + "\t");}
        //deleting at index=4
        if(index>n-1)
            System.out.println("Print not possible");
        for(int j=index;j<n;j++)
            arr[j-1]=arr[j];
        n--;
        System.out.println();
        System.out.println("After Delete");
        for(int i=0;i<n;i++){
            arr[i]=i+1;
            System.out.print(arr[i] + "\t");}
    }

}
