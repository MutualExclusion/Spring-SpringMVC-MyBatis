package com.service;
import java.util.List;
import com.entity.BbsProType;
import com.common.Assist;
public interface BbsProTypeService{
	/**
	 * 获得BbsProType数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getBbsProTypeRowCount(Assist assist);
	/**
	 * 获得BbsProType数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<BbsProType> selectBbsProType(Assist assist);
	/**
	 * 获得一个BbsProType对象,以参数BbsProType对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BbsProType selectBbsProTypeByObj(BbsProType obj);
	/**
	 * 通过BbsProType的id获得BbsProType对象
	 * @param id
	 * @return
	 */
    BbsProType selectBbsProTypeById(Long id);
	/**
	 * 插入BbsProType到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsProType(BbsProType value);
	/**
	 * 插入BbsProType中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBbsProType(BbsProType value);
	/**
	 * 批量插入BbsProType到数据库
	 * @param value
	 * @return
	 */
    int insertBbsProTypeByBatch(List<BbsProType> value);
	/**
	 * 通过BbsProType的id删除BbsProType
	 * @param id
	 * @return
	 */
    int deleteBbsProTypeById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除BbsProType
	 * @param assist
	 * @return
	 */
    int deleteBbsProType(Assist assist);
	/**
	 * 通过BbsProType的id更新BbsProType中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBbsProTypeById(BbsProType enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsProType中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateBbsProType(BbsProType value,  Assist assist);
	/**
	 * 通过BbsProType的id更新BbsProType中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBbsProTypeById(BbsProType enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsProType中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyBbsProType(BbsProType value, Assist assist);
}