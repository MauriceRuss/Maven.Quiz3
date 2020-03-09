package rocks.zipcode.io.quiz3.generics;

import com.sun.javafx.scene.traversal.Algorithm;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.HashMap;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;




    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {




        return null;
    }

    public SomeType findEvenOccurringValue() {
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int numberOfDuplicates=0;
        for ( int i = 0 ; i < array.length ; i++) {
            if (array[i].equals(valueToEvaluate)) {
                numberOfDuplicates++;
            }
        }
        return numberOfDuplicates;
    }



    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
