public class Day10 {
  // Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation. When working with different bases, it is common to show the base as a subscript.
  public static void main(String[] args) {
    solution(129);
  }

  public static void solution(int n) {
    String binary = "";
    int binaryLength = getLength(n);
    int placeholder = n;
    while (placeholder > 0) {
      int curBinaryBit = getBinaryDigit(binaryLength);
      if (placeholder >= curBinaryBit) {
        binary += "1";
        placeholder -= curBinaryBit;
      } else {
        binary += "0";
      }
      binaryLength--;
    }
    String[] arrayOfOnes = binary.split("0");
    int consecutiveOnes = 0;
    for (String ones : arrayOfOnes) {
      if (ones.length() > consecutiveOnes) {
        consecutiveOnes = ones.length();
      }
    }
    System.out.println(consecutiveOnes);
  }

  public static int getLength(int n) {
    int count = 1;
    while (n / 2 >= 1) {
      count++;
      n /= 2;
    }
    return count;
  }

  private static int getBinaryDigit(int count) {
    int num = 1;
    for (int start = 1; start < count; start++) {
      num *= 2;
    }
    return num;
  }
}