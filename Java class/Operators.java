public class Operators {

    public static void main(String[] args) {

        int ifStatementBoss = 3;
        int valueA = 10;
        int valueB = 20;
        int examScore = 54;
        String studentInitial = "b";

        if (examScore >= 70 && studentInitial == "A") {
            System.out.println("Passed with distinction");

        } else if (examScore < 70 && studentInitial == "b") {
            System.out.println("Fail negga ");
        } else {
            System.out.println("condition is else");

        }
        switch (examScore) {
            case 60:
                System.out.println("case 60");
                break;
            case 70:
                System.out.println("case 70");
                break;
            default:
                System.out.println("Chop breakfast");
                break;
        }
    }
}
