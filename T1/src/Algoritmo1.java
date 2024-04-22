public class Algoritmo1{
    public static int f1(int n){
    int i, j, k, res = 0;
    int cont_op = 0;
    
    //Número de operações: n*n*(n*2) = n^2*2n = 2n^3 = n^3
    for(i = 1; i<=n*n; i+=1){ //n vezes
        for(j = 1; j<= i; j+=2){ //n vezes
            for(k = n+1; k<=2*i; k += i*j){  //n*2 vezes
                res = res + k+1;
                cont_op++;
            }
        }   
    }
    System.out.println("Quantidade de operaçãoes para "+n+" voltas: ");
    return cont_op;
}
}