//Create a project (as in Lab 1) and write a function with tests
// that determines whether a given set can be partitioned into two
// subsets such that the sum of elements in both subsets are the same.
//{1, 1, 3, 4, 7} = ?
//{2, 3, 4, 6}  = ?
//What is the time complexity of your solution?
//Is there any better solution?
//Examples:
//arr[] = {1, 5, 11, 5} => Output: true as {1, 5, 5} and {11}
//arr[] = {1, 5, 3} => Output: false

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partionaling {

    public static boolean areTheSame(int[] arr){
        int sum = Arrays.stream(arr).sum();

        if(sum % 2 != 0){
            return false;
        }
        Arrays.sort(arr);
        int desiredSum = (sum / 2) - arr[arr.length-1];

        if(desiredSum == 0){
            return true;
        }

        for (int i = arr.length-2; i > 0; i--) {

            if(arr[i] < desiredSum){
                desiredSum -= arr[i];
            }else if(arr[i] == desiredSum){
                desiredSum -= arr[i];
                break;
            }
        }
        if(desiredSum == 0){
            return true;
        }

        return false;
    }

}


