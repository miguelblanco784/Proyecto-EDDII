/*package proyecto.eddii;

import java.security.Key;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class B_Tree {

    private static final int M = 4;

    private Node raiz;      
    private int altura;     
    private int cantllaves;           

    private static final class Node {

        private int   m;                             // number of children
        private Entry[] children = new Entry[M];   // the array of children

        private Node(int k) {
            m = k;
        }
    }

    private static class Entry {

        private Comparable key;
        private final Object val;
        private Node next;     // helper field to iterate over array entries

        public Entry(Comparable key, Object val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public B_Tree() {
        raiz = new Node(0);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return cantllaves;
    }

    public int altura() {
        return altura;
    }

    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("argument to get() is null");
        }
        return search(raiz, key, altura);
    }

    private Value search(Node x, Key key, int ht) {
        Entry[] children = x.children;

        // external node
        if (ht == 0) {
            for (int j = 0; j < x.m; j++) {
                if (eq((Comparable) key, children[j].key)) {
                    return (Value) children[j].val;
                }
            }
        } // internal node
        else {
            for (int j = 0; j < x.m; j++) {
                if (j + 1 == x.m || less((Comparable) key, children[j + 1].key)) {
                    return search(children[j].next, key, ht - 1);
                }
            }
        }
        return null;
    }

    public void put(Key key, Value val) {
        if (key == null) {
            throw new IllegalArgumentException("argument key to put() is null");
        }
        Node u = insert(raiz, key, val, altura);
        cantllaves++;
        if (u == null) {
            return;
        }

        // need to split raiz
        Node t = new Node(2);
        t.children[0] = new Entry(raiz.children[0].key, null, raiz);
        t.children[1] = new Entry(u.children[0].key, null, u);
        raiz = t;
        altura++;
    }

    private Node insert(Node h, Key key, Value val, int ht) {
        int j;
        Entry t = new Entry((Comparable) key, val, null);

        // external node
        if (ht == 0) {
            for (j = 0; j < h.m; j++) {
                if (less((Comparable) key, h.children[j].key)) {
                    break;
                }
            }
        } // internal node
        else {
            for (j = 0; j < h.m; j++) {
                if ((j + 1 == h.m) || less((Comparable) key, h.children[j + 1].key)) {
                    Node u = insert(h.children[j++].next, key, val, ht - 1);
                    if (u == null) {
                        return null;
                    }
                    t.key = u.children[0].key;
                    t.next = u;
                    break;
                }
            }
        }

        for (int i = h.m; i > j; i--) {
            h.children[i] = h.children[i - 1];
        }
        h.children[j] = t;
        h.m++;
        if (h.m < M) {
            return null;
        } else {
            return split(h);
        }
    }

    private Node split(Node h) {
        Node t = new Node(M / 2);
        h.m = M / 2;
        for (int j = 0; j < M / 2; j++) {
            t.children[j] = h.children[M / 2 + j];
        }
        return t;
    }

    public String toString() {
        return toString(raiz, altura, "") + "\n";
    }

    private String toString(Node h, int ht, String indent) {
        StringBuilder s = new StringBuilder();
        Entry[] children = h.children;

        if (ht == 0) {
            for (int j = 0; j < h.m; j++) {
                s.append(indent + children[j].key + " " + children[j].val + "\n");
            }
        } else {
            for (int j = 0; j < h.m; j++) {
                if (j > 0) {
                    s.append(indent + "(" + children[j].key + ")\n");
                }
                s.append(toString(children[j].next, ht - 1, indent + "     "));
            }
        }
        return s.toString();
    }

    private boolean less(Comparable k1, Comparable k2) {
        return k1.compareTo(k2) < 0;
    }

    private boolean eq(Comparable k1, Comparable k2) {
        return k1.compareTo(k2) == 0;
    }
}
*/