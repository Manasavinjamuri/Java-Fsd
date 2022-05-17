
public class ChoclateFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Choclate munch = new Choclate("munch",20.00,150,"cover");
		Choclate kitkat=new Choclate("kitkat",10.00,100,"coverbox");
		Choclate fivestar=new Choclate("fivestar",50,130,"cover");
		Choclate dairymilk=new Choclate("dairymilk",200,400,"rapper");
		Choclate perk=new Choclate("perk",30,110,"rapper");

		System.out.println(munch);
		System.out.println(kitkat);
		System.out.println(fivestar);
		System.out.println(dairymilk);
		System.out.println(perk);
		
		if(munch instanceof Choclate && fivestar instanceof Choclate)
		{
			boolean m=munch==fivestar;
			System.out.println(m);
		}
		Choclate c=munch;
		boolean m=c==munch;
		System.out.println(m);
		
		System.out.println(munch.hashCode());
		System.out.println(c.hashCode());
		
	}

}
