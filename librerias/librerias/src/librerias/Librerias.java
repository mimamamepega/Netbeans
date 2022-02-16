/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librerias;

import java.util.Arrays;

/**
 *
 * @author cep
 */
public class Librerias {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int[] array = new int[6];
		int[] arraymostrar = new int[6];
		int veces = 0, posicion = 0;
		System.out.println(Arrays.toString(mostrar(array, arraymostrar, veces, posicion)));
		System.out.println("La media del array es: " + media(array));
		System.out.println("El numero mas mayor del array es: " + mayor(array));
		System.out.println("Existe el dato introducido en el array?[T/F] " + buscar(array));
	}
	
	public static int[] mostrar(int[]array, int[] arraymostrar,int veces, int posicion) {
		System.out.println(Arrays.toString(arraywapo(array,veces,posicion)));
		return arraymostrar;
	}
	
	public static int[] arraywapo(int[]array, int veces, int posicion) {
		
		System.out.println("Cuantas posiciones quieres llenar al array?");
		veces = teclado.llegirInt();
		
		for(int i = 0;i < veces;++i){
		System.out.println("Que posicion de array quieres?");
			posicion = teclado.llegirInt();
		System.out.println("Introduce el dato: ");
			array[posicion] = teclado.llegirInt();
		}
		return array;
	}
	
	public static float media(int[]array) {
		
		System.out.println("repite las veces que has llenado el array:");
		int veces = teclado.llegirInt();
        float media = 0;
		for (int i = 0; i < veces; i++) {
			media = media + array[i];
		}
		return  media / veces;
	}
	public static int mayor(int[]array) {
		
		int mayor = 0;
		for (int x = 1; x < array.length; x++) {
			if (array[x] > mayor) {
				mayor = array[x];
			}
		}
		return  mayor;
	}
	
	public static boolean buscar(int[]array) {
		boolean encontrar = false;
		int bus;
		
		System.out.println("Introduce el numero que quieres buscar;");
		bus = teclado.llegirInt();
		System.out.println("Introduce las veces otra vez:");
		int veces = teclado.llegirInt();
		for (int i = 0; i < veces; i++) {
		if(bus == array[i]){
			encontrar = true;
		}
		}
		return encontrar;
	}
}
