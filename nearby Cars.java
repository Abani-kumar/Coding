import java.util.*;
public class Heap {
    static class point implements Comparable<point> {
        int x;
        int y;
        int distSq;
        int idx;
        public point(int x,int y,int distSq,int idx){
            this.x=x;
            this.y=y;
            this.distSq=distSq;
            this.idx=idx;
        }
        @Override
        public int compareTo(point p2){
            return this.distSq-p2.distSq;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{3,3},
                {5,-1},
                {-2,4}
        };
        int k=2;
        PriorityQueue<point>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            int distSq=(arr[i][0]*arr[i][0])+(arr[i][1]*arr[i][1]);
            pq.add(new point(arr[i][0],arr[i][1],distSq,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }
    }
}
