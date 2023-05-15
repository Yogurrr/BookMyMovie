package yogurrr.project.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import yogurrr.project.test.DAO.Entity.Combos;
import yogurrr.project.test.DAO.Impl.CombosDAOImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Controller
public class BookingController {

    @Autowired
    CombosDAOImpl cdi;

    @RequestMapping(value="/selectCombos",method= RequestMethod.GET)
    public ModelAndView selectCombos(HttpServletRequest request, Map<String, Object> model){
        String st[];
        st= request.getParameterValues("seat");
        List<String> list=new ArrayList<String>();
        long count=st.length;
        for(int i=0;i<count;i++){
            list.add(st[i]);
        }
        String seats="";
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            seats = seats + itr.next()+", ";
        }
        long total = count * 150;
        List<Combos> l = cdi.getAllCombos();
        model.put("list",l);
        ModelAndView m=new ModelAndView("select-combos");
        m.addObject("price",total);
        m.addObject("seats",seats);
        m.addObject("count",count);
        return m;
    }
}
