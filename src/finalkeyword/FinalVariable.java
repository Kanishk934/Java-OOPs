package final_keyword;

public class FinalVariable {

    public static void main(String[] args) {

        final int SPEED_LIMIT = 100;

        System.out.println("Speed Limit: " + SPEED_LIMIT);

        // SPEED_LIMIT = 120;  // Error: cannot reassign a final variable
    }
}