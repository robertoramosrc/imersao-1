package br.com.tt.vacina;

import br.com.tt.vacina.TipoIdade;
import br.com.tt.vacina.TipoVacina;
import br.com.tt.vacina.Vacinacao;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VacinacaoTest {

    @Test
    public void deveIdentificarVacinasDeCrianca(){
        //Arrange - Given

        //Act - When
        TipoVacina[] vacinas = Vacinacao.identificaVacinas(TipoIdade.CRIANCA);

        //Assert - Then
        TipoVacina[] vacinasEsperadas =
                new TipoVacina[]{TipoVacina.POLIOMIELITE, TipoVacina.PENTA};
        assertArrayEquals(vacinasEsperadas, vacinas);
    }

    @Test
    @DisplayName("Vacinas de adolescente")
    public void deveIdentificarVacinasDeAdolescente(){

        TipoVacina[] esperado =
                new TipoVacina[]{TipoVacina.HPV, TipoVacina.SARAMPO, TipoVacina.INFLUENZA};

        TipoVacina[] resultado = Vacinacao.identificaVacinas(TipoIdade.ADOLESCENTE);

        assertArrayEquals(esperado, resultado,
                "As vacinas de adolescente deveriam ser: HPV, Sarampo e Influenza");
    }

    @Test
    public void deveIdentificarVacinasDeAdulto(){

        assertArrayEquals(
                new TipoVacina[]{TipoVacina.HEPATITE_B, TipoVacina.FEBRE_AMARELA, TipoVacina.INFLUENZA},
                Vacinacao.identificaVacinas(TipoIdade.ADULTO),
                "Deveria retornar hepatite_b, febre amarela e influenza"
        );
    }

    @Test
    public void deveriaIdentificarSeAdultoTomaVacinaHepatiteSucesso(){

        boolean deveTomarVacina = Vacinacao.identificaVacina(TipoIdade.ADULTO, TipoVacina.HEPATITE_B);

        assertTrue(deveTomarVacina, "Deveria retornar true");
    }

    @Test
    public void deveriaIdentificarSeAdultoTomaVacinaHepatiteInsucesso(){

        boolean deveTomarVacina = Vacinacao.identificaVacina(TipoIdade.ADOLESCENTE, TipoVacina.HEPATITE_B);

        assertFalse(deveTomarVacina, "Deveria retornar false pois é adolescente");
    }

    @Test
    public void deveriaIdentificarSeAdultoTomaVacinaHepatiteSeBCG(){

        boolean deveTomarVacina = Vacinacao.identificaVacina(TipoIdade.ADULTO, TipoVacina.BCG);

        assertFalse(deveTomarVacina, "Deveria retornar false pois é BCG!");
    }

}
