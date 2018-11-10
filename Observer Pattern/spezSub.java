import java.util.ArrayList;
import java.util.List;

public class spezSub implements Subject{
	
	List<IObserver>observerList= new ArrayList<IObserver>();
	double state = 0;

	@Override
	public void register(IObserver o) {
		this.observerList.add(o);
	}

	@Override
	public void remove(IObserver o) {
		this.observerList.remove(o);		
	}

	@Override
	public void benachrichtigen() {
		for (IObserver obs : observerList) {
			obs.update();
		}
		
	}
	
	public double getState() {
		return state;
	}
 
	public void setState(double state) {
		this.state = state;
		this.benachrichtigen();
	}
	
}
