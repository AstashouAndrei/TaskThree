package by.gstu.training.task3.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class with with common description of object containing two list of
 * positive numbers and merged list
 */

public class NumberStorage {

    private List<Integer> numbersBeforeNegative;
    private List<Integer> numbersAfterNegative;
    private List<Integer> mergedNumbers = new ArrayList<Integer>();

    public NumberStorage(List<Integer> beforeNegative, List<Integer> afterNegative) {
        this.numbersBeforeNegative = beforeNegative;
        this.numbersAfterNegative = afterNegative;
        mergeAndSort();
    }

    private void mergeAndSort() {
        mergedNumbers.addAll(numbersBeforeNegative);
        mergedNumbers.addAll(numbersAfterNegative);
        Collections.sort(mergedNumbers);
    }

    public List<Integer> getNumbersBeforeNegative() {
        return numbersBeforeNegative;
    }

    public void setNumbersBeforeNegative(List<Integer> numbersBeforeNegative) {
        this.numbersBeforeNegative = numbersBeforeNegative;
    }

    public List<Integer> getNumbersAfterNegative() {
        return numbersAfterNegative;
    }

    public void setNumbersAfterNegative(List<Integer> numbersAfterNegative) {
        this.numbersAfterNegative = numbersAfterNegative;
    }

    public List<Integer> getMergedNumbers() {
        return mergedNumbers;
    }

    public void setMergedNumbers(List<Integer> mergedNumbers) {
        this.mergedNumbers = mergedNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberStorage twoList = (NumberStorage) o;
        return numbersBeforeNegative.equals(twoList.numbersBeforeNegative) &&
                numbersAfterNegative.equals(twoList.numbersAfterNegative);
    }

    @Override
    public int hashCode() {
        final int hash = 19;
        return hash + numbersBeforeNegative.hashCode() +
                numbersAfterNegative.hashCode() + mergedNumbers.size();
    }

    @Override
    public String toString() {
        return "Sorted first list (С1): " + numbersBeforeNegative +
                "\nUnsorted second list (С2): " + numbersAfterNegative +
                "\nSorted merged list: " + mergedNumbers;
    }
}

