class example{
	public static void main(String[] args){
		int[] array = new int[]{0,9999,-1,20,10,20,300,400};
		findMinandMax(array);
	}
	public static void findMinandMax(int[] array){
		int minimum=array[0],maximum=array[0];
		for(int number:array){
			if(number<minimum)
				minimum=number;
		}
		for(int number:array){
			if(number>maximum)
				maximum=number;
		}
		System.out.println("Minimum : "+minimum+ " Maximum :"+
		maximum);
	}
}
