/**
 * In the main(String[]) method, display all the numbers in the three-dimensional multiArray array.
 * 
 * Requirements:
 * •	The Solution class must have a public static int[][][] multiArray variable.
 * •	In the main(String[]) method, display all the numbers in multiArray.
 */

/* 
Creating a multi-array
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //write your code here
    }
}

// public class Solution {

//     public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

//     public static void main(String[] args) {
//         for (int i = 0; i < multiArray.length; i++)
//         {
//             for (int j = 0; j < multiArray[i].length; j++)
//             {
//                 for (int k = 0; k < multiArray[i][j].length; k++)
//                 {
//                     System.out.print(multiArray[i][j][k]);
//                     System.out.print(" ");
//                 }
//                 System.out.println();
//             }
//             System.out.println("----------");
//         }
//     }
// }
