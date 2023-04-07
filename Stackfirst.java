import java.util.Stack;
public class Stackfirst {
    public static void main(String[] args) {
        int k=3;
        Stack<Integer> st = new Stack<Integer>(); 
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        if(st.size()==0){
            return;
        }
        solve(st,k);
        System.out.println(st);

    }

    public static void solve(Stack<Integer> st,int k){
        if(k==1){ //base condition
            st.pop();
            return;

        }
        int temp=st.pop(); 
        solve(st,k-1); //hypothesis
        st.push(temp); //induction
        return;


    }
}
