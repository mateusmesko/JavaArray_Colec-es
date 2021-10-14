package colecoes;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasA = new double[5];
		double TotalAlunoA = 0;
		
		notasA[0]= 7.9;
		notasA[1]= 9.2;
		notasA[2]= 5.6;
		notasA[3]= 8.6;
		notasA[4]= 9.6;
		
		
		System.out.println(Arrays.toString(notasA));
		
		
		for(int i=0; i< notasA.length;i++)
		{
			TotalAlunoA+= notasA[i];
		}
		System.out.println(TotalAlunoA/notasA.length);
		
		double [] notasB = {1.5, 6.0, 6.6, 7.2};
		double totalB =0;
		for(int i = 0; i< notasB.length;i++)
		{
			totalB+=notasB[i];
		}
		System.out.println(totalB/notasB.length);
		//laço simples com lenght
		
		
		
		
	}
}
