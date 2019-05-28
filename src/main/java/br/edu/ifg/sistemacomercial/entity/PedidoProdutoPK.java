package br.edu.ifg.sistemacomercial.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PedidoProdutoPK implements Serializable{
    
    @Column(name = "produto_id")
    private Integer produtoId;
    @Column(name = "pedido_id")
    private Integer pedidoId;

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }
    
    
}
