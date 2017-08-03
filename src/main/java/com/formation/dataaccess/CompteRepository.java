package com.formation.dataaccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.formation.model.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {

	public List<Compte> findByOwnerLike(String nom);

	public Compte getByNumeroEquals(String compteid);
	
	//public int setFixed

}
