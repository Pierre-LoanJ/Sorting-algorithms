public class Quicksort {
  /*
  * The idea is partition the array recursively:
  * i goes through to the right
  * j goes through to the left
  * for i, keep a[i] < a[k], otherwise stops
  * for j; keep a[j] > a[k], otherwise stops
  * when i AND j have stopped exchange a[i] and a[j]
  * so this keeps a partitionned
  * Once i and j have crossed stop and exchange a[k] and a [j] (put a[k] to the right place)
  */
  public static int partition(char[] a, int i, int j) {
    while (i <= j) {
      if (i >= a.length || j < 0) break;
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
    if (i >= j) return;
    int part = partition(a, i, j);
    sort(a, i, k);
    sort(a, k+1, j);
  }
  public static void sort(char[] a) {
    shuffle(a);
    sort(a, 1, a.length - 1);
  }
}
