package com.service;
import java.util.List;
import com.entity.BbsOrder;
import com.common.Assist;
public interface BbsOrderService{
	/**
	 * 获得BbsOrder数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getBbsOrderRowCount(Assist assist);
	/**
	 * 获得BbsOrder数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<BbsOrder> selectBbsOrder(Assist assist);
	/**
	 * 获得一个BbsOrder对象,以参数BbsOrder对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BbsOrder selectBbsOrderByObj(BbsOrder obj);
	/**
	 * 通过BbsOrder的id获得BbsOrder对象
	 * @param id
	 * @return
	 */
    BbsOrder selectBbsOrderById(Long id);
	/**
	 * 插入BbsOrder到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsOrder(BbsOrder value);
	/**
	 * 插入BbsOrder中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBbsOrder(BbsOrder value);
	/**
	 * 批量插入BbsOrder到数据库
	 * @param value
	 * @return
	 */
    int insertBbsOrderByBatch(List<BbsOrder> value);
	/**
	 * 通过BbsOrder的id删除BbsOrder
	 * @param id
	 * @return
	 */
    int deleteBbsOrderById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除BbsOrder
	 * @param assist
	 * @return
	 */
    int deleteBbsOrder(Assist assist);
	/**
	 * 通过BbsOrder的id更新BbsOrder中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBbsOrderById(BbsOrder enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsOrder中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateBbsOrder(BbsOrder value,  Assist assist);
	/**
	 * 通过BbsOrder的id更新BbsOrder中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBbsOrderById(BbsOrder enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsOrder中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyBbsOrder(BbsOrder value, Assist assist);
}