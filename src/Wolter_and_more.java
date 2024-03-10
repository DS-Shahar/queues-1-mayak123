package test;
import java.util.Scanner; 
public class ball_main {
	 Scanner input = new Scanner(System.in); 
	  
	public static void main(String[] args) {
		String[]arr = {"blue","red","white","yellow","gold"};
		Queue<Ball>q = fill(arr,100);
		q.insert(null);
		while(q.head()!=null)
		{
			System.out.print(q.head().toString()+", ");
		}
		boolean flag = false;
		int count = 0;
		int a = mikum(q,"gold");
		while(!flag)
		{
			System.out.println("guess");
			if(g==mikum)
		}
	}
	
	public static Queue<Ball> fill(String[] a, int n)
	{
		boolean[] size= {true,false};
		Queue<Ball>q = new Queue<Ball>();
		boolean b;
		for (int i = 0; i < n; i++) 
		{
			int color = (int)((Math.random()*(a.length)));
			int flag = (int)((Math.random()*(2)));
			Ball ball = new Ball(a[color],size[flag]);
			q.insert(ball);
				
		}
		return q;
	}
	
	public static int mikum(Queue<Ball>q,Ball b)
	{
		q.insert(null);
		int count = 1;
		int r = count;
		boolean flag = false;
		while(q.head()!=null)
		{
			if(b.toString().equals(q.head().toString())&& flag==false)
			{
				r = count;
				flag = true;
			}
			count++;
			q.insert(q.remove());
		}
		q.remove();
		return r;
	}
	
	
	
	
	

}
package test;

public class test1 {

	public static void main(String[] args) {
		Wolter a = new Wolter("111",2);
		Wolter b = new Wolter("222",1);
		Wolter c = new Wolter("333",5);
		Wolter d = new Wolter("444",2);
		Wolter e = new Wolter("555",10);
		Wolter f = new Wolter("666",20);
		Wolter g = new Wolter("777",20);
		
		Wolter[]arr = {a,b,c,d,e,f,g};
		Queue <Wolter> q = build(arr);
		System.out.println(find(q, 11));
		while(!q.isEmpty())
		{
			System.out.println(q.remove().getId());
		}

	}
	public static Queue build(Wolter[]arr)
	{
		Queue <Wolter> q = new Queue<Wolter>();
		for (int i = 0; i < arr.length; i++) {
			q.insert(arr[i]);
		}
		return q;
	}
	
	public static String find(Queue<Wolter>q, int c1)
	{
		q.insert(null);
		String r = "not found";
		boolean b = false;
		while(q.head()!=null)
		{
			if(q.head().getCc()>=c1 && b==false)
			{
				r = "id: "+ q.remove().getId();
				b = true;
				
			}
			q.insert(q.remove());
		}
		q.remove();
		return r;
	}

}
