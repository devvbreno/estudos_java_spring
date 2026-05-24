package br.gov.senado.gerador_desculpas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller 
public class DesculpaController {

    private final List<String> desculpas = Arrays.asList(
    	"O código funcionava perfeitamente na MINHA máquina.",
        "Foi um problema de cache do Liferay, certeza.",
        "A API do Senado caiu bem na hora que eu ia testar.",
        "Estou esperando o deploy terminar no ambiente de homologação.",
        "O estagiário anterior não documentou essa parte do código.",
        "A inteligência artificial me deu o prompt errado hoje.",
        "Faltou um ponto e vírgula em algum lugar oculta do Spring Boot."
    );

    @GetMapping("/desculpa") 
    public String obterDesculpaAleatoria(Model model) {
        
        Random random = new Random();
        String desculpaSorteada = desculpas.get(random.nextInt(desculpas.size()));

        model.addAttribute("textoDesculpa", desculpaSorteada);

        return "desculpa";
    }
}