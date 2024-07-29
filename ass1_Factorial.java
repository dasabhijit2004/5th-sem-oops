public class ass1_Factorial {

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

    // function to check if the data given as input is a positive integer or not
    static int setData(String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)<'0' || s.charAt(i)>'9'){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        if(setData(args[0]) == 0){
            System.out.println("Error");
        }
        else{
            int num = Integer.parseInt(args[0]);
            int fact = fact(num);
            System.out.println("Factorial = "+fact);
        }
    }
}