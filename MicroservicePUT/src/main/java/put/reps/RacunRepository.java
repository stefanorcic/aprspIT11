package put.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import put.jpa.Racun;
import put.jpa.Klijent;

public interface RacunRepository extends JpaRepository<Racun, Integer>{
	
	Collection<Racun> findByNazivContainingIgnoreCase(String naziv);
	Collection<Racun> findByKlijent(Klijent k);
}
