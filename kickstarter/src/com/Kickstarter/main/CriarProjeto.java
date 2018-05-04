package com.Kickstarter.main;

import java.util.Scanner;

public class CriarProjeto {
	private String description;
	private String recompense;
	private String reward;
	private String status;
	
	public void setAttributes(){
		Scanner in = new Scanner(System.in);
		// Set First Name
		System.out.println("Descrição do projeto");
		this.description = in.nextLine();
		// Set Last Name
		System.out.println("Recompensas");
		this.reward = in.nextLine();
		
	}


}
