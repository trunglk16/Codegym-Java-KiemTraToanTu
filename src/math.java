import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Width: ");
        width = input.nextFloat();
        System.out.println("Enter height: ");
        height = input.nextFloat();

        float area;
        area  = width * height;
        System.out.println("Area = " + area);


    }
}
