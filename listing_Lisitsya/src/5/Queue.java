class Queue {
    private char q[];
    private int putloc;
    private int getloc;

    Queue(int size) {
        q = new char[size + 1];
        getloc = putloc = 0;
    }

    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        System.arraycopy(ob.q, 0, q, 0, ob.q.length);
    }

    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++)
            put(a[i]);
    }

    boolean isFull() {
        return (putloc == (q.length - 1));
    }

    boolean isEmpty() {
        return (getloc == putloc);
    }

    void put(char ch) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Очередь переполнена.");
        }
        putloc++;
        q[putloc] = ch;
    }
    char get() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Fronta je pr6zdn6.");
        }
        getloc++;
        return q[getloc];
    }
}