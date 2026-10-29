package edu.rollins.cms270;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class CounterTest {
    private Counter counter;

    @BeforeEach
    void setUp() {
        counter = new Counter();
    }

    @Test
    void startsAtZero() {
        assertEquals(0, counter.getCount());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 10})
    void incrementAddsOneEachTime(int times) {
        for (int i = 0; i < times; i++) {
            counter.increment();
        }
        assertEquals(times, counter.getCount());
    }

    @Test
    void resetReturnsToZero() {
        counter.increment();
        counter.increment();
        counter.reset();
        assertEquals(0, counter.getCount());
    }

    @Test
    void listenerIsCalledWithNewCount() {
        CountListener listener = mock(CountListener.class);
        counter.addCountListener(listener);

        counter.increment();

        verify(listener).countChanged(1);
    }
}
