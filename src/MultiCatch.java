/**
 * Created by igor on 30.05.16.
 */
public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] = {1,2,3,4};
        try {
            int result = a/b;
            vals[10] = 21;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception" + e);
        }
        System.out.printf("After repeated interception");
    }
}
