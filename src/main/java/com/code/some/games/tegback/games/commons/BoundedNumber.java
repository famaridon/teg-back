package com.code.some.games.tegback.games.commons;

import static org.apache.commons.lang3.Validate.notNull;

public class BoundedNumber<T extends Number & Comparable<T>> {

  private final T upperBound;
  private final T lowerBound;
  private T value;

  public BoundedNumber(T value, T lowerBound, T upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
    this.update(value);
  }

  public T get() {
    return this.value;
  }

  public final void update(T value) {
    value = notNull(value);

    if (this.lowerBound.compareTo(value) > 0) {
      throw new IllegalArgumentException();
    }

    if (this.upperBound.compareTo(value) < 0) {
      throw new IllegalArgumentException();
    }
    this.value = notNull(value);
  }

}
