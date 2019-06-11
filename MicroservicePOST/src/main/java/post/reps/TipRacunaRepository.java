package post.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import post.jpa.TipRacuna;

public interface TipRacunaRepository extends JpaRepository<TipRacuna, Integer>{
	
	Collection<TipRacuna> findByNazivContainingIgnoreCase(String naziv);
}
