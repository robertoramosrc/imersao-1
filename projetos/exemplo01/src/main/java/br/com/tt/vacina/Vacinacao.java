package br.com.tt.vacina;

public class Vacinacao {

    public static TipoVacina[] identificaVacinas(TipoIdade tipoIdade){
        switch (tipoIdade){
            case CRIANCA:
                return new TipoVacina[]{
                        TipoVacina.POLIOMIELITE,
                        TipoVacina.PENTA};
            case ADOLESCENTE:
                return new TipoVacina[]{
                        TipoVacina.HPV,
                        TipoVacina.SARAMPO,
                        TipoVacina.INFLUENZA};
            case ADULTO:
                return new TipoVacina[]{
                        TipoVacina.HEPATITE_B,
                        TipoVacina.FEBRE_AMARELA,
                        TipoVacina.INFLUENZA};
        }
        return null;
    }

    public static boolean identificaVacina(TipoIdade tipoIdade, TipoVacina tipoVacinaInformado) {
        TipoVacina[] tipos = identificaVacinas(tipoIdade);

        for (TipoVacina vacina : identificaVacinas(tipoIdade)){
            if (vacina.equals(tipoVacinaInformado)){
                return true;
            }
        }
        return false;
    }
}
