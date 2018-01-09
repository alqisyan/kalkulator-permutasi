import java.util.Scanner;

public class Apeade
{

public static void main(String [] args){
   //String menu="y";
   //while(menu.equals("y"))
   {
   int x = 1;
   int n;
   int c;
   int y=1;
   int hasil=1;
   int N;
   int hasilbawah=1;
   int total;

	System.out.println("Selamat Datang");
	
	System.out.println("Masukkan Nilai n");	
   Scanner input=new Scanner(System.in);
   	n=input.nextInt();
   System.out.println("Masukkan Nilai c");	
   	c=input.nextInt();
	//Faktorial X
	while(x<=n) {
                hasil=hasil*x;
		
		//System.out.println(hasil);
                x++;
        }
	//Faktorial C
	N=n-c;
	while(y<=N) {
		hasilbawah=hasilbawah*y;
		//System.out.println(hasilbawah);
		y++;
	}
   total=hasil/(hasilbawah);
	System.out.println("Hasil Faktorial Permutasi = "+total);
   


   }
   }
}