package br.com.sistemacomercial.controller;

import br.com.sistemacomercial.dao.ProdutoDAO;
import br.com.sistemacomercial.model.Produto;
import java.util.List;

public class ProdutoController {
    private ProdutoDAO produtoDAO = new ProdutoDAO();
    private int proximoId = 1;
    
    public Produto adicionar(String nome, double preco) {
        Produto produto = new Produto(proximoId++, nome, preco);
        produtoDAO.adicionarProduto(produto);
        return produto;
    }
    
    public List<Produto> listar() {
        return produtoDAO.listarProdutos();
    }
    
    public Produto buscarPorId(int id) {
        for (Produto p : produtoDAO.listarProdutos()) {
            if (p.getId() == id) return p;
        }
        return null;
    }
    
    public boolean atualizar(int id, String nome, double preco) {
        Produto produto = buscarPorId(id);
        if (produto != null) {
            produto.setNome(nome);
            produto.setPreco(preco);
            return true;
        }
        return false;
    }
    
    public void remover(int id) {
        List<Produto> produtos = produtoDAO.listarProdutos();
        produtos.removeIf(p -> p.getId() == id);
    }
}