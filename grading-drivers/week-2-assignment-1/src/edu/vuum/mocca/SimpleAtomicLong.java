<<<<<<< HEAD
=======
// Import the necessary Java synchronization and scheduling classes.

>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a
package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
<<<<<<< HEAD
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
=======
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a

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
<<<<<<< HEAD
    
    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */

    // TODO -- you fill in here by replacing the null with an
    // initialization of ReentrantReadWriteLock.
    private ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock(true);
=======


    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
    // TODO - add the implementation
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
<<<<<<< HEAD
    public SimpleAtomicLong(long initialValue)
    {
        // TODO -- you fill in here
    	this.mValue = initialValue;
    }

    /**
     * @brief Gets the current value.
     * 
     * @returns The current value
     */
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
    public SimpleAtomicLong(long initialValue) {
        // TODO - you fill in here
    }

    /**
     * @brief Gets the current value
     * 
     * @returns The current value
     */
    public long get() {
        // TODO - you fill in here
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD
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
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD
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
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD
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
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD
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
>>>>>>> e6ce687312e84847b20fe3ce3c1a549bc9fc138a
    }
}

