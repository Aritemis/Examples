/**
 * A simple class that represents a process in an operating system.
 */
public class Process
{
    public enum State {READY, RUNNING, BLOCKED};

    private String command;
    private int processId;
    private State state;

    public Process(String command, int processId, State state) {
        this.command = command;
        this.processId = processId;
        this.state = state;
    }
    
    public boolean equals(Process other)
    {
    	boolean same = false;
    	if(this != null && other != null)
    	{
    		if(this.command.equals(other.command) && this.state.equals(other.state))
    		{
    			same = true;
    		}
    	}
    	return same;
    }
}
