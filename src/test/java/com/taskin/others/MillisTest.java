package com.taskin.others;

import org.junit.Test;
import java.util.concurrent.TimeUnit;

public class MillisTest {

    @Test
    public void testPencil() {
        final long start = System.nanoTime();
        doSomeHeavyLifting();
        doSomeHeavyLifting();
        doSomeHeavyLifting();
        final long total = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - start);
        System.out.println("it takes " + total + " seconds");
    }

    private void doSomeHeavyLifting() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException e) {
            Thread.interrupted();
            throw new IllegalStateException(e);
        }
    }
}
