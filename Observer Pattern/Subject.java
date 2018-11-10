
public interface Subject {

	public abstract void register(IObserver o);
	public abstract void remove(IObserver o);
	public abstract void benachrichtigen();
}
