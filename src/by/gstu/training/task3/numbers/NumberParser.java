package by.gstu.training.task3.numbers;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Class with common parsing methods description
 */

public class NumberParser {

    /**
     * Method scans given file and returns NumberStorage filed with two ArrayLists:
     * first list fills with positive number which is before  negative number,
     * second list fills with positive numbers which is after negative number.
     *
     * @param filePath file path
     * @return NumberStorage with two ArrayLists
     */
    public NumberStorage parseNumbersFromFile(String filePath) {

        List<Integer> numbersBeforeNegative = new ArrayList<Integer>();
        List<Integer> numbersAfterNegative = new ArrayList<Integer>();

        boolean isNegative = false;

        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (isNumeric(line)) {
                    int number = Integer.parseInt(line);
                    if (number < 0) {
                        isNegative = true;
                        continue;
                    }
                    if (!isNegative) {
                        numbersBeforeNegative.add(number);
                    } else {
                        numbersAfterNegative.add(number);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.sort(numbersBeforeNegative);

        return new NumberStorage(numbersBeforeNegative, numbersAfterNegative);
    }

    /**
     * Method returns boolean result of checking whether
     * the given line are integer number
     *
     * @param line checking line
     * @return boolean result of checking
     */
    private boolean isNumeric(String line) {
        try {
            Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
