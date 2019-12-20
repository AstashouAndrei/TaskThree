package by.gstu.training.task3.numbers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class with description of saving to file methods
 */

public class NumberSaver {

    /**
     * Method saves to given file list of merged and sorted numbers
     *
     * @param numberStorage  two list
     * @param filePath path to file where need to save list of numbers
     */
    public void saveNumbersToFile(NumberStorage numberStorage, String filePath) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)));

            for (Integer number : numberStorage.getMergedNumbers()) {
                bw.write(number + "\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("File can't be read");
        }
    }

    /**
     * Method saves to given file detailed information of NumberStorage object,
     * including all lists (two different lists and merged list)
     *
     * @param numberStorage  two list
     * @param filePath path to file where need to save list of numbers
     */
    public void saveTwoListInfo(NumberStorage numberStorage, String filePath) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)));
            bw.write(numberStorage.toString());
            bw.close();
        } catch (IOException e) {
            System.out.println("File can't be read");
        }
    }
}
