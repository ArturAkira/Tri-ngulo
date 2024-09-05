package triangulo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class calc {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double a,b,c;
		int e;
		boolean lado;
		
		System.out.println("Olá, deseja medir um triângulo?");
		System.out.println("1 - Sim");
		System.out.println("2 - NÃO");
		
		e = ler.nextInt();
		
		while(e != 2) {
			
			do {
			lado = true;
			
			System.out.println("Digite o lado A do triângulo.");
			a = ler.nextDouble();
			System.out.println("Digite o lado B do triângulo.");
			b = ler.nextDouble();
			System.out.println("Digite o lado C do triângulo.");
			c = ler.nextDouble();
			
			if(a < 0) {
				lado = false;
				System.out.println("Um triângulo não pode ter lados negativos...");
				System.out.println("Tente novamente.");
				System.out.println("");
				System.out.println("");
			}
			if(b < 0) {
				lado = false;
				System.out.println("Um triângulo não pode ter lados negativos");
				System.out.println("Tente novamente.");
				System.out.println("");
				System.out.println("");
			}
			if(c < 0) {
				lado = false;
				System.out.println("Um triângulo não pode ter lados negativos");
				System.out.println("Tente novamente.");
				System.out.println("");
				System.out.println("");
			}
			} while(lado == false);
			
			if(a == b) {
				if(b==c){
				System.out.println("O triângulo é equilátero.");
				System.out.println("Seus lados são: A="+deci.format(a)+"   B="+deci.format(b)+"   C="+deci.format(c));
				System.out.println("");
				}
				else {
					System.out.println("O triângulo é isósceles.");
					System.out.println("Seus lados são: A="+deci.format(a)+"   B="+deci.format(b)+"   C="+deci.format(c));
					System.out.println("");
				}
			}
			else if(a != b){
				if(b==c) {
					System.out.println("O triângulo é isósceles.");
					System.out.println("Seus lados são: A="+deci.format(a)+"   B="+deci.format(b)+"   C="+deci.format(c));
					System.out.println("");
				}
				else if(a == c) {
					System.out.println("O triângulo é isóscles.");
					System.out.println("Seus lados são: A="+deci.format(a)+"   B="+deci.format(b)+"   C="+deci.format(c));
					System.out.println("");
				}
				else {
					System.out.println("O triângulo é escaleno.");
					System.out.println("Seus lados são: A="+deci.format(a)+"   B="+deci.format(b)+"   C="+deci.format(c));
					System.out.println("");
				}
			}
			
			System.out.println("Quer medir outro triângulo?");
			System.out.println("1 - SIM");
			System.out.println("2 - NÃO");
			System.out.println("");
			e = ler.nextInt();
			
					if (e != 2) {
						while(e !=1) {
						if (e != 1) {
							System.out.println("Esta não é uma opção válida...");
							System.out.println("Quer medir outro triângulo?");
							System.out.println("1 - Sim");
							System.out.println("2 - NÃO");
							System.out.println("");
							
							e = ler.nextInt();
						}
						}
					}
		}
		System.out.println("Fim do programa.");
	}

}
