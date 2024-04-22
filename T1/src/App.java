public class App {
    public static void main(String[] args) throws Exception {
        int n;

    //Executando algoritmo 1
    for( n=1; n<=10; n++){
        System.out.println(Algoritmo1.f1(n));
    }
    
    //Executando algoritmo 2
    for(n=1; n<=10; n++){
        System.out.println(Algoritmo2.f2(n));
    }
        
    //Executando algoritmo 3
     for(n=1; n<=10; n++){
        System.out.println(Algoritmo3.f3(n));
    }
    
    //Executando algoritmo 4
    for(n=1; n<=10; n++){
        System.out.println(Algoritmo4.f4(n));
     }
    
    //Executando algoritmo 5    
    for(n=1; n<=10; n++){
        System.out.println(Algoritmo5.f5(n));
     }
     
    }

}
