package kodlamaio.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.rentACar.business.abstracts.BrandService;
import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;

@Service //IoC yapısında newle. bu sınıf bir buiness nesnesidir.
public class BrandManager implements BrandService{
	
	private BrandRepository brandRepository;

	@Autowired //kim brandrepository implement ediyorsa onu ver
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}


	@Override
	public List<Brand> getAll() {
		// iş kuralları
		
		return brandRepository.getAll();
	}

}
