public class permutationSpace {
    public static void main(String[] args) {
        String ip= "ABC";
        String op=""; //initilize output as empty string
        op=ip.charAt(0) + ""; // the op already has A
        ip=ip.substring(1); // reduce the ip by 1
        subset(ip,op); 
        //i.e subset(BC,A)
        //we performed the first step of recursive tree in main itself

    }

    static void subset(String ip, String op){
        //base case
        if(ip.length()==0){ //if the input is empty then return the op
            System.out.println(op);
            return;
        }

        String op1= op +ip.charAt(0) ; // without space i.e AB
        String op2= op +"_"+ip.charAt(0); // adding with space A_B
        ip=ip.substring(1); //make input smaller (bc --> c)
        //run recursive calls on both op
        subset(ip,op1); 
        subset(ip,op2);
        
    }
}
