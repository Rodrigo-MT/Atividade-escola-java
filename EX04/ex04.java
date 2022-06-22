public class ex04 {
    public static void main(String[] args) {
        long par=1;
        int somaimpar = 0;
        int n1;

        for (n1 = 0; n1 <= 30; n1++) {
            if (n1 % 2 == 1) {
                somaimpar+=n1;                
                } else {
                    if (n1>0)
                    par*=n1;
                }
            }
    System.out.println("Soma dos números ímpares é: " + somaimpar);      
    System.out.println("Multiplicação dos pares é: " + par);
        }
}