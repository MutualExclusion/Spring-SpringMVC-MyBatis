package com.service;
import java.util.List;
import com.entity.BbsProduct;
import com.common.Assist;
public interface BbsProductService{
	/**
	 * 获得BbsProduct数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getBbsProductRowCount(Assist assist);
	/**
	 * 获得BbsProduct数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<BbsProduct> selectBbsProduct(Assist assist);
	/**
	 * 获得一个BbsProduct对象,以参数BbsProduct对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BbsProduct selectBbsProductByObj(BbsProduct obj);
	/**
	 * 通过BbsProduct的id获得BbsProduct对象
	 * @param id
	 * @return
	 */
    BbsProduct selectBbsProductById(Long id);
	/**
	 * 插入BbsProduct到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsProduct(BbsProduct value);
	/**
	 * 插入BbsProduct中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBbsProduct(BbsProduct value);
	/**
	 * 批量插入BbsProduct到数据库
	 * @param value
	 * @return
	 */
    int insertBbsProductByBatch(List<BbsProduct> value);
	/**
	 * 通过BbsProduct的id删除BbsProduct
	 * @param id
	 * @return
	 */
    int deleteBbsProductById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除BbsProduct
	 * @param assist
	 * @return
	 */
    int deleteBbsProduct(Assist assist);
	/**
	 * 通过BbsProduct的id更新BbsProduct中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBbsProductById(BbsProduct enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsProduct中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateBbsProduct(BbsProduct value,  Assist assist);
	/**
	 * 通过BbsProduct的id更新BbsProduct中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBbsProductById(BbsProduct enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsProduct中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyBbsProduct(BbsProduct value, Assist assist);
}