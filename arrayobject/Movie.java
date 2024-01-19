package arrayobject;
import java.util.Comparator;

public class Movie {
        private int yearReleased;
        private double rating;
        private double budget;
        private double collectionAmount;
        public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
            this.yearReleased = yearReleased;
            this.rating = rating;
            this.budget = budget;
            this.collectionAmount = collectionAmount;
        }
        public int getYearReleased() {
            return yearReleased;
        }

        public double getRating() {
            return rating;
        }

        public double getBudget() {
            return budget;
        }

        public double getCollectionAmount() {
            return collectionAmount;
        }
        public static Comparator<Movie> ratingAndProfitComparator = Comparator
                .comparingDouble(Movie::getRating)
                .thenComparingDouble(movie -> movie.collectionAmount - movie.budget);
        public static Comparator<Movie> yearReleasedAndRatingComparator = Comparator
                .comparingInt(Movie::getYearReleased)
                .thenComparingDouble(Movie::getRating);
        public static void main(String[] args) {
            Movie movie1 = new Movie(2000, 8.5, 50.0, 120.0);
            Movie movie2 = new Movie(2010, 7.8, 80.0, 150.0);
            Movie movie3 = new Movie(2005, 9.0, 30.0, 100.0);

            // Sorting by rating and profit
            int result1 = Movie.ratingAndProfitComparator.compare(movie1, movie2);

            // Sorting by year released and rating
            int result2 = Movie.yearReleasedAndRatingComparator.compare(movie1, movie3);

            // Output the results
            System.out.println("Sorting by rating and profit: " + result1);
            System.out.println("Sorting by year released and rating: " + result2);
        }
    }
