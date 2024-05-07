public class Movie {
    String Title;
    int year;
    String Genre;
    int Rating;


    public Movie(String Title, int year, String Genre, int Rating) {
        this.Title = Title;
        this.year = year;
        this.Genre = Genre;
        this.Rating = Rating;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }


    public String toString() {
        return String.format("TITLE: %s  YEAR: %d GENRE: %s RATING %d",Title,year,Genre,Rating);
    }
    public boolean equals(Object o){
        Movie temp=(Movie) o;
        return temp.Title.equals(this.Title) && temp.year==this.year && temp.Genre.equals(this.Genre) && temp.Rating==this.Rating;
    }
}
