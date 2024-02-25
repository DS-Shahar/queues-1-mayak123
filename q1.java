public static boolean q1(Queue <Integer> q, int x) {
		boolean flag =false;
		Queue <Integer> p = new Queue <Integer> ();
		int count =0;
		while (!q.isEmpty()) {
			while (q.head()==x) {
				count++;
				p.insert(q.remove());
			}
			if( count>1)
				flag = true;
			count=0;
			p.insert(q.remove());	
		}
		while (!p.isEmpty()) {
			q.insert(p.remove());	
		}
		return flag;
	}
