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

    // TODO -- you fill in here by replacing the null with an
    // initialization of ReentrantReadWriteLock.
    private ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock(true);

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
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
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
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
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
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
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
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
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
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
    }
}

