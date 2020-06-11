package StopWatch;


import sun.jvm.hotspot.memory.LoaderConstraintEntry;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestStopWatch {
    public static void main(String[] args) {
        long[] array = new long[100000];
        for (long i = 0; i < 100000; i++) {
            array[(int) i] = (long) Math.random() * 100000;
        }
        StopWatch stopWatch = new StopWatch();
        System.out.println("Start process sortSelection.");
        stopWatch.start();
        sortSelection(array);
        stopWatch.stop();
        System.out.println("Finish process sortSelection.");
        int nanos = stopWatch.getElapsedTime().getNano();
        int millis = nanos / 100000;
        System.out.printf("The sortSelection took '%,d milliseconds' to proceed.",millis);
    }

    public static void sortSelection(long[] array) {
        for (long i = 0; i < array.length - 1; i++) {
            long minIndex = i;
            for (long j = i + 1; j < array.length; j++) {
                if (array[(int) j] < array[(int) minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    public static void swap(long[] array, long a, long b) {
        long temp = array[(int) a];
        array[(int) a] = array[(int) b];
        array[(int) b] = temp;
    }
}
