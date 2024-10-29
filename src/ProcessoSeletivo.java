import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MARCIA","PAULO","AUGUSTO","MONICA"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
    
        for (int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº" + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviaada de interação for each");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecaoCandidato(){
        String [] candidatos = {"FELIPE","MARCIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salariobase = 2000.0;
        while(candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido =  valorPretendido();

            System.out.println("O candidato" + candidato + " solicitou esse valor de salário: " + salarioPretendido);
            if (salariobase >= salarioPretendido){
                System.out.println(("O candidato" + candidato + "foi selecionado para a vaga."));
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        }else if(salarioBase==salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
