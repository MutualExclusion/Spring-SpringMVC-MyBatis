package com.service.Impl;
import java.util.List;
import com.dao.BbsTypeDao;
import com.entity.BbsType;
import com.common.Assist;
import com.service.BbsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BbsTypeServiceImpl implements BbsTypeService{
    @Autowired
    private BbsTypeDao bbsTypeDao;
    @Override
    public long getBbsTypeRowCount(Assist assist){
        return bbsTypeDao.getBbsTypeRowCount(assist);
    }
    @Override
    public List<BbsType> selectBbsType(Assist assist){
        return bbsTypeDao.selectBbsType(assist);
    }
    @Override
    public BbsType selectBbsTypeByObj(BbsType obj){
        return bbsTypeDao.selectBbsTypeByObj(obj);
    }
    @Override
    public BbsType selectBbsTypeById(Long id){
        return bbsTypeDao.selectBbsTypeById(id);
    }
    @Override
    public int insertBbsType(BbsType value){
        return bbsTypeDao.insertBbsType(value);
    }
    @Override
    public int insertNonEmptyBbsType(BbsType value){
        return bbsTypeDao.insertNonEmptyBbsType(value);
    }
    @Override
    public int insertBbsTypeByBatch(List<BbsType> value){
        return bbsTypeDao.insertBbsTypeByBatch(value);
    }
    @Override
    public int deleteBbsTypeById(Long id){
        return bbsTypeDao.deleteBbsTypeById(id);
    }
    @Override
    public int deleteBbsType(Assist assist){
        return bbsTypeDao.deleteBbsType(assist);
    }
    @Override
    public int updateBbsTypeById(BbsType enti){
        return bbsTypeDao.updateBbsTypeById(enti);
    }
    @Override
    public int updateBbsType(BbsType value, Assist assist){
        return bbsTypeDao.updateBbsType(value,assist);
    }
    @Override
    public int updateNonEmptyBbsTypeById(BbsType enti){
        return bbsTypeDao.updateNonEmptyBbsTypeById(enti);
    }
    @Override
    public int updateNonEmptyBbsType(BbsType value, Assist assist){
        return bbsTypeDao.updateNonEmptyBbsType(value,assist);
    }

    public BbsTypeDao getBbsTypeDao() {
        return this.bbsTypeDao;
    }

    public void setBbsTypeDao(BbsTypeDao bbsTypeDao) {
        this.bbsTypeDao = bbsTypeDao;
    }

}