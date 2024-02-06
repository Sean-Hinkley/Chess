public class Program {
  public static void main(String[] args) {

    //declaration
    String[][] arr;

    // initialization

    arr = new String[2][3];

    arr[0] = new String[] {"one", "two", "three"};
    arr[1][0] = "four";
    arr[1][1] = "five";
    arr[1][2] = "six";




    System.out.println(arr[arr.length - 1][arr[0].length - 1]);
  }
}