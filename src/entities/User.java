package entities;

public class User {

    private String name;
    private int age;

    private User() {
    }

    private User setName(String name) {
        this.name = name;
        return this;
    }

    private User setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static User createUser(String name, int age) {
        return new User()
                .setName(name)
                .setAge(age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
