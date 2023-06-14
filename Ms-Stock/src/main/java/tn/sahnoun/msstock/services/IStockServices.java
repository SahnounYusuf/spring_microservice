package tn.sahnoun.msstock.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.sahnoun.msstock.entities.Stock;

import java.util.List;
import java.util.Map;

public interface IStockServices {
    Stock addArticle(Stock article);

    Stock updateStock(Map<Object, Object> fields, Long id);

    void removeStock(Long articleId);
    Stock findStockById( Long stockId);

    List<Stock> getAllStocks();
}
