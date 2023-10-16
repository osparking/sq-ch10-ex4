package sq_ch10_ex4.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sq_ch10_ex4.dto.Country;

@RestController
public class CountryController {
	
	@GetMapping("/korea")
	public ResponseEntity<Country> korea() {
		var korea = Country.of("한국", 51);
		return ResponseEntity.status(HttpStatus.ACCEPTED)
				.header("continent", "Asia")
				.header("capital", "Seoul")
				.header("favorite_foot", "soup and rice")
				.body(korea);
	}
}
