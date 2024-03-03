public static void main(String[] args) {
		Wolter wolt1 = new Wolter ("1987",33);
		Wolter wolt2 = new Wolter ("9876",44);
		Wolter wolt3 = new Wolter ("2765",55);
		Queue <Wolter> q = new Queue ();
		q.insert(wolt1);
		q.insert(wolt2);
		q.insert(wolt3);
		System.out.println(find(q, 34));
	Job job1 = new Job ("1987",30);
		Job job2 = new Job ("9876",60);
		Job job3 = new Job ("2765",55);
		Job job4 = new Job ("1234", 40);
		Queue <Job> q = new Queue ();
		q.insert(job1);
		q.insert(job2);
		q.insert(job3);
		q.insert(job4);
		enough(q, 85);

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
	
	public static void enough (Queue <Job> q, int time1) {
		q.insert(null);
		while (q.head()!=null) {
			if(q.head().getTime()<= time1) {
				time1 = time1 - q.head().getTime();
				System.out.println(time1);
				System.out.println(q.remove().getId());
				
			}
			else {
				q.insert(q.remove());
			}
		}
		q.remove();
	}
				
	}




