package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Kredit;

public interface KreditRepository extends JpaRepository<Kredit, Integer>{
	Collection<Kredit> findByNazivContainingIgnoreCase(String naziv);
}
