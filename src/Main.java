/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * IKIN HASANOV's response to Homework
 *                          "Java Collections Framework. List.", Module 3.
 *
 *   Task:
 *          1.  Create ArrayList and LinkedList containing
 *              100 000 Integer elements. Compare time intervals.
 *          2. Insert  new 1000 elements  on the  beginning, on  the middle
 *              and on the end of ones. Compare time intervals.
 *          3. Update 1000 elements  from the  beginning, from  the middle
 *              and from the end of ones. Compare time intervals.
 *          4. Delete 1000 elements  from the  beginning, from  the middle
 *              and from the end of ones. Compare time intervals.
 *
 *
 * @version 1.10.
 * @Since   04-04-2021
 * @class
 * @author  Ilkin Hasanov
 */
public class Main {

    public static void main(String[] args) {
/** Creating ArrayList and LinkedList containing
 *                      100 000 Integer elements.
 * In order to compare time between operations
 * we pinpointed time before creating ArrayList
 */
        LocalDateTime start = LocalDateTime.now();

/** Creating ArrayList which contains 100 000 Integer elements */
        List<Integer> arrayIntegers = new ArrayList<>();

/** With the help of for loop adding integers to list */
        for (int i = 0; i < 100_000; i++) {
            arrayIntegers.add(i+1);
        }

/** Fixing the time after adding integers to list */
        LocalDateTime timeAfterArrayList = LocalDateTime.now();

/** Creating LinkedList which contains 100 000 Integer elements */
        List<Integer> linkedIntegers = new LinkedList<>();

/** With the help of for loop adding integers to linked ist */
        for (int i = 0; i < 100_000; i++) {
            linkedIntegers.add(i+1);
        }

/** Fixing the time after adding integers to LinkedList */
        LocalDateTime timeAfterLinkedList = LocalDateTime.now();

/** Comparing time intervals */
        int intervalCreating = (Duration.between
                (timeAfterArrayList,timeAfterLinkedList))
                .compareTo(Duration.between
                        (start, timeAfterArrayList));

        double creatingInterval = ((intervalCreating) /= 100);
        creatingInterval /= 10_000_000;

        System.out.println("\nDuration to create ArrayList: " +
                (Duration.between(start, timeAfterArrayList)));
        System.out.println("Duration to create LinkedList: " +
                (Duration.between(timeAfterArrayList,timeAfterLinkedList)));
        System.out.println("Difference between durations: " + creatingInterval);

/**************************THE END OF CREATING LISTS***************************/

/*******************************ADDING ELEMENTS********************************/

/** Fixing the start time */
        LocalDateTime timeBeforeAddingArrayListElement = LocalDateTime.now();
/**  Insert  new 1000 elements  on the  middle */
        for (int i = 0; i < 1000; i++) {
            arrayIntegers.add(50_000 + i, i + 20_001);
        }
/**  Insert  new 1000 elements  on the end */
        for (int i = 0; i < 1000; i++) {
            arrayIntegers.add(i + 30_001);
        }

/** Insert new 1000 elements  on the beginning */
        for (int i = 0; i < 1000; i++) {
            arrayIntegers.add(0,40_100 - i);
        }
/** Fixing the time after adding integers to list */
        LocalDateTime timeAfterAddingArrayListElement = LocalDateTime.now();

/** Insert  new 1000 elements  on the  middle */
        for (int i = 0; i < 1000; i++) {
            linkedIntegers.add(50_000 + i, i + 20_001);
        }
/** Insert  new 1000 elements  on the end */
        for (int i = 0; i < 1000; i++) {
            linkedIntegers.add(i + 30_001);
        }

/** Insert new 1000 elements  on the beginning */
        for (int i = 0; i < 1000; i++) {
            linkedIntegers.add(0,40_100 - i);
        }
/** Fixing the time after adding integers to list */
        LocalDateTime timeAfterAddingLinkedListElement = LocalDateTime.now();

/** Comparing time intervals */
        int intervalAdding = (Duration.between(timeAfterAddingArrayListElement,
                timeAfterAddingLinkedListElement))
                .compareTo(Duration.between(timeBeforeAddingArrayListElement,
                        timeAfterAddingArrayListElement));

        double addingInterval = ((intervalAdding) /= 100);
        addingInterval /= 10_000_000;

        System.out.println("\nDuration of adding elements to ArrayList: " +
                (Duration.between(timeBeforeAddingArrayListElement,
                        timeAfterAddingArrayListElement)));
        System.out.println("Duration of adding elements to LinkedList: " +
                (Duration.between(timeAfterAddingArrayListElement,
                        timeAfterAddingLinkedListElement)));
        System.out.println("Difference between durations: " + addingInterval);

/**************************THE END OF ADDING ELEMENTS**************************/

/*******************************UPDATING ELEMENTS******************************/

/** Fixing the start time */
        LocalDateTime timeBeforeUpdatingArrayListElement = LocalDateTime.now();
/** Update 1000 elements  on the  middle */
        for (int i = 0; i < 1000; i++) {
            arrayIntegers.set(50_100 + i, i + 22_001);
        }
/** Update 1000 elements  on the end */
        for (int i = 0; i < 1000; i++) {
            arrayIntegers.set(arrayIntegers.size()-1-i, 33_100 - i);
        }

/** Update 1000 elements  on the beginning */
        for (int i = 0; i < 1000; i++) {
            arrayIntegers.set(0 + i, 44_001 + i);
        }
/** Fixing the time after adding integers to list */
        LocalDateTime timeAfterUpdatingArrayListElement = LocalDateTime.now();


/** Update 1000 elements  on the  middle */
        for (int i = 0; i < 1000; i++) {
            linkedIntegers.set(50_100 + i, i + 22_001);
        }
/** Update 1000 elements  on the end */
        for (int i = 0; i < 1000; i++) {
            linkedIntegers.set(linkedIntegers.size()-1-i, 33_100 - i);
        }

/** Update 1000 elements  on the beginning */
        for (int i = 0; i < 1000; i++) {
            linkedIntegers.set(0 + i, 44_001 + i);
        }
/** Fixing the start time */
        LocalDateTime timeAfterUpdatingLinkedListElement = LocalDateTime.now();

/** Comparing time intervals */
        int intervalUpdating = (Duration.between
                (timeAfterUpdatingArrayListElement,
                        timeAfterUpdatingLinkedListElement))
                .compareTo(Duration.between(timeBeforeUpdatingArrayListElement,
                        timeAfterUpdatingArrayListElement));

        double updatingInterval = ((intervalUpdating) /= 100);
        updatingInterval /= 10_000_000;

        System.out.println("\nDuration of updating elements in ArrayList: " +
                (Duration.between(timeBeforeUpdatingArrayListElement,
                        timeAfterUpdatingArrayListElement)));
        System.out.println("Duration of updating elements in LinkedList: " +
                (Duration.between(timeAfterUpdatingArrayListElement,
                        timeAfterUpdatingLinkedListElement)));
        System.out.println("Difference between durations: " + updatingInterval);

/*************************THE END OF UPDATING ELEMENTS*************************/

/*******************************DELETING ELEMENTS******************************/

/** Fixing the start time */
        LocalDateTime timeBeforeDeletingArrayListElement = LocalDateTime.now();
/** Delete 1000 elements  on the beginning */
        for (int i = 0; i < 1000; i++) {
            arrayIntegers.remove(0);
        }
/** Delete 1000 elements  on the  middle */
        for (int i = 0; i < 1000; i++) {
            arrayIntegers.remove(50_000);
        }
/** Delete 1000 elements  on the end */
        for (int i = 0; i < 1000; i++) {
            arrayIntegers.remove(arrayIntegers.size()-1);
        }
/** Fixing the time after adding integers to list */
        LocalDateTime timeAfterDeletingArrayListElement = LocalDateTime.now();


/** Delete 1000 elements  on the beginning */
        for (int i = 0; i < 1000; i++) {
            linkedIntegers.remove(0);
        }

/** Delete 1000 elements  on the  middle */
        for (int i = 0; i < 1000; i++) {
            linkedIntegers.remove(50_000);
        }
/** Delete 1000 elements  on the end */
        for (int i = 0; i < 1000; i++) {
            linkedIntegers.remove(linkedIntegers.size()-1);
        }
/** Fixing the start time */
        LocalDateTime timeAfterDeletingLinkedListElement = LocalDateTime.now();

/** Comparing time intervals */
        int intervalDeleting = (Duration.between
                (timeAfterDeletingArrayListElement,
                        timeAfterDeletingLinkedListElement))
                .compareTo(Duration.between(timeBeforeDeletingArrayListElement,
                        timeAfterDeletingArrayListElement));

        double deletingInterval = ((intervalDeleting) /= 100);
        deletingInterval /= 10_000_000;

        System.out.println("\nDuration of deleting elements in ArrayList: " +
                (Duration.between(timeBeforeDeletingArrayListElement,
                        timeAfterDeletingArrayListElement)));
        System.out.println("Duration of deleting elements in LinkedList: " +
                (Duration.between(timeAfterDeletingArrayListElement,
                        timeAfterDeletingLinkedListElement)));
        System.out.println("Difference between durations: " + deletingInterval);

/*************************THE END OF DELETING ELEMENTS*************************/
    }
}