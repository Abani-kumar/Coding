import java.util.*;
public class Class {
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,500,200};
            //sorted in reverse order;

        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer>s=new ArrayList<>();
        int amount=109;
        int minNoOfcoins=0;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    minNoOfcoins++;
                    s.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }
        System.out.println(minNoOfcoins);
        for(int i=0;i<s.size();i++){
            System.out.print(s.get(i)+" ");
        }
        System.out.println();
    }
}
