package dtoConcorrencia;

import Funcoes.ArraysBanco;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author eric
 */
public class ProfessorJson {

    private String nomeProfessor;
    private long idProfessor;
    public List<DadosAtividadeJson> listaAtividades;
    public List<Integer> listaAreas;
    public Map<Integer, Integer> pontosAreas;
    private int somaAreas = 0;

    public ProfessorJson() {
        this.listaAtividades = new ArrayList<DadosAtividadeJson>();

        try {
            ArraysBanco arr = new ArraysBanco();
            pontosAreas = new HashMap<Integer, Integer>();
            pontosAreas = arr.getMapaAreas();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public List<DadosAtividadeJson> getListaAtividades() {
        return listaAtividades;
    }

    public int getSomaAreas() {
        calculaSomaAreas();
        return somaAreas;
    }

    private int calculaSomaAreas() {
        int totalVolts = 0;
        for (int val : pontosAreas.values()) {
            totalVolts += val;
        }
        System.out.println("\tSOMA AREAS: "+somaAreas);;
        return totalVolts;
    }

}
