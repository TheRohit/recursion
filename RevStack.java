import java.util.Stack;
public class RevStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
         st.push(1);
         st.push(2);
         st.push(3);
         st.push(4);
        if(st.size()==0){
            return;
        }
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1){ //base condition
            return;
        }
        int temp=st.pop();

        reverse(st); //hypothesis
        insert(st,temp); //induction
        return;
    }
    //another function to insert
    public static void insert(Stack<Integer> st , int temp){
        if(st.size()==0){ //base condition
            st.push(temp);
            return;
        }
        int temp2=st.pop(); 
        insert(st,temp); //hypothesis
        st.push(temp2); //induction
        return;

    }
}
