public class Marks {
    public static void main(String[] args) {
        int maths=10;
        int sci=5;
        int english=8;
        int history=8;
        int geography=9;

        int tot_marks= (maths+sci+english+history+geography);

        int marks_percent=(tot_marks/5);

        System.out.println("total marks are : " + tot_marks );
        System.out.println("total percent are : " + marks_percent );

        if (marks_percent>90 ) {
            System.out.println("Grade A");
        }else if(tot_marks>70 && tot_marks<=90){
            System.out.println("Grade B");
        }
        else if (tot_marks<=70 && tot_marks>50) {
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
