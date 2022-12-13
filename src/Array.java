public class Array {
    private int[] items;
    private int count;
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
    public void print(){
        for(int i=0; i<count;i++) {
            System.out.println(items[i]);
        }
    }
    public void check(){
        System.out.println(count);
    }

    public void removeAt(int index){
        // We need to validate the index
        if (index<0 || index>=count){
            throw new IllegalArgumentException();
        }
        // We also need to shift items to the left of the hole(space left after removing the item)
        for (int i=index; i<count;i++)
            items[i]=items[i+1];

        count--;
    }
}
