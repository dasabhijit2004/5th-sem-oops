public class ass1_GCD {

    // function to calculate gcd of 2 numbers    
    static int gcd(int m, int n){
        int g = 0;
        int t;
        if(m > n){
            t = n;
        }
        else{
            t = m;
        }
        for(int i = 1; i<=t; i++){
            if(m % i == 0 && n % i == 0){
                g = i;
            }
        }
        return g;
    }

    // function to validate the data
    static int setData(String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        if(setData(args[0]) == 0 || setData(args[1]) == 0){
            System.out.println("Error");
        }
        else{
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            int gcd = gcd(m, n);
            System.out.println("GCD = "+gcd);
        }
    }
}
