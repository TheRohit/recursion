import java.util.*;
public class uniqueSubsets {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<>();
        String ip= "aab";
        String op="";
        subset(ip,op,set);
        set.forEach(System.out::println);
    }
    static HashSet<String> subset(String ip, String op,HashSet<String> set){
        //base case
        if(ip.length()==0){
            set.add(op);
            return new HashSet<>(); //return hashset
        }
        String op1=op;
        String op2=op+ip.charAt(0);
        ip=ip.substring(1);
        subset(ip,op1,set);
        subset(ip,op2,set);

        return set;
    }
}
