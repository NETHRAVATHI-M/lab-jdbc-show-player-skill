package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	@SuppressWarnings("null")
	public List< Skill > listAllSkills () {
		
		    ArrayList<Skill> skills = new ArrayList<Skill>();
		    Skill skill= null;
		    ConnectionManager con = new ConnectionManager();
		    try {
		        
		       
		        String s = "SELECT ID, NAME FROM SKILL ORDER BY NAME ASC";
		        Statement st = ConnectionManager.getConnection().createStatement();
		        
		        ResultSet rs = st.executeQuery(s);
		        

		        while (rs.next()) {
		        	
		        	int id = rs.getInt("ID");
		        String str =rs.getString("NAME");
		            skill = new Skill(id, str);
		            skills.add(skill);
		        }

		        rs.close();
		    } catch (Exception e) {
		        System.out.println(e);
		    }

		    return skills;
		}
	
	
}
