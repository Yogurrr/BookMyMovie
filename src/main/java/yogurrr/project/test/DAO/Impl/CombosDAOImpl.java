package yogurrr.project.test.DAO.Impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import yogurrr.project.test.DAO.Api.CombosDAO;
import yogurrr.project.test.DAO.Entity.Combos;

import java.util.List;

@Repository
@Service
public class CombosDAOImpl implements CombosDAO {
    @Override
    public boolean insert(Combos combo) {
        return false;
    }

    @Override
    public List<Combos> getAllCombos() {
        return null;
    }

    @Override
    public boolean delete(long comboId) {
        return false;
    }

    @Override
    public boolean update(Combos combo) {
        return false;
    }

    @Override
    public Combos getComboById(long comboId) {
        return null;
    }
}
