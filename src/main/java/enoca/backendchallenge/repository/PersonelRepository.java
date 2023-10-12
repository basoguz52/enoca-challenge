package enoca.backendchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import enoca.backendchallenge.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel,Integer>{
    
}
