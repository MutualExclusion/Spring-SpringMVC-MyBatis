package com.service;
import java.util.List;
import com.entity.BbsBrand;
import com.common.Assist;
public interface BbsBrandService{
	/**
	 * 获得BbsBrand数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getBbsBrandRowCount(Assist assist);
	/**
	 * 获得BbsBrand数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<BbsBrand> selectBbsBrand(Assist assist);
	/**
	 * 获得一个BbsBrand对象,以参数BbsBrand对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BbsBrand selectBbsBrandByObj(BbsBrand obj);
	/**
	 * 通过BbsBrand的id获得BbsBrand对象
	 * @param id
	 * @return
	 */
    BbsBrand selectBbsBrandById(Long id);
	/**
	 * 插入BbsBrand到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsBrand(BbsBrand value);
	/**
	 * 插入BbsBrand中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBbsBrand(BbsBrand value);
	/**
	 * 批量插入BbsBrand到数据库
	 * @param value
	 * @return
	 */
    int insertBbsBrandByBatch(List<BbsBrand> value);
	/**
	 * 通过BbsBrand的id删除BbsBrand
	 * @param id
	 * @return
	 */
    int deleteBbsBrandById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除BbsBrand
	 * @param assist
	 * @return
	 */
    int deleteBbsBrand(Assist assist);
	/**
	 * 通过BbsBrand的id更新BbsBrand中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBbsBrandById(BbsBrand enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsBrand中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateBbsBrand(BbsBrand value,  Assist assist);
	/**
	 * 通过BbsBrand的id更新BbsBrand中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBbsBrandById(BbsBrand enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsBrand中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyBbsBrand(BbsBrand value, Assist assist);
}