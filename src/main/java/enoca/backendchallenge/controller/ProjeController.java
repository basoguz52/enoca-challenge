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

import enoca.backendchallenge.dto.ProjeDto;
import enoca.backendchallenge.entity.Proje;
import enoca.backendchallenge.service.ProjeService;

@RestController
@RequestMapping("proje")
public class ProjeController {

    final ProjeService projeService;

    @Autowired
    public ProjeController(ProjeService projeService){
        this.projeService = projeService;
    }

    @GetMapping("get/{id}")
    public ProjeDto getproje(@PathVariable Integer id){
        return projeService.getproje(id);
    }
    
    @GetMapping("getAll")
    public List<ProjeDto> getAllProje(){
        return projeService.getAllProje();
    }

    @PostMapping("add")
    public String addProje(@RequestBody Proje proje){
        return projeService.addProje(proje);
    }

    @PutMapping ("update")
    public String updateProje(@RequestBody Proje proje){
        return projeService.updateProje(proje);
    }

    @DeleteMapping("delete")
    public String deleteProje(@RequestParam Integer id){
        return projeService.deleteProje(id);
    }
    
}
