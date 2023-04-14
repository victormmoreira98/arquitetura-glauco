public class asciiName {
    public static void main(String args[]){

        char[][] letraV = criarLetraV();
        char[][] letraI = criarLetraI();
        char[][] letraC = criarLetraC();
        char[][] letraT = criarLetraT();
        char[][] letraO = criarLetraO();
        char[][] letraR = criarLetraR();

        escrever(letraV);
        escrever(letraI);
        escrever(letraC);
        escrever(letraT);
        escrever(letraO);
        escrever(letraR);
    }

    public static char[][] criarLetraV(){
        char[][] letraV = {
                {'V', ' ', ' ', ' ', 'V'},
                {'V', ' ', ' ', ' ', 'V'},
                {'V', ' ', ' ', ' ', 'V'},
                {' ', 'V', ' ', 'V', ' '},
                {' ', ' ', 'V', ' ', ' '}
        };
        return letraV;
    }

    public static char[][] criarLetraI(){
        char[][] letraI = {
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '}
        };
        return letraI;
    }

    public static char[][] criarLetraC(){
        char[][] letraC = {
                {' ', ' ', 'C', 'C', 'C'},
                {' ', 'C', ' ', ' ', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {' ', 'C', ' ', ' ', ' '},
                {' ', ' ', 'C', 'C', 'C'}
        };
        return letraC;
    }

    public static char[][] criarLetraT(){
        char[][] letraT = {
                {'T', 'T', 'T', 'T', 'T'},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '}
        };
        return letraT;
    }

    public static char[][] criarLetraO(){
        char[][] letraO = {
                {' ', 'O', 'O', 'O', ' '},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {' ', 'O', 'O', 'O', ' '}
        };
        return letraO;
    }

    public static char[][] criarLetraR(){
        char[][] letraR = {
                {'R', 'R', 'R', ' ', ' '},
                {'R', ' ', 'R', ' ', ' '},
                {'R', 'R', 'R', ' ', ' '},
                {'R', 'R', ' ', 'R', ' '},
                {'R', ' ', ' ', 'R', ' '}
        };
        return letraR;
    }

    public static void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
    }
}