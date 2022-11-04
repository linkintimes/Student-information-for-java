public class Student {
    // Instance variables
    private String lastName;
    private String firstName;
    private String favGame;
    private String favArtist;
    private String town;
    private String favSubject;
    private String destination;

    // Constructor
    public Student(String lN, String fN, String fG, String fA, String t, String fS, String d){
        lastName = lN;
        firstName = fN;
        favGame = fG;
        favArtist = fA;
        town = t;
        favSubject = fS;
        destination = d;
    }

    // Getters

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getFavGame(){
        return favGame;
    }
    public String getTown(){
        return town;
    }
    public String getFavSubject(){
        return favSubject;
    }
    public String getDestination(){
        return destination;
    }
    public String getFavArtist(){
        return favArtist;
    }

    // Setters

    public void setLastName(String lN){
        lastName = lN;
    }
    public void setFirstName(String fN){
        firstName = fN;
    }
    public void setFavGame(String fG){
        favGame = fG;
    }
    public void setTown(String t){
        town = t;
    }
    public void setFavSubject(String fS){
        favSubject = fS;
    }
    public void setDestination(String d){
        destination = d;
    }
    public void setFavArtist(String fA){
        favArtist = fA;
    }

    // Methods
    public String returnDetails(){ // Returns full user details inputted
        return ("Name: " + firstName + " " + lastName + " | Favorite Game: " + favGame + " | Favorite artist: " + favArtist + " | Lives in: " + town + " | Favorite Subject: " + favSubject + " | Going to " + destination + " after high school");
    }

    public String returnNameTown(){ // Return Name and Town they live in
        return ("Name: " + firstName + " " + lastName + " | Town: " + town);
    }

    public static void getAllBrockton(Student[] arr){ // Gathers information for all students living in brockton
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getTown() != null){
                if (arr[i].getTown() == "Brockton"){
                    arr[i].returnDetails();
                }
            }

        }
    }
    // NOTE: Has to be uppercase
    public static void ArtistAtoM(Student[] arr){ // Returns all favorite artists that begin with the letter A through the letter M; has to be uppercase
        for (int i = 0; i < arr.length; i++){
            String firstletter = arr[i].getFavArtist().substring(0, 1);
            if (firstletter == "A" | firstletter == "B" | firstletter == "C" | firstletter == "D" | firstletter == "E" | firstletter == "F" | firstletter == "G" | firstletter == "H" | firstletter == "I" | firstletter == "J" | firstletter == "L" | firstletter == "M"){
                System.out.println("Name: " + arr[i].firstName + " " + arr[i].lastName + " | Artist: " + arr[i].getFavArtist());
            }
        }
    }
    public static void getGameContainsLetterB(Student[] arr){
        for (int i = 0; i < arr.length; i++){
            String favGame = arr[i].getFavGame().substring(0, 1);
            if (favGame == "b" | favGame == "B"){
                System.out.println(arr[i].getFavGame());
            }
        }
    }

}
