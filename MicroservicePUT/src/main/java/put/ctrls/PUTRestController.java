package put.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

import put.jpa.Klijent;
import put.reps.KlijentRepository;
import put.reps.KreditRepository;
import put.reps.RacunRepository;
import put.reps.TipRacunaRepository;
import put.jpa.TipRacuna;
import put.jpa.Racun;
import put.jpa.Kredit;


@RestController
public class PUTRestController {
	
	
	@Autowired
	private KlijentRepository klijentRepository;
	
	
	@Autowired
	private KreditRepository kreditRepository;
	
	@Autowired
	private RacunRepository racunRepository;
	

	@Autowired
	private TipRacunaRepository tipRacunaRepository;
	
	// update
	@PutMapping("klijent")
	@CrossOrigin
	@ApiOperation(value = "Modifikuje postojeÃ„â€¡eg Klijenta iz baze podataka")
	public ResponseEntity<Klijent> updateKlijent(@RequestBody Klijent klijent){
		if(klijentRepository.existsById(klijent.getId())){
			klijentRepository.save(klijent);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
		
	// update
	@PutMapping("kredit")
	@CrossOrigin
	@ApiOperation(value = "Modifikuje postojeÃ„â€¡i Kredit iz baze podataka")
	public ResponseEntity<Kredit> updateKredit(@RequestBody Kredit kredit){
		if(kreditRepository.existsById(kredit.getId())){
			kreditRepository.save(kredit);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("racun")
	@CrossOrigin
	@ApiOperation(value = "Modifikuje postojeÃ„â€¡i Racun iz baze podataka")
	public ResponseEntity<Racun> updateRacun(@RequestBody Racun racun){
		if(racunRepository.existsById(racun.getId())){
			racunRepository.save(racun);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	// update
	@CrossOrigin
	@PutMapping("tipRacuna")
	
	@ApiOperation(value = "Modifikuje postojeÃ„â€¡i TipRacuna iz baze podataka")
	public ResponseEntity<TipRacuna> updateTipRacuna(@RequestBody TipRacuna tipRacuna){
		if(tipRacunaRepository.existsById(tipRacuna.getId())){
			tipRacunaRepository.save(tipRacuna);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	
}
