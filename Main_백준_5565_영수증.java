import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_5565_영수증 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = 9;
		int sum = Integer.parseInt(br.readLine());
		while(T-- > 0){
			int price = Integer.parseInt(br.readLine());
			
			sum -= price;
		}
		System.out.print(sum);
	}
}