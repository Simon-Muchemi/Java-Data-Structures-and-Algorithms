public class Main {
    public static void main(String[] args) {
        var linklist = new LinkedLists();
        linklist.addLast(20);
        linklist.addLast(30);
        linklist.addLast(40);
        linklist.addLast(50);
//        linklist.indexOf(20);
//        linklist.removeFirst();
        linklist.removeLast();
        System.out.println(linklist.contains(60));

        }
    }