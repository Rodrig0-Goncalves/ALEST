public class Algoritmo2 {
    public static int f2(int n){
        int i, j, k, res = 0;
        int cont_op= 0;

        //Número de operações: n^3 !!CONSTANTE NÃO IMPORTA!!
        for(i = n; i<=n; i+= i/2+1){ //n veze
            for(j = i/2; j<= i*i; j+= i+1){ //n^2 vezes
                for(k = n; k<=2*n; k +=i+1){ //n*2 vezes
                    res = res +n;
                    cont_op++;
                }
            }
        }
        System.out.println("Quantidade de operaçãoes para "+n+" voltas: ");
        return cont_op;
    }
}

