import java.util.*;
class Gradecalculator
{
void grade(int a)
{
    if(a>=90 && a<=100)
        {
            System.out.println("Grade Obtained O");
        }
        else if(a>=80 && a<90)
        {
            System.out.println("Grade  Obtained A+");
        }
        else if (a >=70 &&  a<=80)
        {
            System.out.println("Grade  Obtained A");
        }
        else if(a>=60 && a <70 )
        {
            System.out.println("Grade  Obtained B+");
        }
        else if(a>=55 && a<60)
        {
            System.out.println("Grade obtained B");
        }
        else if(a>=50 && a<55)
        {
            System.out.println("Grade Obtained C");
        }
        else
        {
            System.out.println("Grade Obtained U");
        }
}

public static void main(String args[])
{
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the total number of Subjects:");
    int subject=obj.nextInt();
    int total=0;
    for(int i=1;i<=subject;i++)
    {
        System.out.print("Mark" + i+ ":");
        int mark=obj.nextInt();
        total=total+mark;
    }
    System.out.println("Total Marks="+total);
    int average;
    average=total/subject;
    System.out.println("Average Percentage is:"+average);
    Gradecalculator Object=new Gradecalculator();
    Object.grade(average);

}

}