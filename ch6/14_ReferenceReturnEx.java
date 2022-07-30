class Data { int x; }

class ReferenceReturnEx {
	public static void main(String[] args) 
	{
		Data d = new Data();
		d.x = 10;

		Data d2 = copy(d); //10
		System.out.println("d.x ="+d.x);	//10
		System.out.println("d2.x="+d2.x);	//10
	}

	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;

		return tmp;
	}
}
