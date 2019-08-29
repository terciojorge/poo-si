import java.util.Scanner;
public class Principal {
	
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int opcao = 3;
    	int vetor[] = {1,2,3,4,5};
    	System.out.println("Print com for normal");
    	for(int i=0;i<vetor.length;i++) {
    		if(vetor[i]%2==0)
    			continue;
    		System.out.println(vetor[i]);
    	}
    	System.out.println("Soma é "+soma(2,3));
    	/*System.out.println("Print com o for enhanced");
    	for(int x: vetor) {
    		System.out.println(x);
    	}*/
    	
    	
	}
    public static int soma(int a, int b) {
    	return a+b;
    }

}
