class Person
{
   public int age;


   public Person(int a)
   {
       System.out.println("Person Constructor");
       age = a;
   }


   public int getAge()
   {
       return age;
   }
   public void showData()
   {
       System.out.println("Student's Age is " + age);
   }
}