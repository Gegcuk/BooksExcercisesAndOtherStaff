package uk.gegc.effectiveJava.part4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;


/*Task: Write a wrapper class InstrumentedSet<E> for Set<E> that counts the number
 of calls to add. Demonstrate how it works with HashSet<E> and TreeSet<E>.*/
public class InstrumentSet<E> implements Set<E> {
    private final Set<E> s;
    private int addCount;

    public InstrumentSet(Set<E> s) {
        this.s = s;
    }

    public int getAddCount() {
        return addCount;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return s.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return s.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
