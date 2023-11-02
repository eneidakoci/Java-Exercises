package seminar6;
import java.util.Arrays;//paketa java.util me klasen Arrays
public class Ush_10 {
/*10. Ndërtoni një program që gjeneron 20 numra rasti me vlerë midis 0 dhe 99 në një tabelë. Programi
afishon sekuencën, i rendit ato dhe më pas afishon sekuencën e renditur. Përdorni metodën sort nga
libraria e Javës.*/
	
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
