package myCorrection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

public class MyArrayList implements List, RandomAccess {

  private static final int DEFAULT_SIZE = 10;
  private Object[] elementData;
  private int size;

  public MyArrayList() {
    elementData = new Object[DEFAULT_SIZE];
  }

  public MyArrayList(int initialCapacity) {
    if (initialCapacity >= 0) {
      elementData = new Object[initialCapacity];
    } else {
      throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
    }
  }

  public MyArrayList(Collection c) {
    elementData = c.toArray();
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(Object o) {
    return indexOf(o) >= 0;
  }

  @Override
  public Iterator iterator() {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public Object[] toArray() {
    return Arrays.copyOf(elementData, size);
  }

  @Override
  public Object[] toArray(Object[] a) {
    // DO NOT NEED TO IMPLEMENT
    return new Object[0];
  }

  @Override
  public boolean add(Object o) {
    if (size == elementData.length) {
      elementData = grow(size + 1);
    }
    elementData[size] = o;
    size++;
    return true;
  }

  private Object[] grow(int minCapacity) {
    return elementData = Arrays.copyOf(elementData, minCapacity + minCapacity / 2);
  }

  @Override
  public boolean remove(Object o) {
    Object[] es = elementData;
    int size = this.size;
    int i = 0;
    found:
    {
      if (o == null) {
        for (; i < size; i++) {
          if (es[i] == null) {
            break found;
          }
        }
      } else {
        for (; i < size; i++) {
          if (o.equals(es[i])) {
            break found;
          }
        }
      }
      return false;
    }
    final int newSize;
    if ((newSize = size - 1) > i) {
      System.arraycopy(es, i + 1, es, i, newSize - i);
    }
    es[size = newSize] = null;
    return true;
  }

  @Override
  public boolean containsAll(Collection c) {
    // TODO: Implement Me
    return false;
  }

  @Override
  public boolean addAll(Collection c) {
    // TODO: Implement Me
    return false;
  }

  @Override
  public boolean addAll(int index, Collection c) {
    if (index > size || index < 0) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    Object[] a = c.toArray();
    int numNew = a.length;
    if (numNew == 0) {
      return false;
    }
    Object[] elementData;
    final int s;
    if (numNew > (elementData = this.elementData).length - (s = size)) {
      elementData = grow(s + numNew);
    }

    int numMoved = s - index;
    if (numMoved > 0) {
      System.arraycopy(elementData, index,
          elementData, index + numNew,
          numMoved);
    }
    System.arraycopy(a, 0, elementData, index, numNew);
    size = s + numNew;
    return true;
  }

  @Override
  public boolean removeAll(Collection c) {
    boolean complement = false;
    int from = 0;
    int end = size;
    final Object[] es = elementData;
    int r;
    for (r = from; ; r++) {
      if (r == end) {
        return false;
      }
      if (c.contains(es[r]) != complement) {
        break;
      }
    }
    int w = r++;
    try {
      for (Object e; r < end; r++) {
        if (c.contains(e = es[r]) == complement) {
          es[w++] = e;
        }
      }
    } catch (Throwable ex) {
      System.arraycopy(es, r, es, w, end - r);
      w += end - r;
      throw ex;
    } finally {
      System.arraycopy(es, end, es, w, size - end);
      for (int to = size, i = (size -= end - w); i < to; i++) {
        es[i] = null;
      }
    }
    return true;
  }

  @Override
  public boolean retainAll(Collection c) {
    // TODO: Implement Me
    return false;
  }

  @Override
  public void clear() {
    for (int i = 0; i < size; i++) {
      elementData[i] = null;
    }
  }

  @Override
  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    return elementData[index];
  }

  @Override
  public Object set(int index, Object element) {
    Objects.checkIndex(index, size);
    Object oldValue = elementData[index];
    elementData[index] = element;
    return oldValue;
  }

  @Override
  public void add(int index, Object element) {
    final int s;
    Object[] elementData;
    if ((s = size) == (elementData = this.elementData).length) {
      elementData = grow(size + 1);
    }
    System.arraycopy(elementData, index,
        elementData, index + 1,
        s - index);
    elementData[index] = element;
    size = s + 1;
  }

  @Override
  public Object remove(int index) {
    Objects.checkIndex(index, size);
    final Object[] es = elementData;

    Object oldValue = es[index];
    final int newSize;
    if ((newSize = size - 1) > index) {
      System.arraycopy(es, index + 1, es, index, newSize - index);
    }
    es[size = newSize] = null;
    return oldValue;
  }

  @Override
  public int indexOf(Object o) {
    int start = 0;
    int end = size;
    Object[] es = elementData;
    if (o == null) {
      for (int i = start; i < end; i++) {
        if (es[i] == null) {
          return i;
        }
      }
    } else {
      for (int i = start; i < end; i++) {
        if (o.equals(es[i])) {
          return i;
        }
      }
    }
    return -1;
  }

  @Override
  public int lastIndexOf(Object o) {
    int start = 0;
    int end = size;
    Object[] es = elementData;
    if (o == null) {
      for (int i = end - 1; i >= start; i--) {
        if (es[i] == null) {
          return i;
        }
      }
    } else {
      for (int i = end - 1; i >= start; i--) {
        if (o.equals(es[i])) {
          return i;
        }
      }
    }
    return -1;
  }

  @Override
  public ListIterator listIterator() {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public ListIterator listIterator(int index) {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public List subList(int fromIndex, int toIndex) {
    // TODO: Implement Me
    return null;
  }
}