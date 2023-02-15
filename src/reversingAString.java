public class reversingAString {
    public static void main(String[] args) {
        String myString = "Batman is a hero";
        System.out.println(myString.length());
        System.out.println(myString.charAt(2));

        for (int i = myString.length()-1; i >=0; i-- ){
            System.out.print(myString.charAt(i));
        }
    }
}
