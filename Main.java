import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of seats");
		Travel t = null;
        Map<Integer,Travel> map = new HashMap<Integer,Travel>();
        int id,cid,n = Integer.parseInt(buf.readLine());
        for(int i=0;i<n;i++){
            System.out.println("Enter seat id "+(i+1));
            id = Integer.parseInt(buf.readLine());
            System.out.println("Enter travel class id "+(i+1));
            cid = Integer.parseInt(buf.readLine());
            t = new Travel(id,cid);
            map.put(id,t);
        }
        System.out.println("Total Seat Price Amount: "+t.getSumOfEven(map));
    }
}