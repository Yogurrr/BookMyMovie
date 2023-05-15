package yogurrr.project.test.DAO.Api;

import yogurrr.project.test.DAO.Entity.Movies;

import java.util.List;

public interface MoviesDAO {
    public boolean insert(Movies movie);
    public List<Movies> getAllMovies();
    public List<Movies> getAllMoviesByCategory(String cat);
    public List<Movies> getAllMoviesByLanguage(String lang);
    public List<Movies> getAllMoviesByStatus(String stat);
    public List<Movies> getAllMoviesByTitle(String title);
    public List<Movies> getAllMoviesById(Long id);
    public boolean delete(long movieId);
    public boolean update(Movies movie);
    public Movies getMovieById(long movieId);
}
