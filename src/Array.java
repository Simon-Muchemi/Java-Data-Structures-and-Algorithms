public class Array {
    private int[] items;
    private static int count;
    public Array(int length){
        items= new int[length];
    }
    public void insert(int item){
        if (items.length==count){
            int[] new_Array = new int[items.length*2];
            for(int i=0; i<count;i++)
                new_Array[i]=items[i];
            items =new_Array;
        }
        items[count++]= item;
    }
    public void index_Of(int item){
        int flag=0;
        int theIndex=-1;
        for(int i = 0; i < count; i++){
            if (items[i] == item) {
                flag = 1;
                theIndex = i;
                break;
            }
            else
                flag=0;
        }
        if (flag==1){
            System.out.println(theIndex);
        }
        else
            System.out.println(theIndex);
    }

    public void print(){
        for(int i=0; i<count;i++) {
            System.out.print(items[i]+" ");
        }
        System.out.println();
    }
    public void check(){
        System.out.println(count);
    }

    public void removeAt(int index){
        if (index<0 || index>=count){
           throw new IllegalArgumentException();
        }
        for (int i=index; i<count;i++)
            items[i-1]=items[i];

        count--;
    }
}
