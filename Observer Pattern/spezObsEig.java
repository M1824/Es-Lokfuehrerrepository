import java.util.ArrayList;
import java.util.List;

public class spezObsEig implements IObserver{

	private spezSub sp;
	
	public spezObsEig(spezSub spez) {
		this.sp = spez;
		this.sp.register(this);
	}
	
	@Override
	public void update() {
		double newstate = sp.getState();
		if(newstate<=5) System.out.println("Hoazn is angsagt!");
		if((newstate>5)&&(newstate<20)) System.out.println("So passts");
		if(newstate>=20) System.out.println("Seits es wahnsinnig! Es is zu warm!");
	}



}
