public class operacoes{

    public static int f1(int n){
        int r=0;
        for (int i=1; i<n; i++){ // loop de n voltas
            r = r + 1; //Contador para entender comportamento do loop
        }
       
        return r;
    }

    public static int f2(int n){
        int cont2=0;
        for (int i=1; i<n; i++){ // loop de n voltas
            for (int j=1; j<n; j++){ // loop de n voltas
                cont2++;   //Contador para entender comportamento do loop
            }
        }
        return cont2;
    }

    public static int f3(int n){
        int r = 0, cont3 = 0;
        for (int i=1; i<n; i++){ // loop de n voltas
            for (int j=i+1; j<n; j++){ // loop de n voltas
                r = r + 2;
                cont3++; //Cont3ador para entender comportamento do loop
            }
        }
        return r + cont3;

    }

    public static int f4(int n4){
        int r = 0, cont = 0;
        for (int i=1; i<n4; i++){ // loop de n voltas
            for (int j=i; j<i+3; j++){ // loop de n voltas
                for (int k=j; k<j+2; k++){ // loop de n voltas
                    r = r + 1;
                    cont++; //Contador para entender comportamento do loop
                }
            }
        }
        
        return r + cont;
    }

    public static int f5(int n){
        int r=0, cont = 0;
        for (int i=1; i<n; i++){ // loop de n voltas
            for (int j=1; j<n; j++){ // loop de n voltas
                for (int k=1; k<n; k++){ // loop de n voltas
                    r = r + 1;
                    cont++; //Contador para entender comportamento do loop
                }
            }
        }
        return r + cont;
    }

    public static int f6(int n){
        int r=0, cont = 0;
        for (int i=1; i<n; i=i+i){ // loop de n voltas
          r = r + 1;
          cont++; //Contador para entender comportamento do loop
         }

        return r + cont;
    }
     
}
