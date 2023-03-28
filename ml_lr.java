import java.util.*;
class ml_lr
{
    //public static double[] height= new double[5];
    //public static double[] weight= new double[5];
    public static double height[] ={1.5,1.6,1.7,1.8,1.95};
    public static double weight[]={43.1,53.0,63.0,72.6,82.5};
    public static double xh;
    public static double yw;
    public static double b;
    public static double bo;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your height in feet then space inches to know the estimated weight");
        double u=sc.nextDouble();//input height in feet
        double q=sc.nextDouble();//input height in inches
        double m=(u*12+q)*0.0254;//conversion into metre
        ml_lr ob=new ml_lr();
        ob.cal();
        ob.cal2(m);
        
        
    }
    
        
    public static void cal()
    {
        double c=0.0;
        double t=0.0;
        for(int a=0;a<5;a++)
        {
            c=c+height[a];
            t=t+weight[a];
        }
        xh=c/5;
        yw=t/5;
        double xb=0.0;
        double yb=0.0;
        for(int i=0;i<5;i++)
        {
            xb=xb+((height[i]-xh)*(weight[i]-yw));
            yb=yb+((height[i]-xh)*(height[i]-xh));
        }
        b=xb/yb;
        bo=yw-b*xh;
    }
    public static void cal2(double m)
    {
        
        double x=b*m+bo;
        System.out.println("the estimated weight of the person "+x+" kg");
    }
}