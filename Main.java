import java.util.*;

public class Main {
public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,6,7,4,6,4));
    sorting(arr);
    System.out.println(arr);
}

public static void sorting(ArrayList<Integer> arr){
    if(arr.size()==1){
        return;
    }
    int temp1=arr.get(arr.size()-1);
    arr.remove(arr.size()-1);
    sorting(arr); // hypothesis (make input smaller)
    insert(arr,temp1); //induction (main logic)
}

public static void insert(ArrayList<Integer> arr , int temp1){

    if(arr.size()==0 || arr.get(arr.size()-1)<=temp1){
        arr.add(temp1);
        return;
    }
    int temp2=arr.get(arr.size()-1);
    arr.remove(arr.size()-1);
    insert(arr,temp1); // hypothesis
    arr.add(temp2); // induction

}
}