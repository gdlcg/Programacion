package Clase;

public class clase1 {

	public static void main(String[] args) {

		int x = 3, y = 4;

		if (--y == x) {

			y += 2;

		}

		for (int j = 1; j <= 5; j += 3) {

			x += j;

		}

		y -= x;

		x++;

		System.out.println(x);
		System.out.println(y);
	}

}