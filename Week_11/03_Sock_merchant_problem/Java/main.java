import java.util.Arrays;
import java.util.Hashtable;

public class main {
	public static void main(String[] args) {
		int[] arr = {4,1,4,1,3,3,3,5,6,5};
		System.out.println(sockMerchantTime(arr));
		System.out.println(sockMerchantTime(arr));
	}
	
	public static int sockMerchantTime(int[] arr) {
		Hashtable<Integer, Integer> set = new Hashtable<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
             if(set.contains(arr[i])) {
                  set.put(i, 1);
             } else {
                  set.put(i, set.get(i) + 1);
             }
        }
        int pairs = 0;
        for (int i = 0; i < arr.length; i++) {
             pairs += (set.get(i) / 2);
        }
        return pairs;
	}
	
	public static int sockMerchantSpace(int[] arr) {
		Arrays.sort(arr);
		int currentVal = arr[0];
		int currentCount = 0;
		int pairCount = 0;
		
		for (int i=0; i < arr.length - 1; i++) {
			if (arr[i] == currentVal) {
				currentCount += 1;
			} else {
				pairCount += currentCount/2;
				currentVal = arr[i];
				currentCount = 1;
			}
		}
		pairCount += currentCount/2;
		return pairCount;
	}
}
