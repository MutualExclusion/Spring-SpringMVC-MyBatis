package com.service;
import java.util.List;
import com.entity.BbsBuyer;
import com.common.Assist;
public interface BbsBuyerService{
	/**
	 * 获得BbsBuyer数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getBbsBuyerRowCount(Assist assist);
	/**
	 * 获得BbsBuyer数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<BbsBuyer> selectBbsBuyer(Assist assist);
	/**
	 * 获得一个BbsBuyer对象,以参数BbsBuyer对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BbsBuyer selectBbsBuyerByObj(BbsBuyer obj);
	/**
	 * 通过BbsBuyer的id获得BbsBuyer对象
	 * @param id
	 * @return
	 */
    BbsBuyer selectBbsBuyerById(Long id);
	/**
	 * 插入BbsBuyer到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsBuyer(BbsBuyer value);
	/**
	 * 插入BbsBuyer中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBbsBuyer(BbsBuyer value);
	/**
	 * 批量插入BbsBuyer到数据库
	 * @param value
	 * @return
	 */
    int insertBbsBuyerByBatch(List<BbsBuyer> value);
	/**
	 * 通过BbsBuyer的id删除BbsBuyer
	 * @param id
	 * @return
	 */
    int deleteBbsBuyerById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除BbsBuyer
	 * @param assist
	 * @return
	 */
    int deleteBbsBuyer(Assist assist);
	/**
	 * 通过BbsBuyer的id更新BbsBuyer中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBbsBuyerById(BbsBuyer enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsBuyer中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateBbsBuyer(BbsBuyer value,  Assist assist);
	/**
	 * 通过BbsBuyer的id更新BbsBuyer中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBbsBuyerById(BbsBuyer enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsBuyer中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyBbsBuyer(BbsBuyer value, Assist assist);
}