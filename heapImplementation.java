import java.util.*;
public class Heap {
    static ArrayList<Integer>s=new ArrayList<>();
    public static boolean isEmpty(){
        return s.size()==0;
    }
    public static void add(int data){
        s.add(data);//add at last
        int x=s.size()-1;//child index
        int par=(x-1)/2;//parent index

        while(s.get(x)<s.get(par)){
            int temp=s.get(x);
            s.set(x,s.get(par));
            s.set(par,temp);

            x=par;
            par=(x-1)/2;
        }
    }
    public static int peek(){

        return s.get(0);
    }
    public static int remove(){

        int data=s.get(0);
        //swap 1st and last node
        int temp=s.get(0);
        s.set(0,s.get(s.size()-1));
        s.set(s.size()-1,temp);

        //remove last index
        s.remove(s.size()-1);

        //fix my heap
        heapify(0);
        return data;
    }
    private static void heapify(int i){
        int minIdx=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<s.size() && s.get(minIdx)>s.get(left)){
            minIdx=left;
        }
        if(right<s.size() && s.get(minIdx)>s.get(right)){
            minIdx=right;
        }

        if(minIdx!=i){
            int temp=s.get(i);
            s.set(i,s.get(minIdx));
            s.set(minIdx,temp);

            heapify(minIdx);
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(1);
        h.add(5);
        h.add(4);
        h.add(2);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
