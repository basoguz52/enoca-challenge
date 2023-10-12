package enoca.backendchallenge.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import enoca.backendchallenge.dto.PersonelDto;
import enoca.backendchallenge.dto.ProjeDto;
import enoca.backendchallenge.entity.Personel;
import enoca.backendchallenge.entity.Proje;

public class Mapper {

    public static PersonelDto personelToDto(Personel personel) {

        return new PersonelDto.Builder()
                .ad(personel.getAd())
                .soyad(personel.getSoyad())
                .build();
    }

    public static List<PersonelDto> personelListToDto(List<Personel> personelList) {
        List<PersonelDto> personelDtoList = new ArrayList<>();

        personelList.forEach((personel) -> personelDtoList.add(personelToDto(personel)));
        return personelDtoList;
    }

    public static List<ProjeDto> projeListToDto(List<Proje> projeList){
        List<ProjeDto> ProjeDtoList = new ArrayList<>();

        projeList.forEach((proje) -> ProjeDtoList.add(projeToDto(proje)));
        return ProjeDtoList;
    }

    public static ProjeDto projeToDto(Proje proje) {

        return new ProjeDto.Builder()
                .ad(proje.getAd())
                .yonetici(Mapper.personelToDto(proje.getYonetici()))
                .build();
    }

}
