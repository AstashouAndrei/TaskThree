package by.gstu.training.task3;

import by.gstu.training.task3.numbers.NumberParser;
import by.gstu.training.task3.numbers.NumberStorage;
import by.gstu.training.task3.numbers.NumberSaver;

/**
 * Class for running application
 */

public class Runner {
    public static void main(String[] args) {
        /*
        Creating NumberStorage object which will contains numbers
        from given file according with task (file with numbers are in resources folder)
        */
        NumberStorage storage = new NumberParser().parseNumbersFromFile("src/resources/numbers.txt");

        NumberSaver saver = new NumberSaver();

        /*
        Save to different files numbers according with task and detailed information
         about NumberStorage (both .txt files will be in result folder)
       */
        saver.saveNumbersToFile(storage, "src/result/numbers.txt");
        saver.saveTwoListInfo(storage, "src/result/numbers_info.txt");
    }
}
