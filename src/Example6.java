public class Example6 {
    static int calculate(int x, int y){
       return y / x;
    }

    public static void main(String[] args) {
        try {
            int result = calculate(2, 50);
            System.out.println(result);

            String x = null;
            System.out.println(x.length());
        }catch (ArithmeticException | NullPointerException e){
            System.out.println("Division by zero!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("End of Program!");
    }
}
