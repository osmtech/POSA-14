package edu.vuum.mocca;

import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;

/**
 * @class SimpleSemaphore
 *
 * @brief This class provides a simple counting semaphore
 *        implementation using Java a ReentrantLock and a
 *        ConditionObject.  It must implement both "Fair" and
 *        "NonFair" semaphore semantics, just liked Java Semaphores. 
 */
public class SimpleSemaphore {
    /**
     * Constructor initialize the data members.  
     */
    public SimpleSemaphore (int permits,
                            boolean fair)
    { 
        // TODO - you fill in here
    	numberOfPermits = permits;
    	criticalLock = new ReentrantLock(fair);
    	conditionObject =  criticalLock.newCondition();
    }

    /**
     * Acquire one permit from the semaphore in a manner that can
     * be interrupted.
     */
    public void acquire() throws InterruptedException {
        // TODO - you fill in here
    	criticalLock.lockInterruptibly();
    	try
    	{
	    	while(numberOfPermits<=0) {
	    		conditionObject.await();
	    	}
	    	numberOfPermits--;
	    	
    	}
    	finally{
    		criticalLock.unlock();
    	}
    }

    /**
     * Acquire one permit from the semaphore in a manner that
     * cannot be interrupted.
     */
    public void acquireUninterruptibly() {
        // TODO - you fill in here
    	criticalLock.lock();
    	try
    	{
	    	while(numberOfPermits<=0) {
	    		conditionObject.awaitUninterruptibly();
	    	}
	    	numberOfPermits--;
	    	
    	}
    	finally{
    		criticalLock.unlock();
    	}

    }
    
    /**
     * Return one permit to the semaphore.
     */
    void release() {
        // TODO - you fill in here
    	criticalLock.lock();
    	try
    	{
        	numberOfPermits++;
        	conditionObject.signal();
    	}
    	finally
    	{
    		criticalLock.unlock();
    	}
    }

    /**
     * Define a ReentrantLock to protect the critical section.
     */
    // TODO - you fill in here
    ReentrantLock criticalLock;
    /**
     * Define a ConditionObject to wait while the number of
     * permits is 0.
     */
    // TODO - you fill in here
    Condition  conditionObject;

    /**
     * Define a count of the number of available permits.
     */
    // TODO - you fill in here
    volatile int numberOfPermits;
    public int availablePermits() {
        // TODO - you fill in here by changing null to the appropriate
        // return value.
        return numberOfPermits;
    }
}

