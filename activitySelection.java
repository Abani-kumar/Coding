import java.util.*;
public class Greedy {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //For sorting on end time basis
        int Activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            Activities[i][0]=i;
            Activities[i][1]=start[i];
            Activities[i][2]=end[i];
        }
        //lambda function->short form
        Arrays.sort(Activities,Comparator.comparingDouble(o->o[2]));
        int maxAct=0;
        ArrayList<Integer>s=new ArrayList<>();
        maxAct=1;
        s.add(Activities[0][0]);
        int lastEnd=Activities[0][2];
        for(int i=1;i<start.length;i++){
            if(Activities[i][1]>=lastEnd){//non overlapping condition
               maxAct++;
                s.add(Activities[i][0]);
                lastEnd=Activities[i][2];
            }
        }
        System.out.println(maxAct);
        for(int i=0;i<s.size();i++){
            System.out.print("A"+s.get(i)+" ");
        }
        System.out.println();
    }
}
