import java.util.Scanner;
//import java.Math.*;

public class MArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Area o=new Area();
		while(true)
		{
			System.out.println("press 1 to find area of triangle\npress 2 to find area of circle\npress 3 to find area of rectangle\npress 4 to find area of square\npress 5 to quit\n");
			int choise=s.nextInt();
			
			if(choise==5)
				break;
			if(choise==1)
			{
				int a=s.nextInt();
				int b=s.nextInt();
				int c=s.nextInt();
				o.area(a,b,c);
			}
			
			else if(choise==2 || choise==4)
			{
				float a=s.nextFloat();
				o.area(a,choise);
			}
			
			else if(choise==3)
			{
				int a=s.nextInt();
				int b=s.nextInt();
				o.area(a,b);
			}
			
		}
		
	}

}

class Area
{
	public void area(int a,int b,int c)
	{
		float sp=(float)(a+b+c)/2;
		double ar=(sp*(sp-a)*(sp-b)*(sp-c));
		ar=Math.sqrt(ar);
		System.out.println(ar);
	}
	
	public void area(float r, int choise)
	{ 
		if(choise==2)
		{
			float ar=(float)(3.14*r*r);
			System.out.println(ar);
		}
		else
		{
			System.out.println((int)(r*r));
		}
	}
	
	public void area(int a,int b)
	{
		int ar=a*b;
		System.out.println(ar);
	}
	
	
}

