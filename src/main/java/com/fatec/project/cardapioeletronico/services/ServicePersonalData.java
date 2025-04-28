package com.fatec.project.cardapioeletronico.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fatec.project.cardapioeletronico.models.ModelClient;

@Service
//regras de negócios para armazenar os dados dos clientes
public class ServicePersonalData {

    private final List<ModelClient> client = new ArrayList<>();    //armazenar em memória os dados dos clientes

    //salvar na lista
    public ModelClient save(ModelClient modelClient){
        client.add(modelClient);

        return modelClient;
    }

    //mostrar o conteúdo da lista
    public List<ModelClient> list(){

        return client;
    }

}
