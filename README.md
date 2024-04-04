# ALEST
Treino e prática de ALEST
- "n" representa a quantidade de voltas que a linha de código irá fazer, o "cont" serve para contar quantas vezes os linhas do loop vão ser executadas;
- "N" conta o for da função;

19.03
- Complexidade Constante: Algoritmo sempre ocupa a mesma quantidade de recursos;
- Complexidade Linear: Consome recursos de forma proporcional ao tamanho do problema;
- Complexidade Logaritimica: Sempre será a metade de n, começando em zero e crescendo lentamente;
- Complexidade Polinomial: Quadrática (n^2), cúbica (n^3), n^k;

21.03
-  Estrutura elementar: Array 
    - Guardar várias variáveis do mesmo tipo;
    - Controlado por índices;
    - Acesso índividual;
    - Alocação contigua;
    - Remover índice inicial (0) de um array custa mais (n operações, descolamento com for), no final, melhor (1 operação);

- Array imutável, criar novo array com o dobro de capacidade e cópia todos os valores do velho;

02.04
- Assim que o programa é carregado ele vai para a RAM, alocando as variáveis contantes;
- big O: apresenta a variação feita no pior caso (não sendo pior que isso), curva mais acima;
- Alocação contigua X Alocação dinâmica;

04.04
- Nodo: são conectadas por encadeamentos (link);
    - métodos genéricos para serem usados por outras classes - ideia de herança mas não a mesma coisa;
    - elements: elemento genérico (tipos objetos); 
    - next: representa o próximo nodo no encadeamento da lista;
    - Primeiro nodo representa um 'head', último elemento representa a 'tail';
    - Sem 'tail', aplicar elemento ao final da lista tem custo de n operações;
    - Ponteiros (head e tail) sempre atualizados quando elemento foi removido ou adicionado;
- NUNCA SEPARAR ELEMENTOS, NODO SOME;
- next para apontar para o próximo elemento, primeiro insere o novo nodo e depois aloca o next anterior (inserir no meio);
