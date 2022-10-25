package lab6.line;

import java.util.ArrayList;

public class TestLineSub {
    public static void main(String[] args) {
        Point begin = new Point(2,2);
        Point end = new Point(1,2);
        LineSub line = new LineSub(begin, end);
        System.out.println(line);
    }
}
