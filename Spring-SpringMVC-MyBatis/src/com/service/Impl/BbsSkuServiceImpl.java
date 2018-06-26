package com.service.Impl;
import java.util.List;
import com.dao.BbsSkuDao;
import com.entity.BbsSku;
import com.common.Assist;
import com.service.BbsSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BbsSkuServiceImpl implements BbsSkuService{
    @Autowired
    private BbsSkuDao bbsSkuDao;
    @Override
    public long getBbsSkuRowCount(Assist assist){
        return bbsSkuDao.getBbsSkuRowCount(assist);
    }
    @Override
    public List<BbsSku> selectBbsSku(Assist assist){
        return bbsSkuDao.selectBbsSku(assist);
    }
    @Override
    public BbsSku selectBbsSkuByObj(BbsSku obj){
        return bbsSkuDao.selectBbsSkuByObj(obj);
    }
    @Override
    public BbsSku selectBbsSkuById(Long id){
        return bbsSkuDao.selectBbsSkuById(id);
    }
    @Override
    public int insertBbsSku(BbsSku value){
        return bbsSkuDao.insertBbsSku(value);
    }
    @Override
    public int insertNonEmptyBbsSku(BbsSku value){
        return bbsSkuDao.insertNonEmptyBbsSku(value);
    }
    @Override
    public int insertBbsSkuByBatch(List<BbsSku> value){
        return bbsSkuDao.insertBbsSkuByBatch(value);
    }
    @Override
    public int deleteBbsSkuById(Long id){
        return bbsSkuDao.deleteBbsSkuById(id);
    }
    @Override
    public int deleteBbsSku(Assist assist){
        return bbsSkuDao.deleteBbsSku(assist);
    }
    @Override
    public int updateBbsSkuById(BbsSku enti){
        return bbsSkuDao.updateBbsSkuById(enti);
    }
    @Override
    public int updateBbsSku(BbsSku value, Assist assist){
        return bbsSkuDao.updateBbsSku(value,assist);
    }
    @Override
    public int updateNonEmptyBbsSkuById(BbsSku enti){
        return bbsSkuDao.updateNonEmptyBbsSkuById(enti);
    }
    @Override
    public int updateNonEmptyBbsSku(BbsSku value, Assist assist){
        return bbsSkuDao.updateNonEmptyBbsSku(value,assist);
    }

    public BbsSkuDao getBbsSkuDao() {
        return this.bbsSkuDao;
    }

    public void setBbsSkuDao(BbsSkuDao bbsSkuDao) {
        this.bbsSkuDao = bbsSkuDao;
    }

}