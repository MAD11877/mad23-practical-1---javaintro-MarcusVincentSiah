import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 32
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int numoftimes = in.nextInt();
        ArrayList<Integer> numList = new ArrayList<Integer>();

        int num = 0;
        while (numoftimes > 0){
            num = in.nextInt();
            numoftimes -= 1;

            numList.add(num);
        }

        int maxcount = 0;
        int mode = 0;
        for (int i = 0; i < numList.size(); i++){
            int count = 0;

            for (int j=0; j < numList.size(); j++){
                if (numList.get(j) == numList.get(i)){
                    count += 1;
                }

                if (count > maxcount){
                    maxcount = count;
                    mode = numList.get(i);
                }
            }
        }

        System.out.println(mode);
  }
}
