package get.ctrls;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import get.jpa.Klijent;
import get.jpa.Kredit;
import get.jpa.Racun;
import get.jpa.TipRacuna;
import get.reps.KlijentRepository;
import get.reps.KreditRepository;
import get.reps.RacunRepository;
import get.reps.TipRacunaRepository;



@RestController
public class GETRestController {

	@Autowired
	private KlijentRepository klijentRepository;
	

	@Autowired
	private KreditRepository kreditRepository;
	

	@Autowired
	private RacunRepository racunRepository;
	
	@Autowired
	private TipRacunaRepository tipRacunaRepository;
	
	
	@GetMapping("klijent")
	@ApiOperation(value = "VraÃ„â€¡a kolekciju svih klijenata iz baze podataka")
	public Collection<Klijent> getKlijent(){
		System.out.println("!!!!!!!!!!!!!!!!!!!!TTEST ");
		return klijentRepository.findAll();
	}
	
	@GetMapping("klijent/{id}")
	@ApiOperation(value = "VraÃ„â€¡a Klijenta iz baze podataka Ã„ï¿½iji je id vrednost prosleÃ„â€˜ena kao path varijabla")
	public Klijent getKlijent(@PathVariable("id") Integer id){
		return klijentRepository.getOne(id);
	}
	
	@GetMapping("klijentPrezime/{prezime}")
	@ApiOperation(value = "VraÃ„â€¡a Klijenta iz baze podataka koji u prezimenu sadrÃ…Â¾i string prosleÃ„â€˜en kao path varijabla")
	public Collection<Klijent> getKlijentByNaziv(@PathVariable("prezime") String prezime){
		return klijentRepository.findByPrezimeContainingIgnoreCase(prezime);
	}
	
	
	
	
	
	@GetMapping("kredit")
	@ApiOperation(value = "VraÃ„â€¡a kolekciju svih kredita iz baze podataka")
	public Collection<Kredit> getKredit(){
		return kreditRepository.findAll();
	}
	
	@GetMapping("kredit/{id}")
	@ApiOperation(value = "VraÃ„â€¡a Kredit iz baze podataka Ã„ï¿½ija je id vrednost prosleÃ„â€˜ena kao path varijabla")
	public Kredit getKredit(@PathVariable("id") Integer id){
		return kreditRepository.getOne(id);
	}
	
	@GetMapping("kreditNaziv/{naziv}")
	@ApiOperation(value = "VraÃ„â€¡a Kredit iz baze podataka koji u nazivu sadrÃ…Â¾i string prosleÃ„â€˜en kao path varijabla")
	public Collection<Kredit> getKreditByNaziv(@PathVariable("naziv") String naziv){
		return kreditRepository.findByNazivContainingIgnoreCase(naziv);
	}
	
	
	


	@GetMapping("racun")
	@ApiOperation(value = "VraÃ„â€¡a kolekciju svih racuna iz baze podataka")
	public Collection<Racun> getRacun(){
		return racunRepository.findAll();
	}
	
	@GetMapping("racun/{id}")
	@ApiOperation(value = "VraÃ„â€¡a Racun iz baze podataka Ã„ï¿½ija je id vrednost prosleÃ„â€˜ena kao path varijabla")
	public Racun getRacun(@PathVariable("id") Integer id){
		return racunRepository.getOne(id);
	}
	
	@GetMapping(value = "racunKlijenta/{id}")
	public Collection<Racun> racunPoKlijentuId(@PathVariable("id") int id){
		Klijent k= klijentRepository.getOne(id);
		return racunRepository.findByKlijent(k);
	}
	
	@GetMapping("racunNaziv/{naziv}")
	@ApiOperation(value = "VraÃ„â€¡a Racun iz baze podataka koji u nazivu sadrÃ…Â¾i string prosleÃ„â€˜en kao path varijabla")
	public Collection<Racun> getRacunByNaziv(@PathVariable("naziv") String naziv){
		return racunRepository.findByNazivContainingIgnoreCase(naziv);
	}
	
	
	
	
	@GetMapping("tipRacuna")
	@ApiOperation(value = "VraÃ„â€¡a kolekciju svih artikala iz baze podataka")
	public Collection<TipRacuna> getTipRacuna(){
		return tipRacunaRepository.findAll();
	}
	
	@GetMapping("tipRacuna/{id}")
	@ApiOperation(value = "VraÃ„â€¡a TipRacuna iz baze podataka Ã„ï¿½ija je id vrednost prosleÃ„â€˜ena kao path varijabla")
	public TipRacuna getTipRacuna(@PathVariable("id") Integer id){
		return tipRacunaRepository.getOne(id);
	}
	
	@GetMapping("tipRacunaNaziv/{naziv}")
	@ApiOperation(value = "VraÃ„â€¡a TipRacuna iz baze podataka koji u nazivu sadrÃ…Â¾i string prosleÃ„â€˜en kao path varijabla")
	public Collection<TipRacuna> getTipRacunaByNaziv(@PathVariable("naziv") String naziv){
		return tipRacunaRepository.findByNazivContainingIgnoreCase(naziv);
	}
	
	
	
	
	
}
