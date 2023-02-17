
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student {
    private final String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public Student(String name, int... marks) {//variable argument should be the last argument
        this.name = name;
        for(int mark: marks)
        this.marks.add(mark);
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum = sum + mark;
        }
        return sum;
    }
    public int getmaximumMark() {

        return Collections.max(marks);
    }

    public int getminimumMark() {

        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

    }
}

