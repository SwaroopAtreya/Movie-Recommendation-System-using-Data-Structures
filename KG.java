import java.util.*;

public class KG {

    public static void main(String[] args) {

        ADSCP recommendationSystem = new ADSCP();

        // Add 50 more movies with parameters: title, genres, director, actors, releaseYear
        recommendationSystem.addMovie("Interstellar", "Adventure, Drama, Sci-Fi", "Christopher Nolan", "Matthew McConaughey, Anne Hathaway", 2014);
        recommendationSystem.addMovie("Inception", "Action, Adventure, Sci-Fi", "Christopher Nolan", "Leonardo DiCaprio, Joseph Gordon-Levitt", 2010);
        recommendationSystem.addMovie("The Dark Knight", "Action, Crime, Drama", "Christopher Nolan", "Christian Bale, Heath Ledger", 2008);
        // Add 50 Bollywood and South Indian movies...
        recommendationSystem.addMovie("Baahubali: The Beginning", "Action, Drama", "S.S. Rajamouli", "Prabhas, Rana Daggubati", 2015);
        recommendationSystem.addMovie("Baahubali 2: The Conclusion", "Action, Drama", "S.S. Rajamouli", "Prabhas, Rana Daggubati", 2017);
        recommendationSystem.addMovie("Kabir Singh", "Drama, Romance", "Sandeep Reddy Vanga", "Shahid Kapoor, Kiara Advani", 2019);
        recommendationSystem.addMovie("Arjun Reddy", "Drama, Romance", "Sandeep Reddy Vanga", "Vijay Deverakonda, Shalini Pandey", 2017);
        recommendationSystem.addMovie("Gully Boy", "Drama, Musical", "Zoya Akhtar", "Ranveer Singh, Alia Bhatt", 2019);
        recommendationSystem.addMovie("Padmaavat", "Drama, History", "Sanjay Leela Bhansali", "Deepika Padukone, Ranveer Singh", 2018);
        recommendationSystem.addMovie("Kesari", "Action, Drama, History", "Anurag Singh", "Akshay Kumar, Parineeti Chopra", 2019);
        recommendationSystem.addMovie("Uri: The Surgical Strike", "Action, Drama", "Aditya Dhar", "Vicky Kaushal, Yami Gautam", 2019);
        recommendationSystem.addMovie("Bajrangi Bhaijaan", "Action, Comedy, Drama", "Kabir Khan", "Salman Khan, Kareena Kapoor", 2015);
        recommendationSystem.addMovie("Sultan", "Action, Drama, Sport", "Ali Abbas Zafar", "Salman Khan, Anushka Sharma", 2016);
        recommendationSystem.addMovie("3 Idiots", "Comedy, Drama", "Rajkumar Hirani", "Aamir Khan, Kareena Kapoor", 2009);
        recommendationSystem.addMovie("PK", "Comedy, Drama", "Rajkumar Hirani", "Aamir Khan, Anushka Sharma", 2014);
        recommendationSystem.addMovie("Lagaan", "Adventure, Drama, Musical", "Ashutosh Gowariker", "Aamir Khan, Gracy Singh", 2001);
        recommendationSystem.addMovie("Chak De! India", "Drama, Sport", "Shimit Amin", "Shah Rukh Khan, Vidya Malvade", 2007);
        recommendationSystem.addMovie("Barfi!", "Comedy, Drama, Romance", "Anurag Basu", "Ranbir Kapoor, Priyanka Chopra", 2012);
        recommendationSystem.addMovie("Om Shanti Om", "Action, Comedy, Drama", "Farah Khan", "Shah Rukh Khan, Deepika Padukone", 2007);
        recommendationSystem.addMovie("Golmaal: Fun Unlimited", "Comedy, Drama", "Rohit Shetty", "Ajay Devgn, Arshad Warsi", 2006);
        recommendationSystem.addMovie("Dil Se..", "Drama, Romance", "Mani Ratnam", "Shah Rukh Khan, Manisha Koirala", 1998);
        recommendationSystem.addMovie("Zindagi Na Milegi Dobara", "Comedy, Drama, Romance", "Zoya Akhtar", "Hrithik Roshan, Farhan Akhtar", 2011);
        recommendationSystem.addMovie("Queen", "Comedy, Drama", "Vikas Bahl", "Kangana Ranaut, Rajkummar Rao", 2013);
        recommendationSystem.addMovie("Jodhaa Akbar", "Action, Drama, History", "Ashutosh Gowariker", "Hrithik Roshan, Aishwarya Rai", 2008);
        recommendationSystem.addMovie("Chennai Express", "Action, Comedy, Romance", "Rohit Shetty", "Shah Rukh Khan, Deepika Padukone", 2013);
        recommendationSystem.addMovie("Kabhi Alvida Naa Kehna", "Drama, Romance", "Karan Johar", "Shah Rukh Khan, Rani Mukerji", 2006);
        recommendationSystem.addMovie("My Name is Khan", "Drama", "Karan Johar", "Shah Rukh Khan, Kajol", 2010);
        recommendationSystem.addMovie("Dilwale", "Action, Comedy, Drama", "Rohit Shetty", "Shah Rukh Khan, Kajol", 2015);
        recommendationSystem.addMovie("Devdas", "Drama, Musical, Romance", "Sanjay Leela Bhansali", "Shah Rukh Khan, Aishwarya Rai", 2002);
        recommendationSystem.addMovie("Kal Ho Naa Ho", "Comedy, Drama, Romance", "Nikkhil Advani", "Shah Rukh Khan, Preity Zinta", 2003);
        recommendationSystem.addMovie("Koi... Mil Gaya", "Drama, Fantasy, Romance", "Rakesh Roshan", "Hrithik Roshan, Preity Zinta", 2003);
        recommendationSystem.addMovie("Baazigar", "Crime, Drama, Thriller", "Abbas-Mustan", "Shah Rukh Khan, Kajol", 1993);
        recommendationSystem.addMovie("Mohabbatein", "Drama, Romance, Musical", "Aditya Chopra", "Amitabh Bachchan, Shah Rukh Khan", 2000);
        recommendationSystem.addMovie("Kuch Kuch Hota Hai", "Drama, Romance", "Karan Johar", "Shah Rukh Khan, Kajol", 1998);
        recommendationSystem.addMovie("Dil To Pagal Hai", "Drama, Musical, Romance", "Yash Chopra", "Shah Rukh Khan, Madhuri Dixit", 1997);
        recommendationSystem.addMovie("Main Hoon Na", "Action, Comedy, Drama", "Farah Khan", "Shah Rukh Khan, Sushmita Sen", 2004);
        recommendationSystem.addMovie("Hum Dil De Chuke Sanam", "Drama, Musical, Romance", "Sanjay Leela Bhansali", "Salman Khan, Aishwarya Rai", 1999);
        recommendationSystem.addMovie("Kabhi Haan Kabhi Naa", "Comedy, Drama, Music", "Kundan Shah", "Shah Rukh Khan, Suchitra Krishnamoorthi", 1994);
        recommendationSystem.addMovie("Rangeela", "Comedy, Drama, Romance", "Ram Gopal Varma", "Aamir Khan, Urmila Matondkar", 1995);
        recommendationSystem.addMovie("Rang De Basanti", "Comedy, Drama", "Rakeysh Omprakash Mehra", "Aamir Khan, Soha Ali Khan", 2006);
        recommendationSystem.addMovie("Bhaag Milkha Bhaag", "Biography, Drama, Sport", "Rakeysh Omprakash Mehra", "Farhan Akhtar, Sonam Kapoor", 2013);
        recommendationSystem.addMovie("Delhi-6", "Drama", "Rakeysh Omprakash Mehra", "Abhishek Bachchan, Sonam Kapoor", 2009);
        recommendationSystem.addMovie("Wake Up Sid", "Comedy, Drama, Romance", "Ayan Mukerji", "Ranbir Kapoor, Konkona Sen Sharma", 2009);
        recommendationSystem.addMovie("Rockstar", "Drama, Music, Musical", "Imtiaz Ali", "Ranbir Kapoor, Nargis Fakhri", 2011);
        recommendationSystem.addMovie("Andhadhun", "Crime, Thriller", "Sriram Raghavan", "Ayushmann Khurrana, Tabu", 2018);
        recommendationSystem.addMovie("Article 15", "Crime, Drama, Thriller", "Anubhav Sinha", "Ayushmann Khurrana, Nassar", 2019);
        recommendationSystem.addMovie("Vada Chennai", "Action, Crime, Drama", "Vetrimaaran", "Dhanush, Ameer Sultan", 2018);
        recommendationSystem.addMovie("Super Deluxe", "Comedy, Crime, Drama", "Thiagarajan Kumararaja", "Vijay Sethupathi, Fahadh Faasil", 2019);
        recommendationSystem.addMovie("Kaithi", "Action, Thriller", "Lokesh Kanagaraj", "Karthi, Narain", 2019);
        recommendationSystem.addMovie("Aruvi", "Drama", "Arun Prabu Purushothaman", "Aditi Balan, Anjali Varadhan", 2016);
        recommendationSystem.addMovie("Peranbu", "Drama", "Ram", "Mammootty, Sadhana", 2018);
        recommendationSystem.addMovie("Asuran", "Action, Drama", "Vetrimaaran", "Dhanush, Manju Warrier", 2019);
        recommendationSystem.addMovie("Premam", "Comedy, Drama, Romance", "Alphonse Puthren", "Nivin Pauly, Sai Pallavi", 2015);
        recommendationSystem.addMovie("Lucifer", "Action, Crime, Drama", "Prithviraj Sukumaran", "Mohanlal, Vivek Oberoi", 2019);
        recommendationSystem.addMovie("Bangalore Days", "Comedy, Drama, Romance", "Anjali Menon", "Dulquer Salmaan, Nivin Pauly", 2014);
        recommendationSystem.addMovie("Drishyam", "Crime, Drama, Thriller", "Jeethu Joseph", "Mohanlal, Meena", 2013);
        recommendationSystem.addMovie("Neram", "Action, Comedy, Crime", "Alphonse Puthren", "Nivin Pauly, Nazriya Nazim", 2013);
        recommendationSystem.addMovie("Papanasam", "Crime, Drama, Thriller", "Jeethu Joseph", "Kamal Haasan, Gautami", 2015);
        recommendationSystem.addMovie("Soodhu Kavvum", "Comedy, Crime, Thriller", "Nalan Kumarasamy", "Vijay Sethupathi, Sanchita Shetty", 2013);
        recommendationSystem.addMovie("Ustad Hotel", "Comedy, Drama, Family", "Anwar Rasheed", "Dulquer Salmaan, Thilakan", 2012);

        // Add more movies...

        // Add relationships for the new movies
        recommendationSystem.addRelationships();

        // Recommend movies based on user input
        recommendationSystem.recommendMoviesFromUserInput();
    }
}

