public class F1{
    public static int f1(int n) {
        int r = 0, op = 0;
        for (int i = 1; i < n; i++) {
            r = r + 1;
            op = op + 1;
        }
        return op;
    }

    
}