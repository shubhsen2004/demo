class Student
{
    String name;
    int rollno;
    String branch;
    
    // default constructor or non parametrise constructor
    Student(){
    System.out.println("Default costructor or without parameterise constructor is called");
    this.name = "Shubham";
    this.rollno = 2447073;
    this.branch = "Master Of Computer Application";
    }
    //   parametrise constructer 
    Student(String Name, int Rollnumber, String Branchname){
        System.out.println("parameterise constructor is called");
   
        this.name = Name;
        this.rollno = Rollnumber;
        this.branch = Branchname;
    }

    //method to  display student details
    public void Studentdetails()
    {
        System.out.println("My name is "+ this.name +
                             "\nmy roll number is " +this.rollno + 
                             "\nmy branch is "+ this.branch+"\n");
    }
}
public class constructor {
    public static void main(String [] args)
    {
        Student s1 = new Student();
        // System.out.println("Use default constructer");
          s1.Studentdetails(); // Call the instance method
        Student s2=new Student("Tanay ",2447095,"Master of Computer Application");

         s2.Studentdetails();
    }
}
