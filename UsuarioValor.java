package colecoes;


import java.util.Scanner;

public class UsuarioValor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos valores:\n");
		
		int qtdeValor = entrada.nextInt();
		double[] valor= new double[qtdeValor];
		System.out.println(valor[0]);
		
		for (int i = 0; i < valor.length; i++) {
			System.out.println("informe os valores"+ (i + 1)+ ":");
			valor[i]= entrada.nextInt();
		}
		

		
		double total=0;
		for(double valores:valor)
		{
			total+=valores;
		}
		System.out.println("a media é de "+(total/qtdeValor));
		
		entrada.close();
		
	}
}
