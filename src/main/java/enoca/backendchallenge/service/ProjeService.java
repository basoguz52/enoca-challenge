package enoca.backendchallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enoca.backendchallenge.dto.ProjeDto;
import enoca.backendchallenge.dto.mapper.Mapper;
import enoca.backendchallenge.entity.Proje;
import enoca.backendchallenge.repository.ProjeRepository;

@Service
public class ProjeService {

    final ProjeRepository projeRepository;

    @Autowired
    public ProjeService(ProjeRepository projeRepository){
        this.projeRepository = projeRepository;
    }

    public ProjeDto getproje(Integer id) {
        return Mapper.projeToDto(projeRepository.findById(id).get());
    }

    public List<ProjeDto> getAllProje() {
        return Mapper.projeListToDto(projeRepository.findAll());
    }

    public String addProje(Proje proje) {
        projeRepository.save(proje);
        return "Proje eklendi";
        
    }
    
    public String updateProje(Proje proje) {
        projeRepository.save(proje);
        return "Proje Güncellendi";
    }
    
    public String deleteProje(Integer id) {
        projeRepository.deleteById(id);
        return "Proje" + id + "Silindi";
    }
    
}
