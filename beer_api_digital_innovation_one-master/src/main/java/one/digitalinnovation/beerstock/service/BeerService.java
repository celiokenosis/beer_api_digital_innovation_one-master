package one.digitalinnovation.beerstock.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.entity.Beer;
import one.digitalinnovation.beerstock.exception.BeerAlreadyRegisteredException;
import one.digitalinnovation.beerstock.exception.BeerNotFoundException;
import one.digitalinnovation.beerstock.exception.BeerStockExceededException;
import one.digitalinnovation.beerstock.mapper.BeerMapper;
import one.digitalinnovation.beerstock.repository.BeerRepository;

@Service
@RequiredArgsConstructor
public class BeerService {

    private final BeerRepository beerRepository = null;
    private final BeerMapper beerMapper = null;

    public BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        verifyIfIsAlreadyRegistered(beerDTO.getName());
        Beer beer = beerMapper.toModel(beerDTO);
        Beer savedBeer = beerRepository.save(beer);
        return beerMapper.toDTO(savedBeer);
    }

	private void verifyIfIsAlreadyRegistered(String name) {
		// TODO Auto-generated method stub
		
	}

	public BeerDTO increment(Long id, int quantityToIncrement) throws BeerNotFoundException, BeerStockExceededException {
        Beer beerToIncrementStock = verifyIfExists(id);
        if (quantityToIncrement + beerToIncrementStock.getQuantity() <= beerToIncrementStock.getMax()) {
            beerToIncrementStock.setQuantity(quantityToIncrement + beerToIncrementStock.getQuantity());
            Beer incrementedBeerStock = beerRepository.save(beerToIncrementStock);
            return beerMapper.toDTO(incrementedBeerStock);
        }
        throw new BeerStockExceededException(id, quantityToIncrement);
    }

	private Beer verifyIfExists(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public BeerDTO findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BeerDTO> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

    // outros métodos...
}

