import exceptions.IllegalAgeArgumentException;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws IllegalAgeArgumentException{
        if (age < 16) {
            throw new IllegalAgeArgumentException("It is wrong age. Age must be >= 16");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
