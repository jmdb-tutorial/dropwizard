package jmdb.tutorial.dropwizard.app.helloworld;

public class AtomicLong {

    private long value = 0;

    public synchronized long incrementAndGet() {
        value++;
        return value;
    }
}