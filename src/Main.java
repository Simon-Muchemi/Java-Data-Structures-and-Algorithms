public class Main {
    public static void main(String[] args) {
        Array array = new Array(5);
        array.insert(5);
        array.insert(4);
        array.insert(3);
        array.insert(2);
        array.insert(1);

        //array.print();
        array.check();
        array.removeAt(0);
        }
}