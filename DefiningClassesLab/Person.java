package DefiningClassesLab;

public class Person {


    private String name;
    private String birthDay;
    private int age;


    public Person(String name, String birthDay, int age) {
        this.name = name;
        this.birthDay = birthDay;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return 1234;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        return "test";

    }
}

