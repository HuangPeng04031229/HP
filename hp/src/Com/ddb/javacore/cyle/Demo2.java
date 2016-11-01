package Com.ddb.javacore.cyle;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("三角形行数：" + args[0]);
		int n = Integer.parseInt(args[0]);//设置参数
		for(int i=1;i<=n;i++)  //控制行数                                  
		{
			
			for (int k=1;k<=i;k++)
				System.out.print(" ");
			for (int j=1;j<=2*(n-i)+1;j++)
					System.out.print("*");
			
			    System.out.println();
			}
}
}