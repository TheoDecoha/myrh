import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.imie.tp.myrh.dao.model.DepartementModel;
import fr.imie.tp.myrh.dao.model.EmployeModel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Utilitaire Date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myRHPersistenceUnit");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		// Création d'un utilisateur
		EmployeModel employee = new EmployeModel();
		
		try {
			employee.setDate_embauche(sdf.parse("16/04/2005"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			employee.setDate_fin_embauche(sdf.parse("19/07/2007"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			employee.setDate_naissance(sdf.parse("26/03/1981"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employee.setNom("Bourne");
		employee.setNumero_secu("14567833568");
		employee.setPrenom("Jason");
		employee.setSalaire((double) 2435);
		
		// On importe l'employé
		entitymanager.persist(employee);
		
		//Création d'un département
		DepartementModel department = new DepartementModel();
		department.setLibelle("Développement");
		
		// On importe le département
		entitymanager.persist(department);
		
		// On fait un select du tuple 2 et on l'affiche dans la console
		//EmployeModel employe_select = entitymanager.find( EmployeModel.class, 2 );
	    //System.out.println("employee ID = " + employe_select.getId());
	    //System.out.println("employee NAME = " + employe_select.getNom());
		
		// On fait stock le résultat dans une liste
		TypedQuery<EmployeModel> query = 
				entitymanager.createNamedQuery("Employe.findAll", EmployeModel.class);
		List<EmployeModel> results = query.getResultList();
		
		// On boucle pour l'afficher
		for (EmployeModel employeModel : results) {
			System.out.println(results.toString());
		}
		
		// On supprimer un employé
		//EmployeModel employedel = entitymanager.findAll( EmployeModel.class, 2 );
	    //entitymanager.remove( employedel );
		
		// Valide les commandes ci-dessus
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}
