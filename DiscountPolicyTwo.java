package com.CSCI185;

public abstract class DiscountPolicyTwo {
    /**
     * computes the discount for a given number of items at
     * a price.
     * @param count - How many items you are purchasing.
     * @param itemCost - How much the item costs.
     * @return - Total discount from the price.
     */
    public abstract double computeDiscount(int count, double itemCost);
}
