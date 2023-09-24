import java.util.Scanner;

public class LearnJava{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	String username;
	String name = "Andi";
	int age = 18;
	
	String result = ageCheck(age, name);
	System.out.println(result);
	
	System.out.println("Masukan name");
	username =  input.nextline();
	
	System.out.println("Nama saya " + username);
	
	Ticket tiket = new Ticket();
	tiket.film = "andrew";
	tiket.orang = 2;
	
	System.out.println(tiket.film + tiket.orang);
	
	}
	
public static String ageCheck(int age, String name){
	if(age >= 18){
		return name + " adalah seorang dewasa";
	}else if(age < 18){
		return name + " adalah seorang remaja";
	}else{
		return name + " adalah seorang anak-anak";
	}
}
}