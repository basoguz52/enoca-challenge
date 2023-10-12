package enoca.backendchallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enoca.backendchallenge.dto.PersonelDto;
import enoca.backendchallenge.dto.mapper.Mapper;
import enoca.backendchallenge.entity.Personel;
import enoca.backendchallenge.repository.PersonelRepository;

@Service
public class PersonelService {

    final PersonelRepository personelRepository;

    @Autowired
    public PersonelService(PersonelRepository personelRepository){
        this.personelRepository = personelRepository;
    }

    public PersonelDto getPersonel(Integer id) {
        return Mapper.personelToDto(personelRepository.findById(id).get());
    }

    public List<PersonelDto> getAllPersonel() {
        return Mapper.personelListToDto(personelRepository.findAll());
    }

    public String addPersonel(Personel personel) {
        personelRepository.save(personel);
        return "Personel eklendi";
    }

    public String updatePersonel(Personel personel) {
        personelRepository.save(personel);
        return "Personel güncellendi";
    }

    public String deletePersonel(Integer id) {
        personelRepository.deleteById(id);
        return "Personel " + id + "Silindi";
    }

}
