import java.util.Scanner;
interface Resume {
    // TODO: Declare method void biodata();
    void biodata();
}

class Teacher implements Resume {
    // Attributes
    String name;
    String quali;
    int experience;
    Teacher(String name,String quali,int exp)
    {
        this.name = name;
        this.quali = quali;
        this.experience = exp;
    }
   
    public void biodata()
    {
        System.out.println("Name: "+name);
        System.out.println("Qualification: "+quali);
        System.out.println("Experience: "+experience+" years");
    }
    // TODO: Implement biodata() method to print details in the required format
}

public class InterfaceResume {
   
        
        // TODO: Read input (Name, Qualification, Experience)
        // Assign to teacher object attributes
        
        // TODO: Call teacher.biodata()
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String name = sc.nextLine();
            String quali = sc.nextLine();
            int exp = sc.nextInt();
            Teacher t1 = new Teacher(name,quali,exp);
            t1.biodata();


        }
    
}
