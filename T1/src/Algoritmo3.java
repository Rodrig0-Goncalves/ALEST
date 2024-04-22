public class Algoritmo3 {
    public static int f3(int n){
        int i, j, k, res = 0;
        int cont_op = 0;

        //Número de operações: (n^2)*(2*n)*(n+j) = (n^2)*2n*(n+2n) = (n^2)*(2n)*(2n^2) = 2n^3*2n^2 =2n^5 = n^5 = N^3 !!CONSTANTE NÃO IMPORTA!!
        for(i = 1; i<= n*n; i += 2){ //n^2 vezes
            for(j = i/2; j<= 2*i; j+= i/2+1){ // 2*i vezes
                for(k = j+1; k<= n+j; k += k/2+1){ //n+j vezes
                    res = res + Math.abs(j-1);
                    cont_op++;
                }
            }
        }
        System.out.println("Quantidade de operaçãoes para "+n+" voltas: ");
        return cont_op;
    }
   
}

