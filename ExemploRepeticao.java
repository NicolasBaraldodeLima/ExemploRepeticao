public class ExemploRepeticao {

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {

            System.out.println("O valor de i é " + i);
            
        }


        int j = 0;
        do {
            System.out.println("O valor de J é " + j);
            j++;

        } while (j < 10);


        int[] L = {10,20,30,40,50,60,70,80,90,100};

        for  (int result: L) {
            System.out.println("O valor de L é " + result);
        }

    }
}
