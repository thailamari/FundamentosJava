package fundamentos;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gravacao {

    public static void main(String[] args) throws IOException {
        String[] cabecalho = {"nome","idade","telefone"};

        List<String[]> linhas = new ArrayList<>();
        linhas.add(new String[]{"Beatriz","29","11 9999999"});
        linhas.add(new String[]{"Joao","25","19 888888888"});
        linhas.add(new String[]{"Pablo","31","31 77777777"});

        Writer escritor = Files.newBufferedWriter(Paths.get("src/main/resources/logs/clientes.csv"));

     //   CSVWriter escritorCSV = new CSVWriter(escritor);

      //  escritorCSV.writeNext(cabecalho);
      //  escritorCSV.writeAll(linhas);

      //  escritorCSV.flush();
        escritor.close();
    }
}
