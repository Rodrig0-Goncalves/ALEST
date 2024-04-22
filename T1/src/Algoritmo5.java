public class Algoritmo5 {
    public static int f5(int n){
        int i, j, k, res = 0;
        int cont_op = 0;

        //Número de operações: n*(n*n)*((n*n)+2) = n*n^2*2n^2 = n^3 * 2n^2 = 2n^5 = n^5 = n^3 !!CONSTANTE NÃO IMPORTA!!
        for(i = n/2; i<= n; i += 3){ //n
            for(j = i; j<= i*i; j+=2){ // n*n
                for(k = i; k<= 2*j; k += 1){ //(n*n)*2
                    res = res + n+j;
                    cont_op++;
                }
            }
        }
        System.out.println("Quantidade de operaçãoes para "+n+" voltas: ");
        return cont_op;
   
    }
}