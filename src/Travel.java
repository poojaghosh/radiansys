import java.util.*;
public class Travel{
    
    private int seatId;
    private int tclassId;
    
    public Travel(int seatId,int tclassId){
        this.seatId = seatId;
        this.tclassId = tclassId;
    }
    
    public int getId(){
        return seatId;
    }
    
    public int getClassId(){
        return tclassId;
    }
    
    public static int getSumOfEven(Map<Integer,Travel> map){
        int sum=0;
        Set<Integer> set = new HashSet<Integer>();
        set = map.keySet();
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            Travel t = map.get(itr.next());
            if(t.seatId%2==0){
                if(t.tclassId==001)
                  sum+=1500;
                else if(t.tclassId==002)
                  sum+=2500;
                else
                  sum+=3500;
            }
        }
        return sum;
    }
}

