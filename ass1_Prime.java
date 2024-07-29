public class ass1_Prime {

    static int prime(int n){
        for(int i = 2; i<n; i++){
            if(n % i == 0){
                return 0;
            }
        }    
        return 1;    
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
            for(int i = 2; i<=n; i++){
                if(prime(i) == 1){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
