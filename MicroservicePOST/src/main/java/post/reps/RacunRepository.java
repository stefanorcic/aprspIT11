package post.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import post.jpa.Racun;
import post.jpa.Klijent;

public interface RacunRepository extends JpaRepository<Racun, Integer>{
	
	Collection<Racun> findByNazivContainingIgnoreCase(String naziv);
	Collection<Racun> findByKlijent(Klijent k);
}
