package enoca.backendchallenge.dto;

import lombok.Data;

@Data
public class ProjeDto {

    private String ad;
    private PersonelDto yonetici;

    public ProjeDto(Builder builder){
        this.ad = builder.ad;
        this.yonetici = builder.yonetici;
    }

    public static class Builder {

        private String ad;
        private PersonelDto yonetici;

        public Builder ad(final String ad) {
            this.ad = ad;
            return this;
        }

        public Builder yonetici(final PersonelDto yonetici) {
            this.yonetici = yonetici;
            return this;
        }

        public ProjeDto build() {
            return new ProjeDto(this);
        }
    }
}