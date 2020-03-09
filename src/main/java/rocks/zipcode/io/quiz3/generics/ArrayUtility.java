package rocks.zipcode.io.quiz3.generics;

import com.sun.javafx.scene.traversal.Algorithm;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.HashMap;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType > {
    private final SomeType[] array;




    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        Integer ans;
        boolean boo = true;
        for (SomeType someType : array) {
            int count = 0;
            for (SomeType type : array) {
                if (someType == type)
                    count++;
            }
            if (count % 2 != 0) {
                return someType;
            }
        }

        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType someType : array) {
            int count = 0;
            for (SomeType type : array) {
                if (someType == type) {
                    count++;
                }
            }
            if (count % 2 != 1) {
                return someType;
            }
        }

        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int numberOfDuplicates=0;
        for (SomeType someType : array) {
            if (someType.equals(valueToEvaluate)) {
                numberOfDuplicates++;
            }
        }
        return numberOfDuplicates;
    }



    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
