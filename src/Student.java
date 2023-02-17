
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

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
        int maximum = 0;//95,98,10// int maximum = Integer.MIN_VALUE;
        for (int mark : marks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }
        return maximum;
    }

    public int getminimumMark() {
        int minimum = 0;//int minimum = Integer.MAX_VALUE;
        for (int mark : marks) {
            if (mark < minimum) {
                minimum = mark;
            }
        }
        return minimum;
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

    }
}

