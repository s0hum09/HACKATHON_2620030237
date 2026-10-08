import java.util.Scanner;
class Student{
    
    String name;
    int rollnum;
    int marks;
    String course;
    int credits;
    boolean Eligibility;
    double fee;

    Student(String name , int rollnum , int marks, String course, int credits ){
        this.name = name;
        this.rollnum = rollnum;
        this.marks = marks;
        this.course = course;
        this.credits = credits;
    }

    
    void calculateFee(){
        double fee = 1500*credits;
    }
     void checkEligibility(){
            if(marks>=50){
                 Eligibility = true;
                System.out.println(Eligibility);
            }
            else{
                 Eligibility = false;
                System.out.println(Eligibility);
            }

    }
    double finalFee;

    void calculateFinalFee(){
                fee = 1500*credits;
                 finalFee = fee;
        if(marks>=85){
            finalFee = fee*0.8;
        }
        else if(marks>=70 && marks<=80){
            finalFee =fee*0.9;
        }

    }
    String calculateScholarship2() {
    if (marks >= 85) {
        return "20% Scholarship";
    } else if (marks >= 70 && marks <= 80) {
        return "10% Scholarship";
    } else {
        return "No Scholarship";
    }
}
        
    void displayDetails(String calculateScholarship2){
        System.out.println("Name of the Student is: " + name);
        System.out.println("Roll Num is: " + rollnum);
        System.out.println("Marks Obtained is: " + marks);
        System.out.println("Course is : " + course);
        System.out.println("Credits Obtained are: " + credits);
        System.out.println("Scholarship Eligibility: " + Eligibility);
        System.out.println("Total Fee for Course is: " + fee);
        System.out.println("Scholarship Recieved is: " + calculateScholarship2);
        System.out.println("The Final Fees is: " + finalFee);
    }
}
public class Hackathon2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Roll Num:");
        int rollnum = sc.nextInt();
        System.out.println("Enter Marks: ");
        int marks = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Course: ");
        String course = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Credits Recieved: ");
        int credits = sc.nextInt(); 

        Student s1 = new Student(name, rollnum, marks, course, credits);

        s1.calculateFinalFee();
        s1.checkEligibility();
s1.displayDetails(s1.calculateScholarship2());
    }
}
