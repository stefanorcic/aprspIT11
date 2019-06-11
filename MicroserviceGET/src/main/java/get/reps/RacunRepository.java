package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Racun;
import get.jpa.Klijent;

public interface RacunRepository extends JpaRepository<Racun, Integer>{
	
	Collection<Racun> findByNazivContainingIgnoreCase(String naziv);
	Collection<Racun> findByKlijent(Klijent k);
}
