public class XPowN{
    public static double pow(double x, int n){
        switch (n) {
            case 0 -> {
                return 1;
            }
            case 1 -> {
                return x;
            }
            case -1 -> {
                return 1/x;
            }
            default -> {
                if (n % 2 == 0){
                    double half_pow = pow(x, n/2);
                    return half_pow*half_pow;
                }else{
                    double half_pow = pow(x, (n-1)/2);
                    return half_pow*half_pow*x;
                }
            }
        }
        // or just use Math.pow(x, n);
    }
    public static void main(String[] args) {
        double x = 2;
        int n = -2;
        System.out.println(pow(x, n)); // 0.25
    }
}