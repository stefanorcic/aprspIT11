package msdelete.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import msdelete.reps.KlijentRepository;
import msdelete.reps.KreditRepository;
import msdelete.reps.RacunRepository;
import msdelete.reps.TipRacunaRepository;
import msdelete.jpa.TipRacuna;
import msdelete.jpa.Racun;
import msdelete.jpa.Kredit;
import msdelete.jpa.Klijent;




@RestController
public class DeleteRestController {
	
	@Autowired
	private KlijentRepository klijentRepository;
	
	@Autowired
	private KreditRepository kreditRepository;
	
	@Autowired
	private RacunRepository racunRepository;
	
	@Autowired
	private TipRacunaRepository tipRacunaRepository;
	
	@DeleteMapping("klijent/{id}")
	@CrossOrigin
	@ApiOperation(value = "BriÃ…Â¡e Klijenta iz baze podataka Ã„ï¿½iji je id vrednost prosleÃ„â€˜ena kao path varijabla")
	public ResponseEntity<Klijent> deleteKlijent(@PathVariable("id") Integer id){
		if(klijentRepository.existsById(id)){
			klijentRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("kredit/{id}")
	@CrossOrigin
	@ApiOperation(value = "BriÃ…Â¡e Kredit iz baze podataka Ã„ï¿½ija je id vrednost prosleÃ„â€˜ena kao path varijabla")
	public ResponseEntity<Kredit> deleteKredit(@PathVariable("id") Integer id){
		if(kreditRepository.existsById(id)){
			kreditRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("racun/{id}")
	@CrossOrigin
	@ApiOperation(value = "BriÃ…Â¡e Racun iz baze podataka Ã„ï¿½ija je id vrednost prosleÃ„â€˜ena kao path varijabla")
	public ResponseEntity<Racun> deleteRacun(@PathVariable("id") Integer id){
		if(racunRepository.existsById(id)){
			racunRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("tipRacuna/{id}")
	@CrossOrigin
	@ApiOperation(value = "BriÃ…Â¡e TipRacuna iz baze podataka Ã„ï¿½ija je id vrednost prosleÃ„â€˜ena kao path varijabla")
	public ResponseEntity<TipRacuna> deleteTipRacuna(@PathVariable("id") Integer id){
		if(tipRacunaRepository.existsById(id)){
			tipRacunaRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
