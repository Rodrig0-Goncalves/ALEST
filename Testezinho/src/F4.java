public class F4 {
    public static int f4(int n) {
       int r = 0; 
        for(int i = 1; i<n; i++){
            for(int j = i; j<2*i; j++){
                for(int k = i; k<j; k++){
                    r = r + 1;
                }
            }
        }
        return r;
    }
}
