
public class spezObsHausverw implements IObserver{

	private spezSub sp;
	
	public spezObsHausverw(spezSub spez) {
		this.sp = spez;
		this.sp.register(this);
	}
	
	@Override
	public void update() {
		double newstate = sp.getState();
		if(newstate<=10) System.out.println("Hoazn is angsagt!");
		if((newstate>10)&&(newstate<23)) System.out.println("So passts");
		if(newstate>=23) System.out.println("Seits es wahnsinnig! Es is zu warm!");
	}

}
