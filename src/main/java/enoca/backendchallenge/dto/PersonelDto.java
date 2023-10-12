package enoca.backendchallenge.dto;

import lombok.Data;

@Data
public class PersonelDto {
    private String ad;
    private String soyad;

    public PersonelDto(Builder builder) {
        this.ad = builder.ad;
        this.soyad = builder.soyad;
    }

    public static class Builder{

        private String ad;
        private String soyad;

        public Builder ad(final String ad){
            this.ad = ad;
            return this;
        }

        public Builder soyad(final String soyad){
            this.soyad = soyad;
            return this;
        }

        public PersonelDto build(){
            return new PersonelDto(this);
        }

    }
}