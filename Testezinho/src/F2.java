public class F2 {
    public static int f2(int n){
        int r = 0,  op = 0;
        for(int i = 0; i<n; i++){
          for(int j = i+1; j<n; j++){
               r = r +2; 
               op = op +1;  
          }
        }  
     return op; 
  }
}
