public static void main(String[] args) {
		Wolter wolt1 = new Wolter ("1987",33);
		Wolter wolt2 = new Wolter ("9876",44);
		Wolter wolt3 = new Wolter ("2765",55);
		Queue <Wolter> q = new Queue ();
		q.insert(wolt1);
		q.insert(wolt2);
		q.insert(wolt3);
		System.out.println(find(q, 34));

	}
	public static String find(Queue <Wolter> q, int cc1) {
		q.insert(null);
		boolean b = false;
		String r = "";
		while(q.head()!=null) {
			if (q.head().getCc()>cc1 && b==false){
				r=q.remove().getId();
				b=true;
			}
			q.insert(q.remove());
			}
		q.remove();
		return r;
		}
				
	}
