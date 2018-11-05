package Test;

import controle.AlunoDao;
import controle.DiretorDao;
import controle.ProfessorDao;
import controle.ResponsavelDao;
import junit.framework.TestCase;
import org.easymock.Mock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestePesistencia extends TestCase {

    @Mock
    private AlunoDao alunoDao;
    @Mock
    private DiretorDao diretorDao;
    @Mock
    private ProfessorDao professorDao;
    @Mock
    private ResponsavelDao responsavelDao;


    @Before
    public void init(){
        alunoDao = new AlunoDao();
        diretorDao = new DiretorDao();
        professorDao = new ProfessorDao();
        responsavelDao = new ResponsavelDao();


    }

    @Test
    public void test(){
        Assert.assertNotNull(alunoDao.getAll());
        Assert.assertNull(alunoDao.getAll());

        Assert.assertNotNull(diretorDao.getAll());
        Assert.assertNull(diretorDao.getAll());

        Assert.assertNotNull(professorDao.getAll());
        Assert.assertNull(professorDao.getAll());

        Assert.assertNotNull(responsavelDao.getAll());
        Assert.assertNull(responsavelDao.getAll());
    }

}
