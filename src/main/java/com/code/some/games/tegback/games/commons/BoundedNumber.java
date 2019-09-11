package com.code.some.games.tegback.games.commons;

import static org.apache.commons.lang3.Validate.notBlank;
import static org.apache.commons.lang3.Validate.notNull;

import java.text.MessageFormat;

public class BoundedNumber<T extends Number & Comparable<T>> {

  private final String message;
  private final T upperBound;
  private final T lowerBound;
  private T value;

  public BoundedNumber(T value, T lowerBound, T upperBound) {
    this(value, lowerBound, upperBound, "Value should be between {0} and {1} but was {2}.");
  }

  public BoundedNumber(T value, T lowerBound, T upperBound, String messageFormat) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
    this.message = notBlank(messageFormat);
    this.update(value);
  }

  public T get() {
    return this.value;
  }

  public final void update(T value) {
    value = notNull(value);

    if (this.lowerBound.compareTo(value) > 0) {
      throw new IllegalArgumentException(getErrorMessage(value));
    }

    if (this.upperBound.compareTo(value) < 0) {
      throw new IllegalArgumentException(getErrorMessage(value));
    }
    this.value = notNull(value);
  }

  private String getErrorMessage(T value) {
    return MessageFormat.format(this.message, this.upperBound, this.lowerBound, value);
  }

}
