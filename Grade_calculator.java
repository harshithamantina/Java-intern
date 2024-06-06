import java.util.*;
public class Grade_calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("**********STUDENT GRADE TRACKER**********");
        System.out.println("Enter number of students:");
        int num=sc.nextInt();
        int[] maths=new int[num+1];
        int[] physics=new int[num+1];
        int[] chemistry=new int[num+1];
        float[] avg=new float[num+1];
        int[] sum=new int[num+1];
        int i;
        System.out.println("Enter Maths marks:");
        for(i=1;i<=num;i++)
        {
            System.out.print("Enter Student "+i+" Grade:");
            maths[i]=sc.nextInt();
            
        }
        System.out.println("Enter Physics marks:");
        for( i=1;i<=num;i++)
        {
            System.out.print("Enter Student "+i+" Grade:");
            physics[i]=sc.nextInt();
    
        }
        System.out.println("Enter Chemistry marks:");
        for(i=1;i<=num;i++)
        {
            System.out.print("Enter Student "+i+" Grade:");
            chemistry[i]=sc.nextInt();
        }
        for(i=1;i<=num;i++){
            sum[i]=maths[i]+physics[i]+chemistry[i];
            
        }

        for(i=1;i<=num;i++){
            avg[i]=sum[i]/3;
        }
        float highest=avg[1];
        float lowest=avg[1];
        for(i=1;i<=num;i++){
            if(avg[i]>highest)
                highest=avg[i];
            else if(avg[i]<lowest)
                lowest=avg[i];    
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Roll no\t|\tMaths\t|\tPhysics\t|\tChemistry|\t Sum\t|\tAverage|");
        System.out.println("----------------------------------------------------------------------------------------");
        for(i=1;i<=num;i++)
        {
            System.out.printf("|%d\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t%.3f|\n",i,maths[i],physics[i],chemistry[i],sum[i],avg[i]);
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Highest Score:"+highest);
        System.out.println("Lowest Score:"+lowest);
    }
}
