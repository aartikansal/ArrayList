import java.math.BigDecimal;

public class StudentRunner {
    public static void main (String[] args) {



        int[] marks = {95, 98,100};
        Student student = new Student("Aarti", marks);
        int number = student.getNumberOfMarks();
        System.out.println("number of marks: " + number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("sum of marks: " + sum);
        int maximumMark = student.getmaximumMark();
        System.out.println("maximum mark: " + maximumMark);
        int minimumMark = student.getminimumMark();
        System.out.println("minimum mark: " + minimumMark);
        BigDecimal average = student.getAverageMarks();
        System.out.println("average mark: " + average);
        System.out.println(student);
        student.addNewMark(35);
        System.out.println(student);
        student.removeMarkAtIndex(1);
        System.out.println(student);
    }
}