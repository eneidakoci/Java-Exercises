package seminar6;
import java.util.Arrays;//paketa java.util me klasen Arrays
public class Ush_10 {
/*10. Nd�rtoni nj� program q� gjeneron 20 numra rasti me vler� midis 0 dhe 99 n� nj� tabel�. Programi
afishon sekuenc�n, i rendit ato dhe m� pas afishon sekuenc�n e renditur. P�rdorni metod�n sort nga
libraria e Jav�s.*/
	
	public static void main(String[] args) {
		int[] tabela = new int[20];
		for(int i = 0; i < 20; i++) {
			tabela[i] = (int)(Math.random()*100);//*100 mqs na duhen 100 numra random (0-99). po te kerkohej 1-100 do shkruanim +1
			System.out.print(tabela[i] + "  ");
		}
		Arrays.sort(tabela);//me metoden sort rendisim tabelen ne rend rrites
		System.out.printf("%nTabela e renditur: ");//printf+%n nxjerr ne rresht te ri
		for(int i = 0; i < 20; i++) {
			System.out.print(tabela[i] + "  ");
			
		}

	}

}
