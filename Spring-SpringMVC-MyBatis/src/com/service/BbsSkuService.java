package com.service;
import java.util.List;
import com.entity.BbsSku;
import com.common.Assist;
public interface BbsSkuService{
	/**
	 * 获得BbsSku数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getBbsSkuRowCount(Assist assist);
	/**
	 * 获得BbsSku数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<BbsSku> selectBbsSku(Assist assist);
	/**
	 * 获得一个BbsSku对象,以参数BbsSku对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BbsSku selectBbsSkuByObj(BbsSku obj);
	/**
	 * 通过BbsSku的id获得BbsSku对象
	 * @param id
	 * @return
	 */
    BbsSku selectBbsSkuById(Long id);
	/**
	 * 插入BbsSku到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsSku(BbsSku value);
	/**
	 * 插入BbsSku中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBbsSku(BbsSku value);
	/**
	 * 批量插入BbsSku到数据库
	 * @param value
	 * @return
	 */
    int insertBbsSkuByBatch(List<BbsSku> value);
	/**
	 * 通过BbsSku的id删除BbsSku
	 * @param id
	 * @return
	 */
    int deleteBbsSkuById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除BbsSku
	 * @param assist
	 * @return
	 */
    int deleteBbsSku(Assist assist);
	/**
	 * 通过BbsSku的id更新BbsSku中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBbsSkuById(BbsSku enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsSku中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateBbsSku(BbsSku value,  Assist assist);
	/**
	 * 通过BbsSku的id更新BbsSku中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBbsSkuById(BbsSku enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsSku中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyBbsSku(BbsSku value, Assist assist);
}