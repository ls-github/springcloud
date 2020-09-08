package cn.ctgu.firstdemo.dao;

import cn.ctgu.firstdemo.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockDao extends JpaRepository<Stock,Integer> {

    List<Stock> findByGoodsName(String name);

}