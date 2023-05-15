package yogurrr.project.test.DAO.Impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import yogurrr.project.test.DAO.Api.MoviesDAO;
import yogurrr.project.test.DAO.Entity.Movies;

import java.util.List;

@Repository
@Service
public class MoviesDAOImpl implements MoviesDAO {
    @Override
    public boolean insert(Movies movie) {
        return false;
    }

    @Override
    public List<Movies> getAllMovies() {
        return null;
    }

    @Override
    public List<Movies> getAllMoviesByCategory(String cat) {
        return null;
    }

    @Override
    public List<Movies> getAllMoviesByLanguage(String lang) {
        return null;
    }

    @Override
    public List<Movies> getAllMoviesByStatus(String stat) {
        return null;
    }

    @Override
    public List<Movies> getAllMoviesByTitle(String title) {
        return null;
    }

    @Override
    public List<Movies> getAllMoviesById(Long id) {
        return null;
    }

    @Override
    public boolean delete(long movieId) {
        return false;
    }

    @Override
    public boolean update(Movies movie) {
        return false;
    }

    @Override
    public Movies getMovieById(long movieId) {
        return null;
    }
}
