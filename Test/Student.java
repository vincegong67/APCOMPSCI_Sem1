public class Student extends Person
{
   public int grade;
   public Student(int g, int a)
   {
       super(a);
       grade = g;
       System.out.println("Student Constructor");
   }
   public int getGrade()
   {
       return grade;
   }
   public void showData()
   {
       super.showData();
       System.out.println("Student's Grade is " + grade);
   }
   public static void main(String[]args)
   {
	   Person sue = new Person(32);
Student tom = new Student(12, 25);
sue.showData();
tom.showData();
   }
}
