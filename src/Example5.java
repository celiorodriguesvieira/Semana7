public class Example5 {
    static int calculate(int x, int y){
       return y / x;
    }

    public static void main(String[] args) {
        try {
            int result = calculate(2, 10);
            System.out.println(result);

            String x = null;
            System.out.println(x.length());
        }catch (ArithmeticException e){
            System.out.println("Division by zero!");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("End programing");
    }
}
