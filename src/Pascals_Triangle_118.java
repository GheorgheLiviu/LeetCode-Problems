import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_118 {
    //Given an integer numRows, return the first numRows of Pascal's triangle.
    //
    //In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
    //Example 1:
    //
    //Input: numRows = 5
    //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    //Example 2:
    //
    //Input: numRows = 1
    //Output: [[1]]


    // 1 <= numRows <= 30
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) return result;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = result.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(previousRow.get(j - 1) + previousRow.get(j));
            }

            row.add(1);
            result.add(row);
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(generate(5));
    }
}
