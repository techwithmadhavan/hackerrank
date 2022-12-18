package javabasic;

public class RegularExpression {
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
    public static void main(String[] args) {
        String username = "Madhavan87";
        if(username.matches(regularExpression)){
            System.out.println(true);
        }
    }
}
