package com.service.Impl;
import java.util.List;
import com.dao.BbsBuyerDao;
import com.entity.BbsBuyer;
import com.common.Assist;
import com.service.BbsBuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BbsBuyerServiceImpl implements BbsBuyerService{
    @Autowired
    private BbsBuyerDao bbsBuyerDao;
    @Override
    public long getBbsBuyerRowCount(Assist assist){
        return bbsBuyerDao.getBbsBuyerRowCount(assist);
    }
    @Override
    public List<BbsBuyer> selectBbsBuyer(Assist assist){
        return bbsBuyerDao.selectBbsBuyer(assist);
    }
    @Override
    public BbsBuyer selectBbsBuyerByObj(BbsBuyer obj){
        return bbsBuyerDao.selectBbsBuyerByObj(obj);
    }
    @Override
    public BbsBuyer selectBbsBuyerById(Long id){
        return bbsBuyerDao.selectBbsBuyerById(id);
    }
    @Override
    public int insertBbsBuyer(BbsBuyer value){
        return bbsBuyerDao.insertBbsBuyer(value);
    }
    @Override
    public int insertNonEmptyBbsBuyer(BbsBuyer value){
        return bbsBuyerDao.insertNonEmptyBbsBuyer(value);
    }
    @Override
    public int insertBbsBuyerByBatch(List<BbsBuyer> value){
        return bbsBuyerDao.insertBbsBuyerByBatch(value);
    }
    @Override
    public int deleteBbsBuyerById(Long id){
        return bbsBuyerDao.deleteBbsBuyerById(id);
    }
    @Override
    public int deleteBbsBuyer(Assist assist){
        return bbsBuyerDao.deleteBbsBuyer(assist);
    }
    @Override
    public int updateBbsBuyerById(BbsBuyer enti){
        return bbsBuyerDao.updateBbsBuyerById(enti);
    }
    @Override
    public int updateBbsBuyer(BbsBuyer value, Assist assist){
        return bbsBuyerDao.updateBbsBuyer(value,assist);
    }
    @Override
    public int updateNonEmptyBbsBuyerById(BbsBuyer enti){
        return bbsBuyerDao.updateNonEmptyBbsBuyerById(enti);
    }
    @Override
    public int updateNonEmptyBbsBuyer(BbsBuyer value, Assist assist){
        return bbsBuyerDao.updateNonEmptyBbsBuyer(value,assist);
    }

    public BbsBuyerDao getBbsBuyerDao() {
        return this.bbsBuyerDao;
    }

    public void setBbsBuyerDao(BbsBuyerDao bbsBuyerDao) {
        this.bbsBuyerDao = bbsBuyerDao;
    }

}