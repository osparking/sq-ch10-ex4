package sq_ch10_ex4.dto;

import lombok.Data;

@Data
public class Country {
	private String name;
	private int population;

	public static Country of(String name, int pop) {
		var country = new Country();
		country.setName(name);
		country.setPopulation(pop);
		return country;
	}
}