class ADSCP {

    Map<String, Node> nodes;
    List<Relationship> relationships;

    public ADSCP() {
        nodes = new HashMap<>();
        relationships = new ArrayList<>();
    }

    public void addMovie(String title, String genres, String director, String actors, int releaseYear) {
        nodes.put(title, new Node(title, genres, director, actors, releaseYear));
    }



    public void addRelationships() {
        // Add relationships based on directors, release years, and actors
        for (Node source : nodes.values()) {
            for (Node target : nodes.values()) {
                if (!source.equals(target)) {
                    if (source.director.equals(target.director)) {
                        relationships.add(new Relationship(source, target, "DIRECTOR"));
                    }
                    if (source.releaseYear == target.releaseYear && !source.equals(target)) {
                        relationships.add(new Relationship(source, target, "RELEASE_YEAR"));
                    }
                    if (!Collections.disjoint(Arrays.asList(source.actors.split(", ")), Arrays.asList(target.actors.split(", ")))) {
                        relationships.add(new Relationship(source, target, "ACTORS"));
                    }
                }
            }
        }
    }

    public List<Node> recommendSimilarMovies(String movieTitle) {
        List<Node> recommendations = new ArrayList<>();
        Node movie = nodes.get(movieTitle);
        if (movie != null) {
            for (Relationship relationship : relationships) {
                if (relationship.source.equals(movie)) {
                    recommendations.add(relationship.target);
                }
            }
        }
        return recommendations;
    }


