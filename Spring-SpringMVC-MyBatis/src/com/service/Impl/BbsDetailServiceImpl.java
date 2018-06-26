package com.service.Impl;
import java.util.List;
import com.dao.BbsDetailDao;
import com.entity.BbsDetail;
import com.common.Assist;
import com.service.BbsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BbsDetailServiceImpl implements BbsDetailService{
    @Autowired
    private BbsDetailDao bbsDetailDao;
    @Override
    public long getBbsDetailRowCount(Assist assist){
        return bbsDetailDao.getBbsDetailRowCount(assist);
    }
    @Override
    public List<BbsDetail> selectBbsDetail(Assist assist){
        return bbsDetailDao.selectBbsDetail(assist);
    }
    @Override
    public BbsDetail selectBbsDetailByObj(BbsDetail obj){
        return bbsDetailDao.selectBbsDetailByObj(obj);
    }
    @Override
    public BbsDetail selectBbsDetailById(Long id){
        return bbsDetailDao.selectBbsDetailById(id);
    }
    @Override
    public int insertBbsDetail(BbsDetail value){
        return bbsDetailDao.insertBbsDetail(value);
    }
    @Override
    public int insertNonEmptyBbsDetail(BbsDetail value){
        return bbsDetailDao.insertNonEmptyBbsDetail(value);
    }
    @Override
    public int insertBbsDetailByBatch(List<BbsDetail> value){
        return bbsDetailDao.insertBbsDetailByBatch(value);
    }
    @Override
    public int deleteBbsDetailById(Long id){
        return bbsDetailDao.deleteBbsDetailById(id);
    }
    @Override
    public int deleteBbsDetail(Assist assist){
        return bbsDetailDao.deleteBbsDetail(assist);
    }
    @Override
    public int updateBbsDetailById(BbsDetail enti){
        return bbsDetailDao.updateBbsDetailById(enti);
    }
    @Override
    public int updateBbsDetail(BbsDetail value, Assist assist){
        return bbsDetailDao.updateBbsDetail(value,assist);
    }
    @Override
    public int updateNonEmptyBbsDetailById(BbsDetail enti){
        return bbsDetailDao.updateNonEmptyBbsDetailById(enti);
    }
    @Override
    public int updateNonEmptyBbsDetail(BbsDetail value, Assist assist){
        return bbsDetailDao.updateNonEmptyBbsDetail(value,assist);
    }

    public BbsDetailDao getBbsDetailDao() {
        return this.bbsDetailDao;
    }

    public void setBbsDetailDao(BbsDetailDao bbsDetailDao) {
        this.bbsDetailDao = bbsDetailDao;
    }

}