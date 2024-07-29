public class ass1_Series {
    // function for factorial calculation
    static int fact(int n){
        int fact = 1;
        if(n == 0){
            return 1;
        }
        else{
            for(int i = 1; i<=n; i++){
                fact = fact * i;
            }
        }
        return fact;
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
        if(isValid(args[0]) == -1 || isValid(args[1]) == -1){
            System.out.println("Invalid");
        }
        else{
            int x = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            int sum = 0;
            for(int i = 2; i<n; i+=2){
                sum += Math.pow(x, i) / fact(i);
            }
            System.out.println(sum);
        }
    }
}
