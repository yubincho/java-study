package homework2week_정답아님.second;

public class GeneralUser extends User implements CustomerRole {

    public GeneralUser(String username) {
        super(username);
    }

    @Override
    public void order() {
        System.out.println("유저(" + username + ")은 주문을 할 수 있습니다.");
    }

    @Override
    public void payment() {
        System.out.println("유저(" + username + ")은 결제를 할 수 있습니다.");
    }
}
