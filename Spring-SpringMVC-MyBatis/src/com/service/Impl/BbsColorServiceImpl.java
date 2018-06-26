package com.service.Impl;
import java.util.List;
import com.dao.BbsColorDao;
import com.entity.BbsColor;
import com.common.Assist;
import com.service.BbsColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BbsColorServiceImpl implements BbsColorService{
    @Autowired
    private BbsColorDao bbsColorDao;
    @Override
    public long getBbsColorRowCount(Assist assist){
        return bbsColorDao.getBbsColorRowCount(assist);
    }
    @Override
    public List<BbsColor> selectBbsColor(Assist assist){
        return bbsColorDao.selectBbsColor(assist);
    }
    @Override
    public BbsColor selectBbsColorByObj(BbsColor obj){
        return bbsColorDao.selectBbsColorByObj(obj);
    }
    @Override
    public BbsColor selectBbsColorById(Long id){
        return bbsColorDao.selectBbsColorById(id);
    }
    @Override
    public int insertBbsColor(BbsColor value){
        return bbsColorDao.insertBbsColor(value);
    }
    @Override
    public int insertNonEmptyBbsColor(BbsColor value){
        return bbsColorDao.insertNonEmptyBbsColor(value);
    }
    @Override
    public int insertBbsColorByBatch(List<BbsColor> value){
        return bbsColorDao.insertBbsColorByBatch(value);
    }
    @Override
    public int deleteBbsColorById(Long id){
        return bbsColorDao.deleteBbsColorById(id);
    }
    @Override
    public int deleteBbsColor(Assist assist){
        return bbsColorDao.deleteBbsColor(assist);
    }
    @Override
    public int updateBbsColorById(BbsColor enti){
        return bbsColorDao.updateBbsColorById(enti);
    }
    @Override
    public int updateBbsColor(BbsColor value, Assist assist){
        return bbsColorDao.updateBbsColor(value,assist);
    }
    @Override
    public int updateNonEmptyBbsColorById(BbsColor enti){
        return bbsColorDao.updateNonEmptyBbsColorById(enti);
    }
    @Override
    public int updateNonEmptyBbsColor(BbsColor value, Assist assist){
        return bbsColorDao.updateNonEmptyBbsColor(value,assist);
    }

    public BbsColorDao getBbsColorDao() {
        return this.bbsColorDao;
    }

    public void setBbsColorDao(BbsColorDao bbsColorDao) {
        this.bbsColorDao = bbsColorDao;
    }

}