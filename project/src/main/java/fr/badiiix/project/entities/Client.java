package fr.badiiix.project.entities;

import jakarta.persistence.*;

/**
 * mourad.ouziri, 2024
 */

@Entity
@Table(name="Clients")
public class Client {
	@Id @GeneratedValue
	private Long identifiant;
	@Column (nullable = false)
	private String nom;
	@Column (nullable = false)
	private String ville;
	
	// ce constructeur sans param�tres est obligatoire pour la persistance (JPA)
	public Client() {	
	}
	
	// constructeur non obligatoire
	public Client(String nom, String ville) {	
		this.nom = nom;
		this.ville = ville;
	}

	// getters et setters obligatoires
	public Long getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
}
