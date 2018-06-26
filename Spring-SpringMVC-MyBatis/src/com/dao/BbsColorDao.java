package com.dao;
import com.entity.BbsColor;
import java.util.List;
import com.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface BbsColorDao{
	/**
	 * 获得BbsColor数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getBbsColorRowCount(Assist assist);
	/**
	 * 获得BbsColor数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<BbsColor> selectBbsColor(Assist assist);
	/**
	 * 获得一个BbsColor对象,以参数BbsColor对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BbsColor selectBbsColorByObj(BbsColor obj);
	/**
	 * 通过BbsColor的id获得BbsColor对象
	 * @param id
	 * @return
	 */
    BbsColor selectBbsColorById(Long id);
	/**
	 * 插入BbsColor到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsColor(BbsColor value);
	/**
	 * 插入BbsColor中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBbsColor(BbsColor value);
	/**
	 * 批量插入BbsColor到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsColorByBatch(List<BbsColor> value);
	/**
	 * 通过BbsColor的id删除BbsColor
	 * @param id
	 * @return
	 */
    int deleteBbsColorById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除BbsColor
	 * @param assist
	 * @return
	 */
    int deleteBbsColor(Assist assist);
	/**
	 * 通过BbsColor的id更新BbsColor中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBbsColorById(BbsColor enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsColor中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateBbsColor(@Param("enti") BbsColor value, @Param("assist") Assist assist);
	/**
	 * 通过BbsColor的id更新BbsColor中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBbsColorById(BbsColor enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsColor中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyBbsColor(@Param("enti") BbsColor value, @Param("assist") Assist assist);
}