import java.util.List;

import java.util.stream.Collectors;

public class Main {
    public static List<String> filtrarMulheres(List<Pessoa> listaPessoas) {

        return listaPessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equals("F"))
                .map(Pessoa::getNome)
                .collect(Collectors.toList());
    }
}