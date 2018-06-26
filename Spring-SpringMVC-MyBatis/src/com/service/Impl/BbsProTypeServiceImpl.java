package com.service.Impl;
import java.util.List;
import com.dao.BbsProTypeDao;
import com.entity.BbsProType;
import com.common.Assist;
import com.service.BbsProTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BbsProTypeServiceImpl implements BbsProTypeService{
    @Autowired
    private BbsProTypeDao bbsProTypeDao;
    @Override
    public long getBbsProTypeRowCount(Assist assist){
        return bbsProTypeDao.getBbsProTypeRowCount(assist);
    }
    @Override
    public List<BbsProType> selectBbsProType(Assist assist){
        return bbsProTypeDao.selectBbsProType(assist);
    }
    @Override
    public BbsProType selectBbsProTypeByObj(BbsProType obj){
        return bbsProTypeDao.selectBbsProTypeByObj(obj);
    }
    @Override
    public BbsProType selectBbsProTypeById(Long id){
        return bbsProTypeDao.selectBbsProTypeById(id);
    }
    @Override
    public int insertBbsProType(BbsProType value){
        return bbsProTypeDao.insertBbsProType(value);
    }
    @Override
    public int insertNonEmptyBbsProType(BbsProType value){
        return bbsProTypeDao.insertNonEmptyBbsProType(value);
    }
    @Override
    public int insertBbsProTypeByBatch(List<BbsProType> value){
        return bbsProTypeDao.insertBbsProTypeByBatch(value);
    }
    @Override
    public int deleteBbsProTypeById(Long id){
        return bbsProTypeDao.deleteBbsProTypeById(id);
    }
    @Override
    public int deleteBbsProType(Assist assist){
        return bbsProTypeDao.deleteBbsProType(assist);
    }
    @Override
    public int updateBbsProTypeById(BbsProType enti){
        return bbsProTypeDao.updateBbsProTypeById(enti);
    }
    @Override
    public int updateBbsProType(BbsProType value, Assist assist){
        return bbsProTypeDao.updateBbsProType(value,assist);
    }
    @Override
    public int updateNonEmptyBbsProTypeById(BbsProType enti){
        return bbsProTypeDao.updateNonEmptyBbsProTypeById(enti);
    }
    @Override
    public int updateNonEmptyBbsProType(BbsProType value, Assist assist){
        return bbsProTypeDao.updateNonEmptyBbsProType(value,assist);
    }

    public BbsProTypeDao getBbsProTypeDao() {
        return this.bbsProTypeDao;
    }

    public void setBbsProTypeDao(BbsProTypeDao bbsProTypeDao) {
        this.bbsProTypeDao = bbsProTypeDao;
    }

}