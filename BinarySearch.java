public class BinarySearch{
public static int binarySearchCourse(int[] t, int nb) {
	int lo = 0;
	int hi = t.length - 1;
	while (lo <= hi) {
		int mi = (hi-lo)/2 + lo;
	       	if (nb > t[mi]) { 
	      		lo = mi + 1;
	      	}
	       	else if (nb < t[mi]) {
	      		hi = mi - 1;
	       	}
	       	else return mi;
	}
	return -1;
}

public static void main(String[] args) {
	int[] t = { 15, 16, 17, 18, 19, 20, 30, 35, 40, 45 };
	int result = binarySearch(t, 40);
	System.out.println(result);
	}
}
