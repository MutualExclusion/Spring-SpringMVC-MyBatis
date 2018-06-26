package com.dao;
import com.entity.BbsAdmin;
import java.util.List;
import com.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface BbsAdminDao{
	/**
	 * 获得BbsAdmin数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getBbsAdminRowCount(Assist assist);
	/**
	 * 获得BbsAdmin数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<BbsAdmin> selectBbsAdmin(Assist assist);
	/**
	 * 获得一个BbsAdmin对象,以参数BbsAdmin对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    BbsAdmin selectBbsAdminByObj(BbsAdmin obj);
	/**
	 * 通过BbsAdmin的id获得BbsAdmin对象
	 * @param id
	 * @return
	 */
    BbsAdmin selectBbsAdminById(Long id);
	/**
	 * 插入BbsAdmin到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsAdmin(BbsAdmin value);
	/**
	 * 插入BbsAdmin中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyBbsAdmin(BbsAdmin value);
	/**
	 * 批量插入BbsAdmin到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertBbsAdminByBatch(List<BbsAdmin> value);
	/**
	 * 通过BbsAdmin的id删除BbsAdmin
	 * @param id
	 * @return
	 */
    int deleteBbsAdminById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除BbsAdmin
	 * @param assist
	 * @return
	 */
    int deleteBbsAdmin(Assist assist);
	/**
	 * 通过BbsAdmin的id更新BbsAdmin中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateBbsAdminById(BbsAdmin enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsAdmin中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateBbsAdmin(@Param("enti") BbsAdmin value, @Param("assist") Assist assist);
	/**
	 * 通过BbsAdmin的id更新BbsAdmin中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyBbsAdminById(BbsAdmin enti);
 	/**
	 * 通过辅助工具Assist的条件更新BbsAdmin中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyBbsAdmin(@Param("enti") BbsAdmin value, @Param("assist") Assist assist);
}