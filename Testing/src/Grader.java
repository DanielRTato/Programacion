public class Grader {

    public char dermineLEttterGrade(int score){
        if(score >= 90){
            return 'A';
        } else if(score >= 80){
            return 'B';
        } else if(score >= 70){
            return 'C';
        } else if(score >= 60){
            return 'D';
        }else if (score <0){
            throw new IllegalArgumentException("Score must be between 0 and 100");
        } else {
            return 'F';
        }
    }
}
