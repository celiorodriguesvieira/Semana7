public class Exemple10 {

    private int age;

    public void setAge(int age) {
        if (age <= 0 || age >= 130){
            throw new IllegalArgumentException("Error. Age is not valid!" + age);
        }
    }

}
