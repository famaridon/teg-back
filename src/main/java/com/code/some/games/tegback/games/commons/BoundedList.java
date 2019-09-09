package com.code.some.games.tegback.games.commons;

import static org.apache.commons.lang3.Validate.notBlank;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class BoundedList<T> implements List<T> {

  private final String message;
  private final int maxSize;
  private final int minSize;
  private final List<T> values;

  public BoundedList(List<T> values, int minSize, int maxSize) {
    this(values, minSize, maxSize, "List should have {0} to {1}");
  }

  public BoundedList(List<T> values, int minSize, int maxSize, String messageFormat) {
    this.minSize = minSize;
    this.maxSize = maxSize;
    this.message = MessageFormat.format(notBlank(messageFormat), this.minSize, this.maxSize);
    if (values.size() < this.minSize) {
      throw new IllegalArgumentException(this.message);
    }
    this.values = new ArrayList<>(maxSize);
    this.addAll(values);
  }

  private boolean isTooLarge(int elementsToAdd) {
    return this.values.size() + elementsToAdd > this.maxSize;
  }

  private boolean isTooSmall(int elementsToRemove) {
    return this.values.size() - elementsToRemove < this.minSize;
  }

  @Override
  public int size() {
    return values.size();
  }

  @Override
  public boolean isEmpty() {
    return values.isEmpty();
  }

  @Override
  public boolean contains(Object o) {
    return values.contains(o);
  }

  @Override
  public Iterator<T> iterator() {
    return values.iterator();
  }

  @Override
  public Object[] toArray() {
    return values.toArray();
  }

  @Override
  public <T1> T1[] toArray(T1[] a) {
    return values.toArray(a);
  }

  @Override
  public boolean add(T t) {
    if (this.isTooLarge(1)) {
      throw new IllegalArgumentException(this.message);
    }
    return values.add(t);
  }

  @Override
  public boolean remove(Object o) {
    if (this.isTooSmall(1)) {
      throw new IllegalArgumentException(this.message);
    }
    return values.remove(o);
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return values.containsAll(c);
  }

  @Override
  public boolean addAll(Collection<? extends T> c) {
    if (isTooLarge(c.size())) {
      throw new IllegalArgumentException(this.message);
    }
    return values.addAll(c);
  }

  @Override
  public boolean addAll(int index, Collection<? extends T> c) {
    if (isTooLarge(c.size())) {
      throw new IllegalArgumentException(this.message);
    }
    return values.addAll(index, c);
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    if (this.isTooSmall(c.size())) {
      throw new IllegalArgumentException(this.message);
    }
    return values.removeAll(c);
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return values.retainAll(c);
  }

  @Override
  public void replaceAll(UnaryOperator<T> operator) {
    values.replaceAll(operator);
  }

  @Override
  public void sort(Comparator<? super T> c) {
    values.sort(c);
  }

  @Override
  public void clear() {
    values.clear();
  }

  @Override
  public T get(int index) {
    return values.get(index);
  }

  @Override
  public T set(int index, T element) {
    return values.set(index, element);
  }

  @Override
  public void add(int index, T element) {
    values.add(index, element);
  }

  @Override
  public T remove(int index) {
    if (this.isTooSmall(1)) {
      throw new IllegalArgumentException(this.message);
    }
    return values.remove(index);
  }

  @Override
  public int indexOf(Object o) {
    return values.indexOf(o);
  }

  @Override
  public int lastIndexOf(Object o) {
    return values.lastIndexOf(o);
  }

  @Override
  public ListIterator<T> listIterator() {
    return values.listIterator();
  }

  @Override
  public ListIterator<T> listIterator(int index) {
    return values.listIterator(index);
  }

  @Override
  public List<T> subList(int fromIndex, int toIndex) {
    return values.subList(fromIndex, toIndex);
  }

  @Override
  public Spliterator<T> spliterator() {
    return values.spliterator();
  }

  @Override
  public boolean removeIf(Predicate<? super T> filter) {
    return values.removeIf(filter);
  }

  @Override
  public Stream<T> stream() {
    return values.stream();
  }

  @Override
  public Stream<T> parallelStream() {
    return values.parallelStream();
  }

  @Override
  public void forEach(Consumer<? super T> action) {
    values.forEach(action);
  }
}
