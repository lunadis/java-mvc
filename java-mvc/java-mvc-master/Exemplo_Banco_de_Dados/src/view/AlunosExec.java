package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {

	public static void main(String[] args) {
		Alunos alunos = new Alunos();
		try {
			alunos.setNome("Augusto Luis ");
			alunos.setEndereco("Av �guia de Haia, 2600");
			alunos.setBairro("Jd S�o Nicolau");
			
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			//alunosJdbcDao.delete(4);
			//alunosJdbcDao.salvar(alunos);
			alunosJdbcDao.update(3, "carlos");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
