package com.CSCI185;

/**
 * 2. Create an interface DiscountPolicy. It should have a single method computeDiscount that
 * will return the discount for the purchase of a given number of a single item. The method
 * has two parameters, count and itemCost.
 */
public interface DiscountPolicy {
    /**
     * computes the discount for a given number of items at
     * a price.
     * @param count - How many items you are purchasing.
     * @param itemCost - How much the item costs.
     * @return - Total discount from the price.
     */
    public double computeDiscount(int count, double itemCost);
}


