package uk.gegc.effectiveJava.part3;


/*Task: Create a class ImmutableStringSet, an immutable class that holds a set of strings. Implement toString that
returns the strings in alphabetical order, equals and hashCode, and write compareTo if you feel necessary. Test:
Use Collections.unmodifiableSet(new TreeSet<>(...)) internally.*/

import java.util.*;

public class ImmutableStringSet implements Comparable<ImmutableStringSet> {

    private final Set<String> set;

    public ImmutableStringSet(Collection<String> strings){
        Set<String> tmp = new TreeSet<>(strings);
        this.set = Collections.unmodifiableSet(tmp);
    }

    @Override
    public int compareTo(ImmutableStringSet o) {
        int result = Integer.compare(this.set.size(), o.set.size());
        if(result == 0){
            Iterator<String> i1 = this.set.iterator();
            Iterator<String> i2 = o.set.iterator();
            while (i1.hasNext() && i2.hasNext()){
                result = i1.next().compareTo(i2.next());
                if(result != 0) return result;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

