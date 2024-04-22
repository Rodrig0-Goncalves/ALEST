public class Algoritmo4 {
    public static int f4(int n){
        int i, j, k, res = 0;
        int cont_op = 0;

        //Número de operações: (n*n)*(n+1)*(n+1+1) = n^2*n*n = n^4 = n^3 !!CONSTANTE NÃO IMPORTA!!
        for(i = 1; i<= n*n; i += 2){ //n*n
            for(j = 2; j<= n+1; j+=i+1){ //n+1
                for(k = j/2; k<= i+1; k += j/2+1){ //n+1
                    res = res + j+1;
                    cont_op++;
                }
            }
        }
        System.out.println("Quantidade de operaçãoes para "+n+" voltas: ");
        return cont_op;
   
    }
}
