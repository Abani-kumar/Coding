import java.util.*;
public class Class {
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsl[]=new int [arr.length];
        int nsr[]=new int[arr.length];
            // next smaller left
        Stack<Integer>s=new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //next smaller right
        s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //area of histogram
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currarea=arr[i]*width;
            maxArea=Math.max(currarea,maxArea);
        }
        System.out.println(maxArea);
    }
    public static void main(String args[]){
        int arr[]={2,4};
        maxArea(arr);
    }
}
