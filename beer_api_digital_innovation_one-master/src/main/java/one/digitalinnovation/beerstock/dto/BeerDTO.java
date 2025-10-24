package one.digitalinnovation.beerstock.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.beerstock.enums.BeerType;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDTO {
    private Long id;
    private String name;
    private String brand;
    private Integer max;
    private Integer quantity;
    private BeerType type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BeerType getType() {
		return type;
	}
	public void setType(BeerType type) {
		this.type = type;
	}
	public BeerDTO(Long id, String name, String brand, Integer max, Integer quantity, BeerType type) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.max = max;
		this.quantity = quantity;
		this.type = type;
	}
    
    
}


