package yogurrr.project.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import yogurrr.project.test.DAO.Entity.Movies;
import yogurrr.project.test.DAO.Impl.MoviesDAOImpl;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    MoviesDAOImpl mi;

    @RequestMapping(value={"/","/index"})
    public ModelAndView getHomePage(Map<String, Object> model){
        ModelAndView m=new ModelAndView("index");
        List<Movies> list1=mi.getAllMoviesByStatus("Released");
        List<Movies> list2=mi.getAllMoviesByStatus("Upcoming");
        List<Movies> list=mi.getAllMovies();
        model.put("list",list);
        model.put("list1",list1);
        model.put("list2",list2);
        return m;
    }

}
