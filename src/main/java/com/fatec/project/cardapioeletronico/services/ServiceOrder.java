package com.fatec.project.cardapioeletronico.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fatec.project.cardapioeletronico.models.ModelStandardOrder;

@Service
//regras de negócios para realizar pedido
public class ServiceOrder {

    //array list para armazenar os pedidos
    private List<ModelStandardOrder> orderList = new ArrayList<>();
    private ModelStandardOrder order = new ModelStandardOrder();

    //registrar pedido
    public ModelStandardOrder makeOrder(ModelStandardOrder standardOrder){
        orderList.add(standardOrder);

        return standardOrder;
    }

    //pedido cancelado
    public String cancelOrder(){
        orderList.clear();

        return "canceled";
    }

    //calcular o desconto do produto
    public double calculateDiscount(double percent, double totalValue){
        double discount = 0.0;

        discount = totalValue * (percent/100.0);

        return discount;
    }

    //mostrar resumo total do pedido
    public List<ModelStandardOrder> showSummary(){

        return orderList;
    }

    //verificar se pedidos são customizados: ainda não implementado
    public boolean customOder(){

        return order.isCustom();
    }
}
