package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;
import edu.campusnum.visualsort.model.Order;


/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:32
 */
public class BubbleSort implements SortAlgorithm {

    @Override
    public void sort(ObservableArray array) {

        boolean change = true;

        while (change) {
                change = false;
            for (int i = 0; i < array.getLength()-1; i++) {

                if (array.compare(i, i+1)== Order.Higher ) {
                    array.swap(i,i+1);
                    change = true;
                }
            }
        }

    }

}
