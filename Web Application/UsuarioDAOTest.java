import static org.junit.Assert.assertEquals;

import java.util.List;

import org.dbunit.Assertion;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.util.fileloader.FlatXmlDataFileLoader;
import org.junit.Before;
import org.junit.Test;

import model.Usuario;
import model.UsuarioDAO;

public class UsuarioDAOTest {
	
	JdbcDatabaseTester jdt;

	@Before
	public void setUp() throws Exception {
		
		jdt = new JdbcDatabaseTester("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/webapplication?user=root&password=Rafaelbessa1");
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		jdt.setDataSet(loader.load("/inicio.xml"));
		jdt.onSetup();
	}

	
	@Test
	public void inserirUsuarioTest() throws Exception {
		Usuario u = new Usuario("testelogin", "teste@email.com", "testenome", "testesenha", 0);
		UsuarioDAO ud = new UsuarioDAO();
		ud.inserir(u);
		
		IDataSet currentDataset = jdt.getConnection().createDataSet();
		ITable currentTable = currentDataset.getTable("usuario");
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		IDataSet expectedDataset = loader.load("/verificaInsercao.xml");
		ITable expectedTable = expectedDataset.getTable("usuario");
		Assertion.assertEquals(expectedTable, currentTable);
	}
	
	@Test
	public void adicionarPontosUsuarioTest() throws Exception {
		UsuarioDAO ud = new UsuarioDAO();
		ud.adicionarPontos("rafaelb", 10);
		
		IDataSet currentDataset = jdt.getConnection().createDataSet();
		ITable currentTable = currentDataset.getTable("usuario");
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		IDataSet expectedDataset = loader.load("/adicionaPontos.xml");
		ITable expectedTable = expectedDataset.getTable("usuario");
		Assertion.assertEquals(expectedTable, currentTable);
	}
	
	@Test
	public void recuperarUsuarioTest() throws Exception {
		UsuarioDAO ud = new UsuarioDAO();
		Usuario u = ud.recuperar("rafaelb");
		
		assertEquals("Rafael", u.getNome());
		assertEquals("rafael@email.com", u.getEmail());
		assertEquals("senha", u.getSenha());
		
	}
	
	@Test
	public void rankingUsuariosTest() throws Exception {
		
		Usuario u = new Usuario("testelogin", "teste@email.com", "testenome", "testesenha", 20);
		UsuarioDAO ud = new UsuarioDAO();
		ud.inserir(u);
		
		IDataSet currentDataset = jdt.getConnection().createDataSet();
		ITable currentTable = currentDataset.getTable("usuario");
		FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
		IDataSet expectedDataset = loader.load("/ranking.xml");
		ITable expectedTable = expectedDataset.getTable("usuario");
		Assertion.assertEquals(expectedTable, currentTable);
		
		List<Usuario> lista = ud.ranking();
		assertEquals("testenome", lista.get(0).getNome());
		assertEquals("Rafael", lista.get(1).getNome());
		
		
	}


}
