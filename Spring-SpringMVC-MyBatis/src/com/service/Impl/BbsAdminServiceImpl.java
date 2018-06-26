package com.service.Impl;
import java.util.List;
import com.dao.BbsAdminDao;
import com.entity.BbsAdmin;
import com.common.Assist;
import com.service.BbsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BbsAdminServiceImpl implements BbsAdminService{
    @Autowired
    private BbsAdminDao bbsAdminDao;
    @Override
    public long getBbsAdminRowCount(Assist assist){
        return bbsAdminDao.getBbsAdminRowCount(assist);
    }
    @Override
    public List<BbsAdmin> selectBbsAdmin(Assist assist){
        return bbsAdminDao.selectBbsAdmin(assist);
    }
    @Override
    public BbsAdmin selectBbsAdminByObj(BbsAdmin obj){
        return bbsAdminDao.selectBbsAdminByObj(obj);
    }
    @Override
    public BbsAdmin selectBbsAdminById(Long id){
        return bbsAdminDao.selectBbsAdminById(id);
    }
    @Override
    public int insertBbsAdmin(BbsAdmin value){
        return bbsAdminDao.insertBbsAdmin(value);
    }
    @Override
    public int insertNonEmptyBbsAdmin(BbsAdmin value){
        return bbsAdminDao.insertNonEmptyBbsAdmin(value);
    }
    @Override
    public int insertBbsAdminByBatch(List<BbsAdmin> value){
        return bbsAdminDao.insertBbsAdminByBatch(value);
    }
    @Override
    public int deleteBbsAdminById(Long id){
        return bbsAdminDao.deleteBbsAdminById(id);
    }
    @Override
    public int deleteBbsAdmin(Assist assist){
        return bbsAdminDao.deleteBbsAdmin(assist);
    }
    @Override
    public int updateBbsAdminById(BbsAdmin enti){
        return bbsAdminDao.updateBbsAdminById(enti);
    }
    @Override
    public int updateBbsAdmin(BbsAdmin value, Assist assist){
        return bbsAdminDao.updateBbsAdmin(value,assist);
    }
    @Override
    public int updateNonEmptyBbsAdminById(BbsAdmin enti){
        return bbsAdminDao.updateNonEmptyBbsAdminById(enti);
    }
    @Override
    public int updateNonEmptyBbsAdmin(BbsAdmin value, Assist assist){
        return bbsAdminDao.updateNonEmptyBbsAdmin(value,assist);
    }

    public BbsAdminDao getBbsAdminDao() {
        return this.bbsAdminDao;
    }

    public void setBbsAdminDao(BbsAdminDao bbsAdminDao) {
        this.bbsAdminDao = bbsAdminDao;
    }

}