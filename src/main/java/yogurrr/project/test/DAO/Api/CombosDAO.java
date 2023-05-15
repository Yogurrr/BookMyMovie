package yogurrr.project.test.DAO.Api;

import yogurrr.project.test.DAO.Entity.Combos;

import java.util.List;

public interface CombosDAO {
    public boolean insert(Combos combo);
    public List<Combos> getAllCombos();
    public boolean delete(long comboId);
    public boolean update(Combos combo);
    public Combos getComboById(long comboId);
}
