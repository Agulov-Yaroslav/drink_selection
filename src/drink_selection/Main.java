package drink_selection;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static String fail = "Я вас не понял. Повторите попытку. ";
	
	public static void main(String [] arg) {
		
		System.out.println("Чай или кофе?");
		System.out.println("Чтобы выбрать чай введите `0`" + "\r"
				+ "Чтобы выбрать кофе введите `1` ");
		String drink = drink();
		System.out.println("Вы выбрали " + drink + "Желаете ли сахар? `1` да/ `0` нет");
		System.out.println("Вот ваш " + drink + sugar());
		sc.close();		
	}
	public static String drink() {
		
		boolean loop = true;
		String eureDrink = null;
		do {
			
		try {
			int wahl = sc.nextInt();
			switch(wahl) {
			case 0: 
				eureDrink = "чай. ";
				loop = false;
				break;
			case 1:
				eureDrink = "кофe. ";
				loop = false;
				break;
			default: 
				System.out.println(fail);
			}
		}catch(InputMismatchException e) {
			System.out.println(fail);
			sc.next();
			}
		}while(loop);
		return eureDrink;
	}
	public static String sugar() {
		String sugar = null;
		boolean loop = true;
		do {
		
			
			try {
				int wahl = sc.nextInt();
				switch(wahl) {
				case 0: 
					sugar = "Без сахара. ";
					loop = false;
					break;
				case 1:
					sugar = "С сахаром. ";
					loop = false;
					break;
				default: 
					System.out.println(fail);
				}
			}catch(InputMismatchException e) {
				System.out.println(fail);
				sc.next();
				}
			}while(loop);
		return sugar;
	}
}
