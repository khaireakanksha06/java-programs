import java.util.*;
class Interest{
        void calculateSI(double p,double r,double t){
                System.out.println("Simple interest="+(p*r*t)/100);
        }
        static void DisplayDetails(double p,double r,double t){
                System.out.println("double p:"+ p );
                System.out.println("double r:"+ r);
                System.out.println("double t:"+ t);

        }
        public static void main(String[] args){
                Scanner sc= new Scanner(System.in);
                System.out.print("Enter principle:");
                double p =sc.nextDouble();

                System.out.print("Enter rate:");
                double r =sc.nextDouble();

                System.out.print("Enter time:");
                double t =sc.nextDouble();

                Interest obj=new Interest();

                obj.DisplayDetails(p,r,t);
                obj.calculateSI(p,r,t);

        }
}
