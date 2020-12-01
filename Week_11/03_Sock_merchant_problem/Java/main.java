import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		int[] arr = [4,1,4,1,3,3,3,5,6,5];
		System.out.println(sockMerchantTime(arr));
		System.out.println(sockMerchantTime(arr));
	}
	
	public static int sockMerchantTime(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
             if(set.contains(arr[i])) {
                  arr.put(i, 1);
             } else {
                  arr.put(i, arr.get(i) + 1);
             }
        }
        int pairs = 0;
        for (int i = 0; i < arr.length; i++) {
             pairs += (arr.get(i) / 2);
        }
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