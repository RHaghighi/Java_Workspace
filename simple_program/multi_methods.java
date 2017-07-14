class multi_methods{
	public static void main(String argc[]){		
		int y[]={1,2,3,4};
		change(y);

		for(int i=0;i<y.length;i++){
			System.out.println(y[i]);
		}
	}

	public static void change(int x[]){
		for (int i=0;i<x.length;i++){
			x[i] += 5;
		}
	}
}
