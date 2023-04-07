public class LetterCasePermutation {
    public static void main(String[] args) {
        String ip="a1B2";
        String op= "";
        findPermutation(ip, op);
    }
    static void findPermutation(String ip,String op){
        //base case
        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        //check if its digit, then only create one output and do recursive call on that 
        if(Character.isDigit(ip.charAt(0))){
         op=op+ip.charAt(0);
         ip=ip.substring(1);
        findPermutation(ip, op);
        }
        //if its alphabet then there will be 2 calls (2 choices)
        else{
            String op1=op;
            String op2=op;
            op1=op+Character.toLowerCase(ip.charAt(0));
            op2=op+Character.toUpperCase(ip.charAt(0));
            ip=ip.substring(1);
            findPermutation(ip, op1);
            findPermutation(ip, op2);
        }
    }
}
