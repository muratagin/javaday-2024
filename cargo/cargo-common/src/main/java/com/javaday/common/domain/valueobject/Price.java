package com.javaday.common.domain.valueobject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Price {
    private final BigDecimal amount;

    public static final Price ZERO = new Price(BigDecimal.ZERO);

    public Price(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Price add(Price price) {
        return new Price(setScale(this.amount.add(price.getAmount())));
    }

    public Price subtract(Price price) {
        return new Price(setScale(this.amount.subtract(price.getAmount())));
    }

    public boolean isGreaterThanZero() {
        return this.amount != null && this.amount.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isGreaterThan(Price price) {
        return this.amount != null && this.amount.compareTo(price.getAmount()) > 0;
    }

    public Price multiply(int multiplier) {
        return new Price(setScale(this.amount.multiply(new BigDecimal(multiplier))));
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return amount.equals(price.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    private BigDecimal setScale(BigDecimal input) {
        return input.setScale(2, RoundingMode.HALF_EVEN);
    }
}
