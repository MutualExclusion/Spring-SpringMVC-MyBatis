package com.dao;
import com.entity.BbsDetail;
import java.util.List;
import com.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface BbsDetailDao{
	/**
	 * 获得BbsDetail数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getBbsDetailRowCount(Assist assist);
	/**
	 * 获得BbsDetail数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<BbsDetail> selectBbsDetail(Assist assist);
	/**
	 * 获得一个BbsDetail对象,以参数BbsDetail对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BbsDetail selectBbsDetailByObj(BbsDetail obj);
	/**
	 * 通过BbsDetail的id获得BbsDetail对象
	 * @param id
	 * @return
	 */
    BbsDetail selectBbsDetailById(Long id);
	/**
	 * 插入BbsDetail到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsDetail(BbsDetail value);
	/**
	 * 插入BbsDetail中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBbsDetail(BbsDetail value);
	/**
	 * 批量插入BbsDetail到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsDetailByBatch(List<BbsDetail> value);
	/**
	 * 通过BbsDetail的id删除BbsDetail
	 * @param id
	 * @return
	 */
    int deleteBbsDetailById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除BbsDetail
	 * @param assist
	 * @return
	 */
    int deleteBbsDetail(Assist assist);
	/**
	 * 通过BbsDetail的id更新BbsDetail中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBbsDetailById(BbsDetail enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsDetail中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateBbsDetail(@Param("enti") BbsDetail value, @Param("assist") Assist assist);
	/**
	 * 通过BbsDetail的id更新BbsDetail中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBbsDetailById(BbsDetail enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsDetail中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyBbsDetail(@Param("enti") BbsDetail value, @Param("assist") Assist assist);
}