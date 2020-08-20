package controller;

import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main {

	public static void main(String args[]) {
		
		
		SkillDAO sd = new SkillDAO();
		List<Skill> skill =  sd.listAllSkills();
		for (Skill skill2 : skill) {
			System.out.println(skill2.getSkilld()+")"+ " "+skill2.getSkillName());
		}
	}
}
