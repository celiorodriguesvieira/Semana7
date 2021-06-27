public class Example7 {
    static int calculate(int x, int y){
       return y / x;
    }

    public static void main(String[] args) {
        try {
            int result = calculate(2, 10);
            if (result == 5)return;

            String x = null;
            System.out.println(x.length());
        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sempre Execultado!");
        }
        System.out.println("End of Program!");
    }
}
