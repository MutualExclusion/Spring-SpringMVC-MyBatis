package com.service.Impl;
import java.util.List;
import com.dao.BbsProductDao;
import com.entity.BbsProduct;
import com.common.Assist;
import com.service.BbsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BbsProductServiceImpl implements BbsProductService{
    @Autowired
    private BbsProductDao bbsProductDao;
    @Override
    public long getBbsProductRowCount(Assist assist){
        return bbsProductDao.getBbsProductRowCount(assist);
    }
    @Override
    public List<BbsProduct> selectBbsProduct(Assist assist){
        return bbsProductDao.selectBbsProduct(assist);
    }
    @Override
    public BbsProduct selectBbsProductByObj(BbsProduct obj){
        return bbsProductDao.selectBbsProductByObj(obj);
    }
    @Override
    public BbsProduct selectBbsProductById(Long id){
        return bbsProductDao.selectBbsProductById(id);
    }
    @Override
    public int insertBbsProduct(BbsProduct value){
        return bbsProductDao.insertBbsProduct(value);
    }
    @Override
    public int insertNonEmptyBbsProduct(BbsProduct value){
        return bbsProductDao.insertNonEmptyBbsProduct(value);
    }
    @Override
    public int insertBbsProductByBatch(List<BbsProduct> value){
        return bbsProductDao.insertBbsProductByBatch(value);
    }
    @Override
    public int deleteBbsProductById(Long id){
        return bbsProductDao.deleteBbsProductById(id);
    }
    @Override
    public int deleteBbsProduct(Assist assist){
        return bbsProductDao.deleteBbsProduct(assist);
    }
    @Override
    public int updateBbsProductById(BbsProduct enti){
        return bbsProductDao.updateBbsProductById(enti);
    }
    @Override
    public int updateBbsProduct(BbsProduct value, Assist assist){
        return bbsProductDao.updateBbsProduct(value,assist);
    }
    @Override
    public int updateNonEmptyBbsProductById(BbsProduct enti){
        return bbsProductDao.updateNonEmptyBbsProductById(enti);
    }
    @Override
    public int updateNonEmptyBbsProduct(BbsProduct value, Assist assist){
        return bbsProductDao.updateNonEmptyBbsProduct(value,assist);
    }

    public BbsProductDao getBbsProductDao() {
        return this.bbsProductDao;
    }

    public void setBbsProductDao(BbsProductDao bbsProductDao) {
        this.bbsProductDao = bbsProductDao;
    }

}