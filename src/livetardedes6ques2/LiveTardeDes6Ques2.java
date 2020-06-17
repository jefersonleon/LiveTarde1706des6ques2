package livetardedes6ques2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveTardeDes6Ques2 {

    /**
     * Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados
     * os dados de idade, sexo (M/F) e salário. Faça um algoritmo que informe: 
     * a média de salário do grupo;  maior e menor idade do grupo;  quantidade
     * de mulheres com salário até R$100,00. Encerre a entrada de dados quando
     * for digitada uma idade negativa. (Use o comando while).
     */
    public static void main(String[] args) {
        int idade, sexo, contPessoas, contMS100, maiorIdade, menorIdade;
        double salario, acSalario;
        contPessoas = 0;  contMS100 = 0;  acSalario = 0; menorIdade = 0;
        maiorIdade = 0;

        idade = 1;
        while (idade >= 0) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade\n"
                    + "Ou digite -1 para sair "));
            if (idade >= 0) {
                if (contPessoas == 0) {
                    maiorIdade = idade;
                    menorIdade = idade;
                }
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
                if (idade < menorIdade) {
                    menorIdade = idade;
                }
                sexo = Integer.parseInt(JOptionPane.showInputDialog("Informe o sexo"
                        + "\n1 - Feminino ou 2 - Masculino\nDigite: "));
                salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"
                        + "\nDigite: "));
                acSalario = acSalario + salario;//acumulando um salario
                contPessoas++;//contabilizando uma pessoa - Quantidade
                if (sexo == 1 && salario <= 100) {
                    contMS100++;//quant. mulheres que recebem até R$100,00
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tchau Xiru ou Chinoca");
            }
        }//fim do while - loop
        JOptionPane.showMessageDialog(null, "Resultados\n-------------\n"
         + " A pesquisa contou com " + contPessoas + " pessoas entrevistadas\n"
         + "Média de Salários R$" + (acSalario / contPessoas) + "\n"
         + "Quant. de Mulheres com salário até R$100,00: " + contMS100 + " mulheres\n"
         + "A idade do mais novo do grupo " + menorIdade+" anos\n"
         + "A idade do mais velho do grupo " + maiorIdade +" anos");
    }

}
