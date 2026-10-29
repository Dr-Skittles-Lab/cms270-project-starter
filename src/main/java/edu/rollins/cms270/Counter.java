package edu.rollins.cms270;

import java.util.ArrayList;
import java.util.List;

/**
 * Sample logic class. Replace it with your own project's classes.
 * Logic classes never import anything from javax.swing.
 */
public class Counter {
    private int count;
    private final List<CountListener> listeners = new ArrayList<>();

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
        notifyListeners();
    }

    public void reset() {
        count = 0;
        notifyListeners();
    }

    public void addCountListener(CountListener listener) {
        listeners.add(listener);
    }

    private void notifyListeners() {
        for (CountListener listener : listeners) {
            listener.countChanged(count);
        }
    }
}
