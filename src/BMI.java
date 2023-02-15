import java.util.Scanner;

public class BMI {

    public static void main(String[] args){
        Scanner getData = new Scanner(System.in);
        System.out.println("Enter weight in Kgs: ");
        float weight = getData.nextFloat();
        System.out.println("Enter height in metres: ");
        float height = getData.nextFloat();

        // BMI calculation
        float BMI = weight/ (height*height);
        System.out.println("BMI value: " + BMI);

        if (BMI < 16.0){
            System.out.println("Category: Severe thinness ");
            System.out.println("Comment: See a nutritionist immediately");
        }
        else if (BMI >= 16.0 && BMI <17.0) {
            System.out.println("Category: Moderate thinness ");
            System.out.println("Comment: increase food intake");
        }
        else if (BMI >= 17.0 && BMI <18.5) {
            System.out.println("Category: Mild thinness ");
            System.out.println("Comment: You are underweight");
        }
        else if (BMI >= 18.5 && BMI <25.0) {
            System.out.println("Category: normal");
            System.out.println("Comment: healthy weight");
        }
        else if (BMI >= 25.0 && BMI <30.0) {
            System.out.println("Category: overweight");
            System.out.println("Comment: Above ideal range");
        }
        else if (BMI >= 30.0 && BMI <35.0) {
            System.out.println("Category: Obese class I ");
            System.out.println("Comment: Hit the gym immediately");
        }
        else if (BMI >= 35.0 && BMI <40.0) {
            System.out.println("Category: Obese class II ");
            System.out.println("Comment: Gym and less intake of carbohydrates");
        }
        else if (BMI >= 40.0) {
            System.out.println("Category: Obese class II ");
            System.out.println("Comment: See a nutritionist immediately");
        }
    }
}
