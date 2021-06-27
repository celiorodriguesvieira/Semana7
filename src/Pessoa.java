public class Pessoa {
    private int age;

    public void setAge(int age) {
        assert (age < 80);

        if (age <= 0 || age >= 120 ){
            throw new IllegalArgumentException("Idade Inválida: " + age);

        }
        this.age = age;
    }
}

