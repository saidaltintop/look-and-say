import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number;// başlangıc sayiyi
		int sequencenumber;//adım sayiyi
		Scanner scan = new Scanner(System.in);//ekrandan girdi alabilmek için kullanacagız
		System.out.print("Please enter a digit => ");
		number=scan.nextLine();//girdigimiz sayiyi number a atadık
		System.out.print("Please enter sequence number => ");
		sequencenumber=scan.nextInt();
		lookandsay x=new lookandsay();//x diye bir obje oluşturduk
		x.NumberDoArraylist(number);//numberDoArraylist metotunu kullanarak numberı mızı karakter karakter bir arrayliste atadık
		for (int i = 0; i < sequencenumber; i++) {
			System.out.print("Sequence number: "+ (i+1) + " Number: ");
			x.Look_Say();//Bir önceki sayıdan diğer sonraki sayıyı üreten metot
			System.out.println();
		}
		
	}

	

}
