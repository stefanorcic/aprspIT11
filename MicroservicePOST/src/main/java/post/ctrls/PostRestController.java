package post.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import post.jpa.Klijent;
import post.reps.KlijentRepository;
import post.jpa.Kredit;
import post.reps.KreditRepository;
import post.jpa.Racun;
import post.reps.RacunRepository;
import post.jpa.TipRacuna;
import post.reps.TipRacunaRepository;





@RestController
public class PostRestController {
	
	@Autowired
	private KlijentRepository klijentRepository;
	
	@Autowired
	private KreditRepository kreditRepository;
	
	@Autowired
	private RacunRepository racunRepository;
	
	@Autowired
	private TipRacunaRepository tipRacunaRepository;
	
	@PostMapping("klijent")
	@CrossOrigin
	@ApiOperation(value = "Upisuje Klijenta u bazu podataka")
	public ResponseEntity<Klijent> insertKlijent(@RequestBody Klijent klijent){
		if(klijentRepository.existsById(klijent.getId())) {
				return new ResponseEntity<>(HttpStatus.CONFLICT);
		}

		klijentRepository.save(klijent);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("kredit")
	@CrossOrigin
	@ApiOperation(value = "Upisuje Kredit u bazu podataka")
	public ResponseEntity<Kredit> insertKredit(@RequestBody Kredit kredit){
		if(kreditRepository.existsById(kredit.getId()))
				return new ResponseEntity<>(HttpStatus.CONFLICT);
		kreditRepository.save(kredit);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("racun")
	@CrossOrigin
	@ApiOperation(value = "Upisuje Racun u bazu podataka")
	public ResponseEntity<Racun> insertRacun(@RequestBody Racun racun){
		if(racunRepository.existsById(racun.getId()))
				return new ResponseEntity<>(HttpStatus.CONFLICT);
		racunRepository.save(racun);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@CrossOrigin
	@PostMapping("tipRacuna")
	
	@ApiOperation(value = "Upisuje TipRacuna u bazu podataka")
	public ResponseEntity<TipRacuna> insertTipRacuna(@RequestBody TipRacuna tipRacuna){
		if(tipRacunaRepository.existsById(tipRacuna.getId()))
				return new ResponseEntity<>(HttpStatus.CONFLICT);
		tipRacunaRepository.save(tipRacuna);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
