package enoca.backendchallenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import enoca.backendchallenge.dto.PersonelDto;
import enoca.backendchallenge.entity.Personel;
import enoca.backendchallenge.service.PersonelService;

@RestController
@RequestMapping("personel")
public class PersonelController {

    final PersonelService personelService;

    @Autowired
    public PersonelController(PersonelService personelService){
        this.personelService = personelService;
    }

    @GetMapping("get/{id}")
    public PersonelDto getPersonel(@PathVariable Integer id){
        return personelService.getPersonel(id);
    }
    
    @GetMapping("getAll")
    public List<PersonelDto> getAllPersonel(){
        return personelService.getAllPersonel();
    }

    @PostMapping("add")
    public String addPersonel(@RequestBody Personel personel){
        return personelService.addPersonel(personel);
    }

    @PutMapping ("update")
    public String updatePersonel(@RequestBody Personel personel){
        return personelService.updatePersonel(personel);
    }

    @DeleteMapping("delete")
    public String deletePersonel(@RequestParam Integer id){
        return personelService.deletePersonel(id);
    }

    
}
