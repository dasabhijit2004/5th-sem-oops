public class ass1_Fibonacci {
    static void fibo(int n){
        int n1 = 0, n2 = 1;
        int n3 = 0;
        System.out.print(n1+" "+n2+" ");
        for(int i = 2; i<n; i++){
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
        }
    }

    static int isValid(String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return -1;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        if(isValid(args[0]) == -1){
            System.out.println("Invalid");
        }
        else{
            int n = Integer.parseInt(args[0]);
            fibo(n);
        }
    }
}
