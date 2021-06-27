public class Carrinho {
    private static int maximum = 10;
    private static int quantity = 0;
    private static int insert = 0;
    private static int remove = 0;
    private static double price_unutary = 10.0;

    static void insert() {
        assert (quantity < maximum);
        {
            quantity++;
            maximum++;
            assert (quantity == insert - remove); //invariante.
        } }

    public static void remove() {
        assert (quantity > 0);
        quantity--;
        remove++;
        assert (quantity >= 0);//pós consdição
        assert (quantity == insert - remove); //invariante
    }
}