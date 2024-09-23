package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 		
		double sp = 67836.43;
	    double rj = 36678.66;
	    double mg = 29229.88;
	    double es = 27165.48;
	    double outros = 19849.53;

	    double total = sp + rj + mg + es + outros;

	        System.out.printf("Faturamento total: R$%.2f\n", total);
	        System.out.printf("SP: R$%.2f - Porcentagem: %.2f%%\n", sp, (sp / total) * 100);
	        System.out.printf("RJ: R$%.2f - Porcentagem: %.2f%%\n", rj, (rj / total) * 100);
	        System.out.printf("MG: R$%.2f - Porcentagem: %.2f%%\n", mg, (mg / total) * 100);
	        System.out.printf("ES: R$%.2f - Porcentagem: %.2f%%\n", es, (es / total) * 100);
	        System.out.printf("Outros: R$%.2f - Porcentagem: %.2f%%\n", outros, (outros / total) * 100);
	    
	        
	    sc.close();
	}

}
