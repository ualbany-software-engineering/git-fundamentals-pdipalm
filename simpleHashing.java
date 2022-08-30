import java.util.Arrays;
import java.util.Random;

public class Hashing {
	public static void main(String[] args) {
		
		int tableSize = 199;
		double sum = 0;
		
		for(int i=0;i<10;++i) {
			sum += avgColl(tableSize);
		}
		
		System.out.println("avg max collision count: " + (sum/10.0));
	}
	
	static double avgColl(int size) {
		Random random = new Random();  
		int[] hashtable = new int[size];
		Arrays.fill(hashtable, -1);
		
		for(int i = 0; i <= 1000; ++i) {	
			int hash = Math.abs(random.nextInt() % size);
			hashtable[hash]++;
		}
		int max = Arrays.stream(hashtable).max().getAsInt();
		
		return max;
	}
}
