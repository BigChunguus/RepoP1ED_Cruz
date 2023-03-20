package pruebas2;
import java.util.*;
public class ArrayPrincipal {

	public static void main(String[]args) {
		
		int vuelta = 0;
		int contadorImpar = 0;
		Random aleatorio = new Random();
		int[] numAleatorios = new int[100];
		boolean comprobanteRepetidos = true;
		boolean continuarComprobando = true;
		
		
		//Rellenar
		for(int i = 0; i < numAleatorios.length ;i++) {
			numAleatorios[i] = aleatorio.nextInt(100); 			
		}
		
		//Comprobacion
		for(int parImpar = 0; parImpar< numAleatorios.length; parImpar++) {
			if(numAleatorios[parImpar]%2 == 0) {
				System.out.println(numAleatorios[parImpar]);
			}else {
				contadorImpar++;
			}	
		}
		//a
		//Cantidad impares
		System.out.println("Impares: " + contadorImpar);
		
		
		while(comprobanteRepetidos){
			continuarComprobando = true;

			numAleatorios = new int[100];


			for(int i = 0; i < numAleatorios.length ; i++ ) {
				numAleatorios[i] = aleatorio.nextInt(100); 			
			}


			for(int i = 0; i < numAleatorios.length && continuarComprobando; i++ ){

				for(int j = i+1; j < numAleatorios.length && continuarComprobando; j++){
					
					if( numAleatorios[i] == numAleatorios[j]){
						System.out.println(vuelta);
						continuarComprobando=false;
					}
				}
				if(i==99)
					comprobanteRepetidos = false;
			}
			
			
			vuelta++;
			
		}
		
		for(int k = 0; k < 100; k++) {
			System.out.println(numAleatorios[k]);
		}
		
		System.out.println("Vueltas: " + vuelta);
		
		//Mi gran momento "BRUUH"
						//Vaciar
						// for(int j = 0; j < numAleatorios.length ; j++) {
						// 	numAleatorios[j] = 0;
						// }
						
						// for(int contador = 0; contador < numAleatorios.length; contador++) {
						// 	numAleatorios[contador] = aleatorio.nextInt(100); 	
						 	//Comprobador
						// 	for(int comp = 0; comp < numAleatorios.length; comp++) {
						// 		if(numAleatorios[contador] == numAleatorios[comp]) {
						 			//Vaciador
						// 			for(int j = 0; j < numAleatorios.length ; j++) {
						// 				numAleatorios[j] = 0;
						// 			}
						// 		}
						// 	}
						// }
						
						 //Si el ultimo numero no esta vacio imprime
						// if(numAleatorios[99] != 0) {
						// 	for(int f = 0; f < numAleatorios.length; f++){
						// 		System.out.println(numAleatorios[f]);
						// 	}
						// }
		
	}
}
	