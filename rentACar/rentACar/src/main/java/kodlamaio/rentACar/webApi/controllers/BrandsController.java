package kodlamaio.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.rentACar.business.abstracts.BrandService;
import kodlamaio.rentACar.entities.concretes.Brand;

@RestController  //annotation
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandService;

	@Autowired //kim brandservice implement ediyorsa new lenmiş halini bana ver demek
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	@GetMapping("/getall")
	public List<Brand> getAll(){
		return brandService.getAll();
	}
	
}
