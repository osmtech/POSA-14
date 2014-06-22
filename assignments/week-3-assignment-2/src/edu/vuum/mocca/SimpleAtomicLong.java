package edu.vuum.mocca;

package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/**
 * @class SimpleAtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;


    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java

    // TODO -- you fill in here by replacing the null with an
    // initialization of ReentrantReadWriteLock.
    private ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock(true);
=======
    // TODO - add the implementation
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    public SimpleAtomicLong(long initialValue)
    {
        // TODO -- you fill in here
    	this.mValue = initialValue;
=======
    public SimpleAtomicLong(long initialValue) {
        // TODO - you fill in here
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Gets the current value
     * 
     * @returns The current value
     */
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    public long get()
    {
        long value;

        // TODO -- you fill in here
        ReadLock rl = mRWLock.readLock();
        try
        {
        	rl.lock();
        	value = mValue;
        }
        finally
        {
        	rl.unlock();
        }
        
        return value;
=======
    public long get() {
        // TODO - you fill in here
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    public long decrementAndGet()
    {
        long value = 0;
    	WriteLock lock = mRWLock.writeLock();
    	try	
    	{
    		lock.lock();
    		value = --mValue;
    	}
    	finally
    	{
    		lock.unlock();
    	}
        // TODO -- you fill in here

        return value;
=======
    public long decrementAndGet() {
        // TODO - you fill in here
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    public long getAndIncrement()
    {
        long value = 0;

        // TODO -- you fill in here
        WriteLock lock = mRWLock.writeLock();
    	try	
    	{
    		lock.lock();
    		value = mValue++;
    	}
    	finally
    	{
    		lock.unlock();
    	}
        return value;
=======
    public long getAndIncrement() {
        // TODO - you fill in here
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    public long getAndDecrement()
    {
        long value = 0;

        WriteLock lock = mRWLock.writeLock();
    	try	
    	{
    		lock.lock();
    		value = mValue--;
    	}
    	finally
    	{
    		lock.unlock();
    	}

        return value;
=======
    public long getAndDecrement() {
        // TODO - you fill in here
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    public long incrementAndGet()
    {
        long value = 0;

         WriteLock lock = mRWLock.writeLock();
    	try	
    	{
    		lock.lock();
    		value = ++mValue;
    	}
    	finally
    	{
    		lock.unlock();
    	}

        return value;
=======
    public long incrementAndGet() {
        // TODO - you fill in here
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    }
}

