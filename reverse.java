
public class reverse {
	public int revers(int num)
	{
		int n,t,rem,rev=0;
	for(n=num;n>0;n++)
		{
   
    t=num/10;
	rem=num%10;
	rev=rev*10+rem;
	num=t;
	num--;
    
}
	System.out.println("reverse="+rev);
	return rev;
	}

	public static void main(String args[]){
		 
			reverse out= new reverse();
			out.revers(123);
		
	
}
}
