public class F5 {
    public static int f5(int n) {
        int r = 0; 
        for(int i = 0; i<n; i++){ 
            for(int j = i; j<i+3; j++){ 
                for(int k = i; k<j; k++){ 
                    r = r+1;
                }
            }
        }
        return r;
    }
}
