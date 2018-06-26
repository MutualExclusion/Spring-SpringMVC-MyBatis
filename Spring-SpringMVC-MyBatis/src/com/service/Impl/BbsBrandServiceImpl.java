package com.service.Impl;
import java.util.List;
import com.dao.BbsBrandDao;
import com.entity.BbsBrand;
import com.common.Assist;
import com.service.BbsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BbsBrandServiceImpl implements BbsBrandService{
    @Autowired
    private BbsBrandDao bbsBrandDao;
    @Override
    public long getBbsBrandRowCount(Assist assist){
        return bbsBrandDao.getBbsBrandRowCount(assist);
    }
    @Override
    public List<BbsBrand> selectBbsBrand(Assist assist){
        return bbsBrandDao.selectBbsBrand(assist);
    }
    @Override
    public BbsBrand selectBbsBrandByObj(BbsBrand obj){
        return bbsBrandDao.selectBbsBrandByObj(obj);
    }
    @Override
    public BbsBrand selectBbsBrandById(Long id){
        return bbsBrandDao.selectBbsBrandById(id);
    }
    @Override
    public int insertBbsBrand(BbsBrand value){
        return bbsBrandDao.insertBbsBrand(value);
    }
    @Override
    public int insertNonEmptyBbsBrand(BbsBrand value){
        return bbsBrandDao.insertNonEmptyBbsBrand(value);
    }
    @Override
    public int insertBbsBrandByBatch(List<BbsBrand> value){
        return bbsBrandDao.insertBbsBrandByBatch(value);
    }
    @Override
    public int deleteBbsBrandById(Long id){
        return bbsBrandDao.deleteBbsBrandById(id);
    }
    @Override
    public int deleteBbsBrand(Assist assist){
        return bbsBrandDao.deleteBbsBrand(assist);
    }
    @Override
    public int updateBbsBrandById(BbsBrand enti){
        return bbsBrandDao.updateBbsBrandById(enti);
    }
    @Override
    public int updateBbsBrand(BbsBrand value, Assist assist){
        return bbsBrandDao.updateBbsBrand(value,assist);
    }
    @Override
    public int updateNonEmptyBbsBrandById(BbsBrand enti){
        return bbsBrandDao.updateNonEmptyBbsBrandById(enti);
    }
    @Override
    public int updateNonEmptyBbsBrand(BbsBrand value, Assist assist){
        return bbsBrandDao.updateNonEmptyBbsBrand(value,assist);
    }

    public BbsBrandDao getBbsBrandDao() {
        return this.bbsBrandDao;
    }

    public void setBbsBrandDao(BbsBrandDao bbsBrandDao) {
        this.bbsBrandDao = bbsBrandDao;
    }

}