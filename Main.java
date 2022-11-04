import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean isDone = false;
        Student StudentArray[] = new Student[10];

        // Tests in the array
        StudentArray[0] = new Student("Beckwith", "Asher", "Legend of Zelda", "Louie Zong", "Mansfield", "Computer Science", "Work");
        StudentArray[1] = new Student("Daniel", "Courtney", "Deltarune", "Toby Fox", "Mansfield", "Computer Science", "College");
        StudentArray[2] = new Student("Lobo", "Jason", "Yakuza", "Mariah Carey", "Brockton", "Computer Science", "College");


        System.out.println("Welcome to Student Info Tracking Program! ");

        while (!isDone){
            int index = 0;
            for (int i = 0; i < StudentArray.length; i++){ // checks list for number of values in list
                if (!(StudentArray[i] == null)){
                    index++;
                }
            }
            System.out.println("Enter information here: ");
            // user inputs
            System.out.println("First Name: ");
            String firstName = sc.nextLine(); 
    
            System.out.println("Last Name: ");
            String lastName = sc.nextLine(); 
    
            System.out.println("Favorite Game: ");
            String favGame = sc.nextLine(); 
    
            System.out.println("Favorite Artist: ");
            String favArtist = sc.nextLine(); 
            
            System.out.println("Favorite Subject: ");
            String favSubject = sc.nextLine(); 
            
            System.out.println("Town: ");
            String town = sc.nextLine();
    
            System.out.println("Where are you going after high school (College, Work, Military)");
            String destination = sc.nextLine();
    
            // Displays information
    
            StudentArray[index] = new Student(lastName, firstName, favGame, favArtist, town, favSubject, destination);

            System.out.println("Done? ");
            String userDone = sc.nextLine();

            if (userDone.equals("y")){
                isDone = true;
                System.out.println("Goodbye! ");
            }
            else if(userDone.equals("n")){
                index++;
            }
            else {
                System.out.println("Wrong Input");
                index++;
            }
        }
        Student.getAllBrockton(StudentArray); // Returns all students living in brockton
        Student.getGameContainsLetterB(StudentArray); // Returns games with letter b
        Student.ArtistAtoM(StudentArray); // Artist from A to M
        
        sc.close();

    }
}
