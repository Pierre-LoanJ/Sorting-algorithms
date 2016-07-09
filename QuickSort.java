public class Quicksort {
  public static int partition(char[] a, int i, int j) {
    while (i <= j) {
      if (i >= a.length || j < 0) return 0;
      if (a[i] <= a[k]) i++;
      if (a[j] >  a[k]) j++;
      if (a[i] > a[k] && a[j] < a[k]) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }
    char p = a[j];
    a[j] = a[k];
    a[k] = p;
    return j;
  }
  public static void sort( char[] a, int i, int j) {
    partition(a, i, j);
    sort(a, i, k);
    sort(a, k+1, j);
  }
  public static void sort(char[] a) {
    shuffle(a);
    sort(a, 1, a.length - 1);
  }
}