    public void recommendMoviesFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of a movie:");
        String userInput = scanner.nextLine().trim();

        List<Node> recommendations = recommendSimilarMovies(userInput);
        if (recommendations.isEmpty()) {
            System.out.println("No similar movies found.");
        } else {
            System.out.println("Movies recommended similar to '" + userInput + "'");
            for (Node movie : recommendations) {
                System.out.println(movie.title);
            }
        }

        // Ask user for genre preference
        System.out.println("Do you want to filter recommendations by genre? (yes/no)");
        String filterChoice = scanner.nextLine().trim().toLowerCase();
        if (filterChoice.equals("yes")) {
            System.out.println("Enter your preferred genre:");
            String preferredGenre = scanner.nextLine().trim();

            // Filter recommendations by preferred genre
            List<Node> filteredRecommendations = filterByGenre(recommendations, preferredGenre);
            if (filteredRecommendations.isEmpty()) {
                System.out.println("No movies found in the preferred genre.");
            } else {
                System.out.println("Movies recommended in '" + preferredGenre + "' genre:");
                for (Node movie : filteredRecommendations) {
                    System.out.println(movie.title);
                }
            }
        }
    }

    private List<Node> filterByGenre(List<Node> movies, String genre) {
        List<Node> filteredMovies = new ArrayList<>();
        for (Node movie : movies) {
            if (movie.genres.contains(genre)) {
                filteredMovies.add(movie);
            }
        }
        return filteredMovies;
    }

}


class Node {
    String title;
    String genres;
    String director;
    String actors;
    int releaseYear;

    public Node(String title, String genres, String director, String actors, int releaseYear) {
        this.title = title;
        this.genres = genres;
        this.director = director;
        this.actors = actors;
        this.releaseYear = releaseYear;
    }
}

class Relationship {
    Node source;
    Node target;
    String type;

    public Relationship(Node source, Node target, String type) {
        this.source = source;
        this.target = target;
        this.type = type;
    }
}
