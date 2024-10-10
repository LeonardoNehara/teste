package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import app.entity.Carro;
import app.entity.Marca;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

	public List<Carro> findByNome(String nome);
	
	public List<Carro> findByMarca(Marca marca);
	
	@Query("FROM Carro c WHERE c.ano >= :ano")
	public List<Carro> findAcimaAno(int ano);
}

