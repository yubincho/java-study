package supercoding.fourthweek.디자인패턴.빌더;

public class BuilderTest {

    public static void main(String[] args) {

        User user1 = new User("John", "Doe", 30, "johndo@example.com");
        System.out.println(user1);

        User user2 = new User.UserBuilder()
                .firstName("Kim").lastName("Doe").age(35).email("kim@example.com").build();

        System.out.println(user2);




    }
}
