package com.app.market.dao.mapper.crm.mybatis;

import com.app.market.dao.entity.crm.mybatis.CrmCusInfo;
import com.app.market.dao.entity.crm.mybatis.CrmCusInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmCusInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_cus_info
     *
     * @mbggenerated Wed Mar 01 15:35:53 CST 2017
     */
    int countByExample(CrmCusInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_cus_info
     *
     * @mbggenerated Wed Mar 01 15:35:53 CST 2017
     */
    int deleteByExample(CrmCusInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_cus_info
     *
     * @mbggenerated Wed Mar 01 15:35:53 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_cus_info
     *
     * @mbggenerated Wed Mar 01 15:35:53 CST 2017
     */
    int insert(CrmCusInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_cus_info
     *
     * @mbggenerated Wed Mar 01 15:35:53 CST 2017
     */
    int insertSelective(CrmCusInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_cus_info
     *
     * @mbggenerated Wed Mar 01 15:35:53 CST 2017
     */
    List<CrmCusInfo> selectByExample(CrmCusInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_cus_info
     *
     * @mbggenerated Wed Mar 01 15:35:53 CST 2017
     */
    CrmCusInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_cus_info
     *
     * @mbggenerated Wed Mar 01 15:35:53 CST 2017
     */
    int updateByExampleSelective(@Param("record") CrmCusInfo record, @Param("example") CrmCusInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_cus_info
     *
     * @mbggenerated Wed Mar 01 15:35:53 CST 2017
     */
    int updateByExample(@Param("record") CrmCusInfo record, @Param("example") CrmCusInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_cus_info
     *
     * @mbggenerated Wed Mar 01 15:35:53 CST 2017
     */
    int updateByPrimaryKeySelective(CrmCusInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_cus_info
     *
     * @mbggenerated Wed Mar 01 15:35:53 CST 2017
     */
    int updateByPrimaryKey(CrmCusInfo record);
}