import java.util.Stack;

public class Sort {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(5);
        st.push(1);
        st.push(0);
        st.push(2);
        sortStack(st);
        System.out.println(st);
    }

    public static void sortStack(Stack<Integer> st){
        if(st.size()==1){
            return;
        }
        int temp=st.pop();
        sortStack(st);
        insert(st,temp);
    }

    public static void insert(Stack<Integer> st,int temp){
        if(st.isEmpty() || st.peek()>=temp){
            st.push(temp);
            return;
        }
        int temp2=st.pop();
        insert(st,temp);
        st.push(temp2);

    }

}
