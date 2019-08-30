package DaySixMemoryReallocation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class description
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class DaySixMemoryReallocation {
    public static void main(String[] args) {
        String goldenString = "14\t0\t15\t12\t11\t11\t3\t5\t1\t6\t8\t4\t9\t1\t8\t4";
//        String testString = "0\t2\t7\t4";

        boolean goAgain = true;

        ArrayList<Integer> memoryBankBlocks = getMemoryBankBlocks(goldenString);
        ArrayList<String> recordHistory = new ArrayList<>();
        recordHistory.add(memoryBankBlocks.toString());

        int counter = 0;

        System.out.println(memoryBankBlocks);
        do {
            counter++;

            int distributedBlocks = getLargestBankSize(memoryBankBlocks);
            int index = memoryBankBlocks.indexOf(distributedBlocks) + 1;
            memoryBankBlocks.set(index - 1, 0);

            while(distributedBlocks != 0) {
                if(index == memoryBankBlocks.size()){
                    index = 0;
                }

                memoryBankBlocks.set(index, memoryBankBlocks.get(index) + 1);
                index += 1;
                distributedBlocks -= 1;
            }

            if(recordHistory.contains(memoryBankBlocks.toString())) {
                goAgain = false;
            }

            recordHistory.add(memoryBankBlocks.toString());

        } while(goAgain);

        System.out.println(memoryBankBlocks.toString());
        System.out.println(recordHistory);
        System.out.println(counter);
    }

    private static ArrayList<Integer> getMemoryBankBlocks(String memoryString) {
        ArrayList<Integer> memoryBankBlocks = new ArrayList<>();
        List<String> memoryBankStrings = Arrays.asList(memoryString.split("[\t]"));

        for(String blockString : memoryBankStrings) {
            memoryBankBlocks.add(Integer.parseInt(blockString));
        }

        return memoryBankBlocks;
    }

    private static Integer getLargestBankSize(ArrayList<Integer> memoryBankBlocks) {
        Integer largestBankSize = memoryBankBlocks.get(0);

        for(Integer bankSize : memoryBankBlocks) {
            if(bankSize > largestBankSize) {
                largestBankSize = bankSize;
            }
        }

        return largestBankSize;
    }
}
