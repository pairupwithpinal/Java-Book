public class SchoolGrade {

    public String grade(int i) {
         if (i >= 90) {
            return "A Wonderful!";
        } else if (i >= 70) {
            return "B Good work";
        } else if (i >= 50) {
            return "C Nice";
        } else if (i >= 40) {
            return "D ok";
        } else if (i >= 0) {
            return "Try Again";
        }
        else return
            "Invalid";
    }
}
