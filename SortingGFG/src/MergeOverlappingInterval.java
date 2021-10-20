import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeOverlappingInterval {
    public static void main(String[] args) {
        /**
         * 1,3 2,4 5,7 6,8
         * 7,9 6,10 4,5 1,3 2,4
         */
        Pair[] pairs = {new Pair(1,3),new Pair(2,4), new Pair(5,7), new Pair(6,8)};
        Pair[] pairs1 = {new Pair(7,9),new Pair(6,10), new Pair(4,5), new Pair(1,3), new Pair(2,4)};
        MergeOverlappingInterval interval = new MergeOverlappingInterval();

        interval.sortUsingMergeSort(pairs,0, pairs.length-1);
        interval.mergeIntervals(pairs);

        Arrays.sort(pairs1, Comparator.comparingInt(pair -> pair.start));
        Stream.of(pairs1).forEach(System.out::print);
        System.out.println();
        interval.mergeIntervals(pairs1);
    }

    private void mergeIntervals(Pair[] pairs){
        int res = 0;
        for(int i=1; i< pairs.length; i++){
            if(pairs[res].end>=pairs[i].start){
                pairs[res].start = Math.min(pairs[res].start, pairs[i].start);
                pairs[res].end = Math.max(pairs[res].end, pairs[i].end);
            }else{
                res++;
                pairs[res] = pairs[i];
            }
        }
        for(int i=0; i<=res; i++){
            System.out.print(pairs[i]);
        }
        System.out.println();
    }

    private void sortUsingMergeSort(Pair[] pairs,int l, int r){
        if(l<r){
            int m = l + (r-l)/2;
            sortUsingMergeSort(pairs,l,m);
            sortUsingMergeSort(pairs,m+1,r);
            merge(pairs,l,m,r);
        }
    }

    private void merge(Pair[] pairs, int l, int m, int r) {
        int n1 = m - l + 1; int n2 = r - m;
        Pair[] left = new Pair[n1], right = new Pair[n2];
        for(int i=0; i<n1; i++)
            left[i] = pairs[l+i];
        for(int i=0; i<n2; i++)
            right[i] = pairs[m+1+i];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i].start<right[i].start)
                pairs[k++] = left[i++];
            else
                pairs[k++] = right[j++];
        }

        while(i<n1)
            pairs[k++] = left[i++];
        while(j<n2)
            pairs[k++] = right[j++];
    }

    static class Pair{
        int start, end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}
