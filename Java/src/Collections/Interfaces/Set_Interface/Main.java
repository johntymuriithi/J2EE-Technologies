package Collections.Interfaces.Set_Interface;

/**
 *               Notes on Set Interface
 *
 *               This is where equality, hashing, ordering and contracts really matters
 *                public interface Set<E> extends Collection<E>
 *
 *               - A Set is a collection which does not allow duplicates ~ It don't have additional adds on (methods of its own)
 *               - if a.equals(b) = true then MUST a.hashCode() == b.hashcode(); otherwise everything breaks (that depend
 *                 on the hashcode e.g remove(), contains() etc;
 *               - HashSet is the fastest
 *
 *               What "No Duplicates" Actually Means
 *               - Duplicates are determined using: equals() not ==  e.i "A".equals("A)
 *               - Two objects in Sets implementations(most), Two objects are considered duplicates if a.equals(b) == true
 *                 and a.hashCode() == b.hashCode(), if you break this contract in custom objects, your set will behave incorrectly
 *               - In custom objects, if you don't override equals/hashCode, may end up with duplicates coz default equals
 *                 compares memory address and hashCode() --> memory-based hash;
 *
 *               Fields used in equals/hashCode should be:
                    ~ Immutable Or never changed while in hash-based collections
                      This is why IDs and natural keys are preferred.
 *
 *
 *
 */
public class Main {
}