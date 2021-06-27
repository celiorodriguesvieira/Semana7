public class Example2 {
    static void calculate(int x, int y){
        if(x <= 0){
            System.out.println("[Err!] Division by zero!");
        }else {
            int result = y / x;
            System.out.println(result);
        }

    }

    public static void main(String[] args) {
        calculate(-1, 50);
    }
}
