package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Maria");
		fila.offer("João");//OFFER PODE SER DEFINIDA UM TAMANHO DE FILA
		fila.offer("Pedro");
		
		System.out.println("Peek/Element...");
		System.out.println(fila.peek());//CASO VAZIO RETORNA NULL
		System.out.println(fila.element());//CASO VAZIO INFORMA EXEPTION
		
		System.out.println("Poll/Remove...");
		System.out.println(fila.poll());//RETIRA E INFORMA NULL CASO N TENHA MAIS NADA EM LSITA
		System.out.println(fila.remove());//CASO VAZIA INFORMA EXEPTION
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

	}

}
