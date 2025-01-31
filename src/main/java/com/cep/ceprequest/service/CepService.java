package com.cep.ceprequest.service;
import com.cep.ceprequest.dto.CepResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;
import java.lang.String;

@Service
public class CepService {
    private final WebClient webClient;

    public CepService(WebClient.Builder webClientBuilder){
        this.webClient = webClientBuilder.baseUrl("https://viacep.com.br/ws/").build();
    }

    public CepResponse buscarEnderecoPorCep(String cep){
        try {
            return webClient.get()
                .uri("/{cep}/json", cep)
                .retrieve()
                .bodyToMono(CepResponse.class)
                .block();
        } catch (WebClientResponseException e) {
            return null;
        }
    }
}
