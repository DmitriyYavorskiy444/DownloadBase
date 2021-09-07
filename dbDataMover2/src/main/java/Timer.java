public class Timer
{
    private long mInitialTime;

    public Timer()
    {
        start();
    }

    public void start()
    {
        mInitialTime = System.currentTimeMillis();
    }

    public String end(String description)
    {
        long finalTime = System.currentTimeMillis() - mInitialTime;
        return description + ": total time " + finalTime;
    }
}