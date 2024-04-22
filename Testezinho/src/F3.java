public class F3 {
    
    public static int f3(int n){
        int cont = 0;
         for(int i = 1; i<n; i++){
            for(int j = 1; j<n; j++){
                System.out.println(j*n); 
                cont++;
            }
        }
        return cont;
    }
}
