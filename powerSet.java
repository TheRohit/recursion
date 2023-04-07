public class powerSet {
    //main function 
    public static void main(String[] args) {
        String ip= "abc";
        String op=""; //initilize output as empty string
        subset(ip,op); 
    }

    static void subset(String ip, String op){
        //base case
        if(ip.length()==0){ //if the input is empty then return the op
            System.out.println(op);
            return;
        }

        String op1= op; // X not taking a (from abc)
        String op2= op + ip.charAt(0); // taking a (add a from abc)
        ip=ip.substring(1); //make input smaller (abc --> bc)
        //run recursive calls on both op
        subset(ip,op1); 
        subset(ip,op2);
        
    }
}

//                              subset("abc", "")
//                                   /     \
//               subset("bc", "")       subset("bc", "a")
//                  /     \                  /        \
//   subset("c", "")  subset("c", "b")  subset("c", "a")  subset("", "ab")
//          /      \        /       \        /      \           /     \
// subset("", "") subset("", "c")  subset("", "b") subset("", "ac") subset("", "a") subset("", "abc")
