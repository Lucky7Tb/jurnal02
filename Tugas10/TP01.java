import java.util.Scanner;

class TP01 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int numberInput;

		System.out.println("Soal ke-4\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan no perkalian: ");
		numberInput = userInput.nextInt();
		
		userInput.close();

		for(int i = 1; i <= 10; i++){
			System.out.println(i + " x " + numberInput + " = " + (i * numberInput));
		}
		
	}
}