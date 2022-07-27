class Array2{
	public static void main(String...args){
		/*int []ar=new int[]{34,23,67,8,9,33};
		int n=33;
		int i;
		for(i=0;i<ar.length;i++){
			if(ar[i]==n){
				System.out.println("number found at the index"+i);
			break;
			}
		
			else{
				System.out.println("number not present");
			}
			if(i==ar.length)
				System.out.println("number not found");
			
			}
			System.out.println(i);*/
			int ar[][]=new int[3][3];
			ar[1][2]=20;
			for(int i=0;i<ar.length;i++){
				for(int j=0;j<ar[i].length;j++){
					System.out.println(ar[i][j]+"");
				}
			}
}
}
	
			