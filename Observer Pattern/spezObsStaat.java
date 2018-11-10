
public class spezObsStaat implements IObserver{

	private spezSub sp;
	
	public spezObsStaat(spezSub spez) {
		this.sp = spez;
		this.sp.register(this);
	}
	
	@Override
	public void update() {
		double newstate = sp.getState();
		if(newstate<=15) System.out.println("Hoazn is angsagt!");
		if((newstate>15)&&(newstate<25)) System.out.println("So passts");
		if(newstate>=25) System.out.println("Seits es wahnsinnig! Es is zu warm!");
	}

}
