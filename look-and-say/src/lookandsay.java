import java.util.ArrayList;


public class lookandsay {

	private String number;
	private ArrayList<String> arraylist1=new ArrayList<String>();
	public lookandsay() 
	{
	
	}
	/*public lookandsay(String number)
	{
		this.number=number;
	}*/
	public ArrayList<String> NumberDoArraylist(String number)//aldıgı number ı karakterlerine ayırıp arrayliste atar
	{
		for (int i = 0; i < number.length(); i++) {
			arraylist1.add(number.substring(i,i+1));
		}
		return arraylist1;
	}
	public void Look_Say()//Bir önceki sayıdan diğer sonraki sayıyı üreten metot
	{
		ArrayList <String> arraylist2 = new ArrayList <String> ();//arraylist olusturdum
		int count=1;
			for (int i = 0; i < arraylist1.size(); i++) {
				if((i+1)!=arraylist1.size() && arraylist1.get(i).equalsIgnoreCase(arraylist1.get(i+1)))//array içinde yan yana aynı sayı varsa içine girer 
					{
						count++;//yanyana kaç aynı sayı var onu sayar.
					}
					else//bir sağındaki sayi ile aynı değilde buraya girer ve ekrana aynı sayıdan kaç tane oldugunu ve o sayıyı yazdırır
					{
						System.out.print(count+arraylist1.get(i));
						arraylist2.add(Integer.toString(count));//sayiyi string e cevirir ve arraylist2 ye elemanı girer
						arraylist2.add(arraylist1.get(i));//arraylist2 ye arraylist1 in elemanlarını girer
						count=1;//count u tekrar 1 yaparız cunku yan yana olan sayıları baştan sayması gerekir
					}
		}
			arraylist1=arraylist2;//arraylist2 yi arraylist1 e atarız cunku arraylist2 de sayi miktarı ve sayi yanyana yazar.bunu alıp tekrar işleme sokup bir sonraki degeri buluruz
	}
	/*public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}*/
}
