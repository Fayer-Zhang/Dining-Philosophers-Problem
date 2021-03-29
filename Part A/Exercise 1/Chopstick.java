public class Chopstick {
	private int 	ID;
	private boolean free;
	// hint: use a local variable to indicate whether the chopstick is free 
	//                        (lying on the table), e.g.  private boolean free;

	Chopstick(int ID) {
		this.ID = ID;
		free = true;	
	}
	
	synchronized void take() {
		while(!free)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}

		free = false;
	}
	
	synchronized void release() {
		free =  true;
		notify();
	}
	    
	public int getID() {
	    return(ID);
	}
}
