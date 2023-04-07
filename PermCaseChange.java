public class PermCaseChange {
    public static void main(String[] args) {
        String ip= "ab";
        String op="";
        perm(ip,op);
    }
    static void perm(String ip,String op){
        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        String op1=op + ip.charAt(0); //make it as it it (lowercase)
        String op2=op+Character.toUpperCase(ip.charAt(0));// uppercase

        ip=ip.substring(1);
        perm(ip,op1);
        perm(ip,op2);
      
    }
}
