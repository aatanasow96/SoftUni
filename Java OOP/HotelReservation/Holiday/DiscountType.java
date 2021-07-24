package Holiday;

public enum DiscountType {
    VIP(20),
    SECOND_VISIT(10),
    NONE(0);

    private int percentageDiscount;

    DiscountType(int percentageDiscount)
    {
        this.percentageDiscount=percentageDiscount;
    }

    public int getPercentageDiscount() {
        return percentageDiscount;
    }
}
