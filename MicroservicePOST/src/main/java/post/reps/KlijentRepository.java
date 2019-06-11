package post.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import post.jpa.Klijent;

public interface KlijentRepository extends JpaRepository<Klijent, Integer>{
	Collection<Klijent> findByPrezimeContainingIgnoreCase(String prezime);
}
