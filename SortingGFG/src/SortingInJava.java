import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortingInJava {
    public static void main(String[] args) {
        //sorting of primitive => Dual Pivot Quick Sort
        int[] arr = {5,1,7,8,2,3,4,6};
        char[] chars = {'b','x','a'};
        Arrays.sort(arr);
        Arrays.sort(chars);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(chars));

        //sorting of userdefined or object => merge sort adaption of timSort
        Point[] points = {new Point(10,20), new Point(3,12),new Point(5,7)};
        Arrays.sort(points);
        for (Point point : points) System.out.println(point);

        Arrays.sort(points, Collections.reverseOrder());
        Arrays.sort(points,new MyCmp());
        Stream.of(points).forEach(System.out::println);

        //Examples of stable sort : BubbleSort, InsertionSort, MergeSort

        //Example of unstable sort : selection sort, quick sort, heap sort
    }

    private static class Point implements Comparable<Point>{

        int x,y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            return this.x - o.x;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    private static class MyCmp implements Comparator<Point>{
        @Override
        public int compare(Point o1, Point o2) {
            return o1.x - o2.x;
        }
    }
}
