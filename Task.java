
package cecs220_a3_p6;


public class Task implements Priority 
{
    private String taskName;
    private int prio;
    
    public Task(String job)
    {
        taskName = job;
    }
    public void setPriority(int priority)
    {
        prio = priority;
    }
    public int getPriority()
    {
        return prio;
    }
    public String toString()
    {
        return (taskName + "\t" +  prio);
    }
}

