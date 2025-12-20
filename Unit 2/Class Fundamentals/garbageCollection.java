/*Java automatically manages memory through garbage collection, 
 which removes objects that are no longer referenced.
 Objects with no references are marked for collection
 Garbage collector (GC) runs periodically (non-deterministic)
 You can suggest GC: System.gc() (but not guaranteed
*/
public class garbageCollection {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        garbageCollection s1 = new garbageCollection();
        garbageCollection s2 = new garbageCollection();

        // Make objects eligible for GC
        s1 = null;
        s2 = null;

        // Request GC (not guaranteed)
        System.gc();
    }
}
