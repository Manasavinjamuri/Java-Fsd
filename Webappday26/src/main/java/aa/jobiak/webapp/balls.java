package aa.jobiak.webapp;
 import java.util.*;
public class balls {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> balls=new HashMap<String, Integer>();
		Random r=new Random();
		
		
		String colours[]= {"white","red","green","blue"};
		ArrayList<String> white=new ArrayList<String>();
		ArrayList<String> red=new ArrayList<String>();
		ArrayList<String> green=new ArrayList<String>();
		ArrayList<String> blue=new ArrayList<String>();
		
		String bag[]=new String[1000];
		for(int i=0;i<1000;i++)
		{
			bag[i]=colours[r.nextInt(4)];
		}
		
		
		  for(int i=0;i<bag.length;i++) 
		  { 
			  
			  //balls.replace(bag[i],(balls.get(bag[i])+1));
			  if(bag[i].equals("white"))
			  {
				  white.add(bag[i]);
			  }
			  else if(bag[i].equals("red"))
			  {
				  red.add(bag[i]);
			  }
			  else if(bag[i].equals("green"))
			  {
				  green.add(bag[i]);
			  }
			  else if(bag[i].equals("blue"))
			  {
				  blue.add(bag[i]);
			  }
			  
		  }
		  balls.put("white",white.size());
			balls.put("red",red.size());
			balls.put("green",green.size());
			balls.put("blue",blue.size());
		 
		System.out.println(white.size()+" "+red.size()+" "+green.size()+" "+blue.size()); 
		System.out.println(balls);

	}

}