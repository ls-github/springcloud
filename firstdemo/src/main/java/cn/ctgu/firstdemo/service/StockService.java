package cn.ctgu.firstdemo.service;

import cn.ctgu.firstdemo.dao.StockDao;
import cn.ctgu.firstdemo.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StockService {

    @Autowired
    private  StockDao stockDao;



    public Object saveStock(Stock stock){
        Stock obj=stockDao.save(stock);
        int a=1/0;
        return obj;
    }


    public Object buyGoods(String goodsname, int count) {
        synchronized (new Object()) {
            List<Stock> stockList=stockDao.findByGoodsName(goodsname);
            Stock goodsStock=stockList.get(0);
            int dbCount=goodsStock.getCount();
            if(dbCount>0){
                goodsStock.setCount(dbCount-1);
                stockDao.save(goodsStock);
                System.out.println(Thread.currentThread().getName()+"===>成功购买商品，还剩"+(dbCount-1));
            }else{
                System.out.println(Thread.currentThread().getName()+"===>购买失败");
            }
        }
        return  null;
    }
}
