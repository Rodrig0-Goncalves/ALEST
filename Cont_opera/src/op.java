public class op {
    public static int op1(int n){
        int cont = 0;
        for(int a = 1; a<n; a++){ //2; 3
            for(int b = 1; b<n; b++){ // executa 2 vezes, executa 4 vezes
                System.out.println("test");
                cont++;
            }
        }
        return cont;
    }
    public static int op2(int n){
        int cont = 0;
        for(int a = 1; a<n; a++){
                System.out.println("test");
                cont++;
        }
        return cont;
    }


    public static void op3(){
        for(int a = 0; a<4; a++){
                System.out.println("i");
        }
    }

    public static int op4(int n){
        int l[] =  new int[10];
       
        l[0] = 1;
        l[1] = 2;
        l[2] = 3;
        l[3] = 4;
        l[4] = 5;
        l[5] = 6;
        l[6] = 7;
        l[7] = 8;
        l[8] = 9;
        l[9] = 10;
        

        int cont = 0;
        for(int a = 0; a<l.length; a++){
                System.out.println(l[0]);
                cont++;
            }
            return cont;
        }
    }

    
