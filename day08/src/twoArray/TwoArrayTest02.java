package twoArray;

public class TwoArrayTest02 {
   public static void main(String[] args) {
      int[][] ar1 = { { 1, 2 }, { 4, 5 }, { 7, 8 } };
      System.out.println(ar1); // [[I@65ae6ba4
      System.out.println(ar1[0]); // [I@7960847b
      System.out.println(ar1[0][0]);
      System.out.println(ar1[0][1]);
//      System.out.println(ar1[0][2]);
      System.out.println(ar1[1][0]);
      System.out.println(ar1[1][1]);
//      System.out.println(ar1[1][2]);
      System.out.println("2차원 배열(행) : " + ar1.length); // 행
      System.out.println("2차원 배열(열) : " + ar1[0].length); // 열

      for (int i = 0; i < ar1.length; i++) { // 행 반복
//         System.out.println("ar1.length의 값(행) : " + ar1.length);
//         System.out.println("ar1의 각 행 " + i + "의 주소값 : " + ar1[i]);
         for (int j = 0; j < ar1[i].length; j++) { // 열 반복
//            System.out.println(ar1[i][j]); //값 출력
            System.out.println(i + "행 : " + ar1[i] + ", " + j + " 열 : " + j + ", ar1[i][j] 값 : " + ar1[i][j]);
         }
      }

      int[][] ar2 = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2행 3열
      int[] ar = { 1, 2, 3 };
      for (int data : ar) {
         System.out.println(data);
      }
      System.out.println(ar2); // [[I@270421f5
      System.out.println(ar2[0]); // [I@52d455b8
      for (int[] data : ar2) { //행 반복
         for (int data1 : data) { //각 행의 열 반복
            System.out.println(data1);
         }
//         System.out.println(data);
      }

   }
}
