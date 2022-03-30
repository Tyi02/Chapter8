package com.CSCI185;

/**
 *Derive a class BulkDiscount from DiscountPolicy. It should have a constructor that has
 * two parameters minimum and percent.
 * It should define the method computeDiscount
 * so that if the quantity purchased of an item is more then minimum, the discount is percent percent.
 */
public class BulkDiscount implements DiscountPolicy {

    private int minimum;
    private double percent;

    public BulkDiscount(int minimum, double percent)
    {
        this.minimum = minimum;
        this.percent = percent;
    }
    public double computeDiscount(int count, double itemCost)
    {
        if(count>=minimum)
        {
            return count * itemCost * percent;
        }
        else
        {
            return 0;
        }
    }
}
