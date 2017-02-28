package com.app.market.dao.mapper.sys.mybatis;

import com.app.market.dao.entity.sys.mybatis.MgOrgAuth;
import com.app.market.dao.entity.sys.mybatis.MgOrgAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgOrgAuthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mg_org_auth
     *
     * @mbggenerated Tue Feb 28 11:46:24 CST 2017
     */
    int countByExample(MgOrgAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mg_org_auth
     *
     * @mbggenerated Tue Feb 28 11:46:24 CST 2017
     */
    int deleteByExample(MgOrgAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mg_org_auth
     *
     * @mbggenerated Tue Feb 28 11:46:24 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mg_org_auth
     *
     * @mbggenerated Tue Feb 28 11:46:24 CST 2017
     */
    int insert(MgOrgAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mg_org_auth
     *
     * @mbggenerated Tue Feb 28 11:46:24 CST 2017
     */
    int insertSelective(MgOrgAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mg_org_auth
     *
     * @mbggenerated Tue Feb 28 11:46:24 CST 2017
     */
    List<MgOrgAuth> selectByExample(MgOrgAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mg_org_auth
     *
     * @mbggenerated Tue Feb 28 11:46:24 CST 2017
     */
    MgOrgAuth selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mg_org_auth
     *
     * @mbggenerated Tue Feb 28 11:46:24 CST 2017
     */
    int updateByExampleSelective(@Param("record") MgOrgAuth record, @Param("example") MgOrgAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mg_org_auth
     *
     * @mbggenerated Tue Feb 28 11:46:24 CST 2017
     */
    int updateByExample(@Param("record") MgOrgAuth record, @Param("example") MgOrgAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mg_org_auth
     *
     * @mbggenerated Tue Feb 28 11:46:24 CST 2017
     */
    int updateByPrimaryKeySelective(MgOrgAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mg_org_auth
     *
     * @mbggenerated Tue Feb 28 11:46:24 CST 2017
     */
    int updateByPrimaryKey(MgOrgAuth record);
}