package com.service;
import java.util.List;
import com.entity.BbsType;
import com.common.Assist;
public interface BbsTypeService{
	/**
	 * 获得BbsType数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getBbsTypeRowCount(Assist assist);
	/**
	 * 获得BbsType数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<BbsType> selectBbsType(Assist assist);
	/**
	 * 获得一个BbsType对象,以参数BbsType对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BbsType selectBbsTypeByObj(BbsType obj);
	/**
	 * 通过BbsType的id获得BbsType对象
	 * @param id
	 * @return
	 */
    BbsType selectBbsTypeById(Long id);
	/**
	 * 插入BbsType到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsType(BbsType value);
	/**
	 * 插入BbsType中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBbsType(BbsType value);
	/**
	 * 批量插入BbsType到数据库
	 * @param value
	 * @return
	 */
    int insertBbsTypeByBatch(List<BbsType> value);
	/**
	 * 通过BbsType的id删除BbsType
	 * @param id
	 * @return
	 */
    int deleteBbsTypeById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除BbsType
	 * @param assist
	 * @return
	 */
    int deleteBbsType(Assist assist);
	/**
	 * 通过BbsType的id更新BbsType中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBbsTypeById(BbsType enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsType中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateBbsType(BbsType value,  Assist assist);
	/**
	 * 通过BbsType的id更新BbsType中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBbsTypeById(BbsType enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsType中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyBbsType(BbsType value, Assist assist);
}