public class Example {
    static int calculate(int x, int y){
       return y / x;
    }

    public static void main(String[] args) {
        try {
            int result = calculate(50, 5000);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Division by zero!");
        }
        System.out.println("End programing");
    }
}
