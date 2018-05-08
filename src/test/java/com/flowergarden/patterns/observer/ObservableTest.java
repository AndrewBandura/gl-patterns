package com.flowergarden.patterns.observer;

import com.flowergarden.flowers.GeneralFlower;
import com.flowergarden.pattern.observer.Observer;
import com.flowergarden.properties.FreshnessInteger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ObservableTest {

    GeneralFlower observable;

    @Mock
    Observer observer1;

    @Mock
    Observer observer2;

    @Mock
    FreshnessInteger freshness;


    @Before
    public void setUp() {

        observable = new GeneralFlower();

        observable.addObserver(observer1);
        observable.addObserver(observer2);
    }

    @Test
    public void testNotifyAllTest() {

        observable.notifyObservers(observable, freshness);

        verify(observer2).handleEvent(observable, freshness);
        verify(observer2).handleEvent(observable, freshness);
    }

    @Test
    public void notifyOnlySubscribedTest() {

        observable.removeObserver(observer1);

        observable.notifyObservers(observable, freshness);

        verifyNoMoreInteractions(observer1);
        verify(observer2).handleEvent(observable, freshness);

    }
}
