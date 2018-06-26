package com.service.Impl;
import java.util.List;
import com.dao.BbsOrderDao;
import com.entity.BbsOrder;
import com.common.Assist;
import com.service.BbsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BbsOrderServiceImpl implements BbsOrderService{
    @Autowired
    private BbsOrderDao bbsOrderDao;
    @Override
    public long getBbsOrderRowCount(Assist assist){
        return bbsOrderDao.getBbsOrderRowCount(assist);
    }
    @Override
    public List<BbsOrder> selectBbsOrder(Assist assist){
        return bbsOrderDao.selectBbsOrder(assist);
    }
    @Override
    public BbsOrder selectBbsOrderByObj(BbsOrder obj){
        return bbsOrderDao.selectBbsOrderByObj(obj);
    }
    @Override
    public BbsOrder selectBbsOrderById(Long id){
        return bbsOrderDao.selectBbsOrderById(id);
    }
    @Override
    public int insertBbsOrder(BbsOrder value){
        return bbsOrderDao.insertBbsOrder(value);
    }
    @Override
    public int insertNonEmptyBbsOrder(BbsOrder value){
        return bbsOrderDao.insertNonEmptyBbsOrder(value);
    }
    @Override
    public int insertBbsOrderByBatch(List<BbsOrder> value){
        return bbsOrderDao.insertBbsOrderByBatch(value);
    }
    @Override
    public int deleteBbsOrderById(Long id){
        return bbsOrderDao.deleteBbsOrderById(id);
    }
    @Override
    public int deleteBbsOrder(Assist assist){
        return bbsOrderDao.deleteBbsOrder(assist);
    }
    @Override
    public int updateBbsOrderById(BbsOrder enti){
        return bbsOrderDao.updateBbsOrderById(enti);
    }
    @Override
    public int updateBbsOrder(BbsOrder value, Assist assist){
        return bbsOrderDao.updateBbsOrder(value,assist);
    }
    @Override
    public int updateNonEmptyBbsOrderById(BbsOrder enti){
        return bbsOrderDao.updateNonEmptyBbsOrderById(enti);
    }
    @Override
    public int updateNonEmptyBbsOrder(BbsOrder value, Assist assist){
        return bbsOrderDao.updateNonEmptyBbsOrder(value,assist);
    }

    public BbsOrderDao getBbsOrderDao() {
        return this.bbsOrderDao;
    }

    public void setBbsOrderDao(BbsOrderDao bbsOrderDao) {
        this.bbsOrderDao = bbsOrderDao;
    }

}