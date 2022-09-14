public class Main {
    public static void main(String[] args) {
        //vetor
        int [] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
//vetor String
        String[] letras = new String[6];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "K";
        letras[4] = "L";
        letras[5] = "z";
        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }
//vetor String sem definir quantidade
        String[] letras1 = {"A","B","G","L","P","F"};
        for (int j = 0; j < letras1.length; j++){
            System.out.println(letras1[j]);
        }

    }
}