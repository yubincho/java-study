package supercoding.fourthweek.직렬화역직렬;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String gender;
    private int age;
    private String country;
    private String occupation;

    public Person(String name) {
        this.name = name;
        this.gender = "unknown";
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.age = -1;
        this.country = "Korea";
        this.occupation = null;
    }

    public Person(String name, String gender, int age, String country, String occupation) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.occupation = occupation;
    }

    public void showMyself() {
        System.out.println("Person 인스턴스: name: %s, gender: %s, age: %d " + this.name + this.gender + this.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
