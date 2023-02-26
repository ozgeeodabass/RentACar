package kodlamaio.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.rentACar.business.abstracts.BrandService;
import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;

@Service 
public class BrandManager implements BrandService{
	
	private BrandRepository brandRepository;

	@Autowired 
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}


	@Override
	public List<Brand> getAll() {
		return brandRepository.findAll();
	}

}
